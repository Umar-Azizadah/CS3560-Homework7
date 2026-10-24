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

        // Pizza Hut: Large with 3 toppings
        Pizza hutLarge = new Pizza.Builder("Pizza Hut", "Large")
                .addTopping("Pepperoni")
                .addTopping("Sausage")
                .addTopping("Mushrooms")
                .build();

        // Pizza Hut: Small with 2 toppings
        Pizza hutSmall = new Pizza.Builder("Pizza Hut", "Small")
                .addTopping("Bacon")
                .addTopping("Extra Cheese")
                .build();

        // Little Caesars: Medium with 8 toppings
        Pizza caesarsMedium = new Pizza.Builder("Little Caesars", "Medium")
                .addTopping("Pepperoni")
                .addTopping("Sausage")
                .addTopping("Mushrooms")
                .addTopping("Bacon")
                .addTopping("Onions")
                .addTopping("Peppers")
                .addTopping("Olives")
                .addTopping("Extra Cheese")
                .build();

        // Little Caesars: Small with 6 toppings
        Pizza caesarsSmall = new Pizza.Builder("Little Caesars", "Small")
                .addTopping("Ham")
                .addTopping("Chicken")
                .addTopping("Pesto")
                .addTopping("Spinach")
                .addTopping("Beef")
                .addTopping("Extra Cheese")
                .build();

        // Dominos: Small with 1 topping
        Pizza dominosSmall = new Pizza.Builder("Dominos", "Small")
                .addTopping("Pepperoni")
                .build();

        // Dominos: Large with 3 toppings
        Pizza dominosLarge = new Pizza.Builder("Dominos", "Large")
                .addTopping("Chicken")
                .addTopping("Bacon")
                .addTopping("Onions")
                .build();

        // Eat all six pizzas
        hutLarge.eat();
        hutSmall.eat();
        caesarsMedium.eat();
        caesarsSmall.eat();
        dominosSmall.eat();
        dominosLarge.eat();
    }
}