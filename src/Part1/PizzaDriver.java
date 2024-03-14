package Part1;

import java.util.List;

public class PizzaDriver {
    public static void main(String[] args) {
        List<String> pizzaOneToppings = Pizza.PizzaBuilder.menuToppings.subList(0,3);
        Pizza pizzaOne = new Pizza.PizzaBuilder(Pizza.PizzaSize.SMALL).setToppings(pizzaOneToppings).build();
        eat(pizzaOne);

        List<String> pizzaTwoToppings = Pizza.PizzaBuilder.menuToppings.subList(0,6);
        Pizza pizzaTwo = new Pizza.PizzaBuilder(Pizza.PizzaSize.MEDIUM).setToppings(pizzaTwoToppings).build();
        eat(pizzaTwo);

        List<String> pizzaThreeToppings = Pizza.PizzaBuilder.menuToppings.subList(0,9);
        Pizza pizzaThree = new Pizza.PizzaBuilder(Pizza.PizzaSize.LARGE).setToppings(pizzaThreeToppings).build();
        eat(pizzaThree);


        List<String> pizzaHutOneToppings = Pizza.PizzaBuilder.menuToppings.subList(1,4);
        Pizza pizzaHutOne = new Pizza.PizzaBuilder(Pizza.PizzaSize.LARGE).setChain("Pizza Hutt")
                .setToppings(pizzaHutOneToppings).build();
        eat(pizzaHutOne);

        List<String> pizzaHuttTwoToppings = Pizza.PizzaBuilder.menuToppings.subList(4,7);
        Pizza pizzaHutTwo = new Pizza.PizzaBuilder(Pizza.PizzaSize.SMALL).setChain("Pizza Hutt")
                .setToppings(pizzaHuttTwoToppings).build();
        eat(pizzaHutTwo);


        List<String> littleCaesarsOneToppings = Pizza.PizzaBuilder.menuToppings.subList(6,14);
        Pizza littleCaesarsOne = new Pizza.PizzaBuilder(Pizza.PizzaSize.MEDIUM).setChain("Little Caesar")
                .setToppings(littleCaesarsOneToppings).build();
        eat(littleCaesarsOne);

        List<String> littleCaesarsTwoToppings = Pizza.PizzaBuilder.menuToppings.subList(9,15);
        Pizza littleCaesarsTwo = new Pizza.PizzaBuilder(Pizza.PizzaSize.MEDIUM).setChain("Little Caesar")
                .setToppings(littleCaesarsTwoToppings).build();
        eat(littleCaesarsTwo);

        List<String> dominoesOneToppings = Pizza.PizzaBuilder.menuToppings.subList(8,9);
        Pizza dominoesOne = new Pizza.PizzaBuilder(Pizza.PizzaSize.SMALL).setChain("Dominoes").
                setToppings(dominoesOneToppings).build();
        eat(dominoesOne);

        List<String> dominoesTwoToppings = Pizza.PizzaBuilder.menuToppings.subList(10,13);
        Pizza dominoesTwo = new Pizza.PizzaBuilder(Pizza.PizzaSize.SMALL).setChain("Dominoes").
                setToppings(dominoesTwoToppings).build();
        eat(dominoesTwo);




























    }

    public static void eat(Pizza pizza){
        System.out.println(pizza + "\n");

    }

}