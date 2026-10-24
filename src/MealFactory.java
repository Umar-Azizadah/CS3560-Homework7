public class MealFactory implements MacronutrientFactory {

    private static final MealFactory INSTANCE = new MealFactory();

    private MealFactory() {
    }

    public static MealFactory getInstance() {
        return INSTANCE;
    }

    @Override
    public FoodFactory createCarbsFactory() {
        return CarbsFactory.getInstance();
    }

    @Override
    public FoodFactory createProteinFactory() {
        return ProteinFactory.getInstance();
    }

    @Override
    public FoodFactory createFatsFactory() {
        return FatsFactory.getInstance();
    }
}