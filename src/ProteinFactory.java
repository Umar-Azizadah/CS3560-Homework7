import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class ProteinFactory implements FoodFactory {

    private static final ProteinFactory INSTANCE = new ProteinFactory();

    private ProteinFactory() {
    }

    public static ProteinFactory getInstance() {
        return INSTANCE;
    }

    @Override
    public String getRandomFood(DietPlan dietPlan) {
        List<String> options = new ArrayList<>(
                Arrays.asList("Fish", "Chicken", "Beef", "Tofu")
        );

        switch (dietPlan) {
            case PALEO:
                options.remove("Tofu");
                break;

            case VEGAN:
                options.remove("Fish");
                options.remove("Chicken");
                options.remove("Beef");
                break;

            default:
                break;
        }

        int index = ThreadLocalRandom.current()
                .nextInt(options.size());

        return options.get(index);
    }
}