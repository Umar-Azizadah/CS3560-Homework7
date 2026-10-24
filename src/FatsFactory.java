import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class FatsFactory implements FoodFactory {

    private static final FatsFactory INSTANCE = new FatsFactory();

    private FatsFactory() {
    }

    public static FatsFactory getInstance() {
        return INSTANCE;
    }

    @Override
    public String getRandomFood(DietPlan dietPlan) {
        List<String> options = new ArrayList<>(
                Arrays.asList("Avocado", "Sour cream", "Tuna", "Peanuts")
        );

        switch (dietPlan) {
            case PALEO:
                options.remove("Sour cream");
                break;

            case VEGAN:
                options.remove("Sour cream");
                options.remove("Tuna");
                break;

            case NUT_ALLERGY:
                options.remove("Peanuts");
                break;

            default:
                break;
        }

        int index = ThreadLocalRandom.current()
                .nextInt(options.size());

        return options.get(index);
    }
}