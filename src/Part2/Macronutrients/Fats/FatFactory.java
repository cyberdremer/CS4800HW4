package Part2.Macronutrients.Fats;

import Part2.Macronutrients.Macronutrient;
import Part2.Macronutrients.MacronutrientFactory;

public class FatFactory extends MacronutrientFactory {
    private static FatFactory factory = null;

    private FatFactory(){}


    public static FatFactory getInstance(){
        if (factory == null){
            factory = new FatFactory();
        }
        return factory;
    }
    @Override
    public Macronutrient getMacronutrient(String type) {
        switch (type.toLowerCase().strip()){
            case "avacado":
                return new Avacado();
            case "peanut":
                return new Peanut();
            case "sourcream":
                return new SourCream();
            case "tuna":
                return new Tuna();
            default:
                return null;

        }
    }
}
