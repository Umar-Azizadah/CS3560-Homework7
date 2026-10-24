public class PizzaDriver {
    public static void main(String[] args) {

        // Pizza Hut: Small pizza with 3 toppings
        Pizza smallPizza = new Pizza.Builder("Pizza Hut", "Small")
                .addTopping("Pepperoni")
                .addTopping("Mushrooms")
                .addTopping("Extra Cheese")
                .build();

        // Pizza Hut: Medium pizza with 6 toppings
        Pizza mediumPizza = new Pizza.Builder("Pizza Hut", "Medium")
                .addTopping("Sausage")
                .addTopping("Bacon")
                .addTopping("Onions")
                .addTopping("Peppers")
                .addTopping("Olives")
                .addTopping("Spinach")
                .build();

        // Pizza Hut: Large pizza with 9 toppings
        Pizza largePizza = new Pizza.Builder("Pizza Hut", "Large")
                .addTopping("Pepperoni")
                .addTopping("Sausage")
                .addTopping("Mushrooms")
                .addTopping("Bacon")
                .addTopping("Onions")
                .addTopping("Extra Cheese")
                .addTopping("Chicken")
                .addTopping("Peppers")
                .addTopping("Beef")
                .build();

        smallPizza.eat();
        mediumPizza.eat();
        largePizza.eat();
    }
}