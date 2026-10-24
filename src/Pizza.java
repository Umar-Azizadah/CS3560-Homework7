import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private final String chain;
    private final String size;
    private final List<String> toppings;

    private Pizza(Builder builder) {
        this.chain = builder.chain;
        this.size = builder.size;
        this.toppings = new ArrayList<>(builder.toppings);
    }

    public void eat() {
        System.out.println("Pizza Chain: " + chain);
        System.out.println("Size: " + size);
        System.out.println("Toppings: " + toppings);
        System.out.println();
    }

    public static class Builder {
        private final String chain;
        private final String size;
        private final List<String> toppings;

        public Builder(String chain, String size) {
            if (!size.equalsIgnoreCase("Small") &&
                    !size.equalsIgnoreCase("Medium") &&
                    !size.equalsIgnoreCase("Large")) {
                throw new IllegalArgumentException(
                        "Size must be Small, Medium, or Large"
                );
            }

            this.chain = chain;
            this.size = size;
            this.toppings = new ArrayList<>();
        }

        public Builder addTopping(String topping) {
            toppings.add(topping);
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }
}