package Part1;

import java.util.List;

public class PizzaDriver {
    public static void main(String[] args) {


        Pizza threeToppingPizza = new Pizza.PizzaBuilder(Pizza.PizzaSize.LARGE)
                .setToppingBacon().setToppingBeef().setToppingChicken().build();

        Pizza sixToppingPizza = new Pizza.PizzaBuilder(Pizza.PizzaSize.LARGE).
                setToppingHam().setToppingBeef().setToppingOlives().setToppingOnions()
                .setToppingSpicyPork().setToppingTomatoAndBasil().build();

        Pizza nineToppingPizza = new Pizza.PizzaBuilder(Pizza.PizzaSize.LARGE).setToppingBacon()
                .setToppingBeef().setToppingChicken().setToppingExtraCheese().setToppingMushrooms()
                .setToppingOlives().setToppingHamAndPineapple().setToppingPesto().setToppingTomatoAndBasil()
                .build();

        eat(threeToppingPizza);
        eat(sixToppingPizza);
        eat(nineToppingPizza);

        Pizza[] chainPizzas = new Pizza[6];

        chainPizzas[0] = new Pizza.PizzaBuilder(Pizza.PizzaSize.LARGE).setChain("Pizza Hut")
                .setToppingBacon().setToppingHam().setToppingHamAndPineapple().build();

        chainPizzas[1] = new Pizza.PizzaBuilder(Pizza.PizzaSize.SMALL).setChain("Pizza Hut")
                .setToppingChicken().setToppingOnions().build();

        chainPizzas[2] = new Pizza.PizzaBuilder(Pizza.PizzaSize.MEDIUM).setChain("Little Caesars")
                .setToppingBeef().setToppingOnions().setToppingMushrooms().setToppingOlives().setToppingPesto()
                .setToppingExtraCheese().setToppingChicken().setToppingHamAndPineapple().build();

        chainPizzas[3] = new Pizza.PizzaBuilder(Pizza.PizzaSize.SMALL).setChain("Little Casesars")
                .setToppingPeperoni().setToppingHam().setToppingHam().setToppingBacon().setToppingPesto()
                .setToppingSpicyPork().build();

        chainPizzas[4] = new Pizza.PizzaBuilder(Pizza.PizzaSize.SMALL).setChain("Dominos").setToppingSpicyPork()
                .build();

        chainPizzas[5] = new Pizza.PizzaBuilder(Pizza.PizzaSize.LARGE).setToppingPesto().setToppingPeperoni()
                .setToppingSpicyPork().build();

        for (int i = 0; i < chainPizzas.length; i++){
            eat(chainPizzas[i]);
        }









    }

    public static void eat(Pizza pizza){
        System.out.println(pizza + "\n");

    }

}