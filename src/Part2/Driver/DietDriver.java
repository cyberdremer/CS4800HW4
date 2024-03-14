package Part2.Driver;

import Part2.Customer.Customer;
import Part2.Macronutrients.Carbs.Bread;
import Part2.Macronutrients.Carbs.Carb;
import Part2.Macronutrients.Carbs.CarbFactory;
import Part2.Macronutrients.Carbs.CarbType;
import Part2.Macronutrients.FactoryCreator;
import Part2.Macronutrients.Fats.FatFactory;
import Part2.Macronutrients.Fats.FatType;
import Part2.Macronutrients.Fats.Fats;
import Part2.Macronutrients.Macronutrient;
import Part2.Macronutrients.MacronutrientFactory;
import Part2.Macronutrients.Proteins.ProteinType;

import java.awt.*;
import java.util.*;

public class DietDriver {
    public static void main(String[] args){
        HashMap<Integer, DietType> dietTable = initializeChoices(4);
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 6; i++){
            displayMenu();
            Customer customer = new Customer();
            int choice = input.nextInt();
            System.out.println("Enter your name: ");
            input.nextLine();
            String name = input.nextLine();
            customer.name = name;

            DietType dietChoice = dietTable.get(choice);
            switch (dietChoice){
                case NORESTRICTION ->
                    customer.Diet = noRestrictionDiet();
                case PALEO ->
                    customer.Diet = paleoDiet();
                case NONUT ->
                    customer.Diet = noNutDiet();
                case VEGAN ->
                    customer.Diet = veganDiet();
                default ->
                    customer.Diet = null;


            }
            customer.displayCustomer();




        }








    }


    public static ArrayList<Macronutrient> noRestrictionDiet(){
        ArrayList<Macronutrient> diet = new ArrayList<>();
        FactoryCreator macroNutrient = FactoryCreator.getInstance();
        MacronutrientFactory carbFactory = macroNutrient.factoryCreator("carb");
        MacronutrientFactory fatFactory = macroNutrient.factoryCreator("fat");
        MacronutrientFactory proteinFactory = macroNutrient.factoryCreator("protein");

        Random random = new Random();
        CarbType carbType = CarbType.values()[random.nextInt(CarbType.values().length)];
        ProteinType proteinType = ProteinType.values()[random.nextInt(ProteinType.values().length)];
        FatType fatType = FatType.values()[random.nextInt(FatType.values().length)];

        Macronutrient carb = carbFactory.getMacronutrient(carbType.toString());
        Macronutrient fat = fatFactory.getMacronutrient(fatType.toString());
        Macronutrient protein = proteinFactory.getMacronutrient(proteinType.toString());
        diet.add(carb);
        diet.add(fat);
        diet.add(protein);

        return diet;








    }

    public static ArrayList<Macronutrient> paleoDiet(){
        ArrayList<Macronutrient> diet = new ArrayList<>();
        FactoryCreator macroNutrient = FactoryCreator.getInstance();
        MacronutrientFactory carbFactory = macroNutrient.factoryCreator("carb");
        MacronutrientFactory fatFactory = macroNutrient.factoryCreator("fat");
        MacronutrientFactory proteinFactory = macroNutrient.factoryCreator("protein");

        Random random = new Random();
        CarbType carbType = CarbType.values()[random.nextInt(CarbType.values().length)];
        while (!carbType.equals(CarbType.PISTACHIO)){
            carbType = CarbType.values()[random.nextInt(CarbType.values().length)];
        }
        ProteinType proteinType = ProteinType.values()[random.nextInt(ProteinType.values().length)];
        while (proteinType.equals(ProteinType.TOFU)){
            proteinType = ProteinType.values()[random.nextInt(ProteinType.values().length)];
        }
        FatType fatType = FatType.values()[random.nextInt(FatType.values().length)];
        while (fatType.equals(FatType.SOURCREAM)){
            fatType = FatType.values()[random.nextInt(FatType.values().length)];
        }

        Macronutrient carb = carbFactory.getMacronutrient(carbType.toString());
        Macronutrient fat = fatFactory.getMacronutrient(fatType.toString());
        Macronutrient protein = proteinFactory.getMacronutrient(proteinType.toString());

        diet.add(carb);
        diet.add(fat);
        diet.add(protein);
        return diet;



    }

    public static ArrayList<Macronutrient> veganDiet(){
        ArrayList<Macronutrient> diet = new ArrayList<>();
        FactoryCreator macroNutrient = FactoryCreator.getInstance();
        MacronutrientFactory carbFactory = macroNutrient.factoryCreator("carb");
        MacronutrientFactory fatFactory = macroNutrient.factoryCreator("fat");
        MacronutrientFactory proteinFactory = macroNutrient.factoryCreator("protein");

        Random random = new Random();
        CarbType carbType = CarbType.values()[random.nextInt(CarbType.values().length)];
        while (carbType.equals(CarbType.CHEESE)){
            carbType = CarbType.values()[random.nextInt(CarbType.values().length)];
        }
        ProteinType proteinType = ProteinType.values()[random.nextInt(ProteinType.values().length)];
        while ( proteinType.equals(ProteinType.CHICKEN) | proteinType.equals(ProteinType.FISH) ){
            proteinType = ProteinType.values()[random.nextInt(ProteinType.values().length)];
        }
        FatType fatType = FatType.values()[random.nextInt(FatType.values().length)];
        while (fatType.equals(FatType.SOURCREAM) | fatType.equals(FatType.TUNA)){
            fatType = FatType.values()[random.nextInt(FatType.values().length)];
        }

        Macronutrient carb = carbFactory.getMacronutrient(carbType.toString());
        Macronutrient fat = fatFactory.getMacronutrient(fatType.toString());
        Macronutrient protein = proteinFactory.getMacronutrient(proteinType.toString());

        diet.add(carb);
        diet.add(fat);
        diet.add(protein);
        return diet;

    }

    public static ArrayList<Macronutrient> noNutDiet(){
        ArrayList<Macronutrient> diet = new ArrayList<>();
        FactoryCreator macroNutrient = FactoryCreator.getInstance();
        MacronutrientFactory carbFactory = macroNutrient.factoryCreator("carb");
        MacronutrientFactory fatFactory = macroNutrient.factoryCreator("fat");
        MacronutrientFactory proteinFactory = macroNutrient.factoryCreator("protein");

        Random random = new Random();
        CarbType carbType = CarbType.values()[random.nextInt(CarbType.values().length)];
        while (carbType.equals(CarbType.PISTACHIO)){
            carbType = CarbType.values()[random.nextInt(CarbType.values().length)];
        }
        ProteinType proteinType = ProteinType.values()[random.nextInt(ProteinType.values().length)];
        FatType fatType = FatType.values()[random.nextInt(FatType.values().length)];
        while (fatType.equals(FatType.PEANUT) ){
            fatType = FatType.values()[random.nextInt(FatType.values().length)];
        }

        Macronutrient carb = carbFactory.getMacronutrient(carbType.toString());
        Macronutrient fat = fatFactory.getMacronutrient(fatType.toString());
        Macronutrient protein = proteinFactory.getMacronutrient(proteinType.toString());

        diet.add(carb);
        diet.add(fat);
        diet.add(protein);
        return diet;

    }


    public static void displayMenu(){
        System.out.println("Enter your desired diet: " +
                "\n(1). No restriction\n" +
                "(2). Paleo\n" +
                "(3). Vegan\n" +
                "(4). Nut Allergy\n");

    }

    public static HashMap<Integer, DietType> initializeChoices(int numDiets){
        HashMap<Integer, DietType> dietTable = new HashMap<>();
        for (DietType diet: DietType.values() ){
            dietTable.put(diet.ordinal() + 1, diet);
        }
        return dietTable;
    }

}
