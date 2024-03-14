package Part2.Macronutrients;

import Part2.Macronutrients.Carbs.CarbFactory;
import Part2.Macronutrients.Fats.FatFactory;
import Part2.Macronutrients.Proteins.ProteinFactory;

public class FactoryCreator {
    private static FactoryCreator factory = null;
    private FactoryCreator(){}

    public static FactoryCreator getInstance(){
        if (factory == null){
            factory = new FactoryCreator();
        }
        return factory;
    }
    public MacronutrientFactory factoryCreator(String type){
        switch (type.toLowerCase().strip()){
            case "fat":
                return FatFactory.getInstance();
            case "carb":
                return CarbFactory.getInstance();
            case "protein":
                return ProteinFactory.getInstance();
            default:
                return null;
        }
    }
}
