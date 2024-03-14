package Part1;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private final List<String> toppings;
    private final PizzaSize size;

    private final String chainName;


    public enum PizzaSize {
        SMALL, MEDIUM, LARGE
    }

    private Pizza(PizzaSize size, List<String> toppings, String chainName){
        this.size = size;
        this.toppings = new ArrayList<String>();
        for (String topping: toppings){
            this.toppings.add(topping);
        }
        this.chainName = chainName;
    }

    public List<String> getToppings() {
        return this.toppings;
    }

    public PizzaSize getSize() {
        return this.size;
    }

    @Override
    public String toString() {
        StringBuilder pizzaInformation = new StringBuilder();
        pizzaInformation.append("Chain: " + this.chainName + "\n" + "Size: " + this.size.toString() +
                "\nToppings: ");
        for (String topping: this.toppings){
            pizzaInformation.append(topping);
        }
        return pizzaInformation.toString();


    }


    public static class PizzaBuilder{
        private List<String> pizzaToppings;
        private PizzaSize size;

        private String chainName = "None";

        public static final ArrayList<String> menuToppings = new ArrayList<String>();
        static {
            menuToppings.add("Extra Cheese");
            menuToppings.add("Pepperoni");
            menuToppings.add("Mushrooms");
            menuToppings.add("Bacon");
            menuToppings.add("Onions");
            menuToppings.add("Sausage");

            menuToppings.add("Peppers");
            menuToppings.add("Chicken");
            menuToppings.add("Olives");
            menuToppings.add("Spinach");
            menuToppings.add("Tomato and Basil");
            menuToppings.add("Beef");

            menuToppings.add("Ham");
            menuToppings.add("Pesto");
            menuToppings.add("Spicy");
            menuToppings.add("Pork");



        }

        public PizzaBuilder(PizzaSize size){
            this.size = size;

        }

        public PizzaBuilder setChain(String chainName) {
            this.chainName = chainName;
            return this;

        }

        public PizzaBuilder setToppings(List<String> toppings) {
            this.pizzaToppings = new ArrayList<String>();
            for (String topping: toppings){
                this.pizzaToppings.add(topping + " ");
            }
            return this;

        }



        public Pizza build(){
            Pizza newPizza = new Pizza(this.size, this.pizzaToppings, this.chainName);
            return newPizza;
        }
    }
}
