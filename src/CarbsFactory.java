import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class CarbsFactory implements FoodFactory {

    private static final CarbsFactory INSTANCE = new CarbsFactory();

    private CarbsFactory() {
    }

    public static CarbsFactory getInstance() {
        return INSTANCE;
    }

    @Override
    public String getRandomFood(DietPlan dietPlan) {
        List<String> options = new ArrayList<>(
                Arrays.asList("Cheese", "Bread", "Lentils", "Pistachio")
        );

        switch (dietPlan) {
            case PALEO:
                options.removeIf(food -> !food.equals("Pistachio"));
                break;

            case VEGAN:
                options.remove("Cheese");
                break;

            case NUT_ALLERGY:
                options.remove("Pistachio");
                break;

            default:
                break;
        }

        int index = ThreadLocalRandom.current()
                .nextInt(options.size());

        return options.get(index);
    }
}