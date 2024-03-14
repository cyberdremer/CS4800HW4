package Part2.Customer;

import Part2.Macronutrients.Macronutrient;

import java.util.ArrayList;

public class Customer {
    public String name;
    public ArrayList<Macronutrient> Diet;


    public void displayCustomer(){
        System.out.println("Customer name: " + this.name + "\n");
        for(Macronutrient macro : Diet){
            macro.getMacronutrientInformation();
        }

    }

}
