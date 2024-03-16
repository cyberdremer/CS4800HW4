package Part1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Pizza {
    private final ArrayList<String> toppings;
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
            pizzaInformation.append(topping +" ");
        }
        return pizzaInformation.toString();


    }


    public static class PizzaBuilder{
        private HashSet<String> pizzaToppings;
        private PizzaSize size;

        private String chainName = "None";


        public PizzaBuilder(PizzaSize size){
            pizzaToppings = new HashSet<>();
            this.size = size;

        }

        public PizzaBuilder setChain(String chainName) {
            this.chainName = chainName;
            return this;

        }

        public PizzaBuilder setToppingPeperoni(){
            pizzaToppings.add("Peperoni");
            return this;
        }

        public PizzaBuilder setToppingSausage(){
            pizzaToppings.add("Sausage");
            return this;
        }

        public PizzaBuilder setToppingMushrooms(){
            pizzaToppings.add("Mushrooms");
            return this;
        }

        public PizzaBuilder setToppingBacon(){
            pizzaToppings.add("Bacon");
            return this;
        }

        public PizzaBuilder setToppingOnions(){
            pizzaToppings.add("Onions");
            return this;
        }

        public PizzaBuilder setToppingExtraCheese(){
            pizzaToppings.add("Extra Cheese");
            return this;
        }

        public PizzaBuilder setToppingPeppers(){
            pizzaToppings.add("Peppers");
            return this;
        }

        public PizzaBuilder setToppingChicken(){
            pizzaToppings.add("Chicken");
            return this;
        }

        public PizzaBuilder setToppingOlives(){
            pizzaToppings.add("Olives");
            return this;

        }

        public PizzaBuilder setToppingSpinach(){
            pizzaToppings.add("Spinach");
            return this;
        }

        public PizzaBuilder setToppingTomatoAndBasil(){
            pizzaToppings.add("Tomato and Basil");
            return this;
        }

        public PizzaBuilder setToppingBeef(){
            pizzaToppings.add("Beef");
            return this;
        }

        public PizzaBuilder setToppingHam(){
            pizzaToppings.add("Ham");
            return this;
        }

        public PizzaBuilder setToppingPesto(){
            pizzaToppings.add("Pesto");
            return this;
        }

        public PizzaBuilder setToppingSpicyPork(){
            pizzaToppings.add("Spicy Pork");
            return this;
        }

        public PizzaBuilder setToppingHamAndPineapple(){
            pizzaToppings.add("Ham and Pineapple");
            return this;
        }






        public Pizza build(){
            ArrayList<String> finalPizzaToppingList = new ArrayList<>();
            finalPizzaToppingList.addAll(this.pizzaToppings);
            Pizza newPizza = new Pizza(this.size, finalPizzaToppingList, this.chainName);
            return newPizza;
        }
    }
}
