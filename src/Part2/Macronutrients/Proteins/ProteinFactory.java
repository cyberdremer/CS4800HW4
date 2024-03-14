package Part2.Macronutrients.Proteins;

import Part2.Macronutrients.Macronutrient;
import Part2.Macronutrients.MacronutrientFactory;

public class ProteinFactory extends MacronutrientFactory {
    private static ProteinFactory factory = null;
    private ProteinFactory(){

    }

    public static ProteinFactory getInstance(){
        if (factory == null){
            factory = new ProteinFactory();
        }
        return factory;
    }
    @Override
    public Macronutrient getMacronutrient(String type) {
        switch (type.toLowerCase().strip()){
            case "fish":
                return new Fish();
            case "chicken":
                return new Chicken();
            case "tofu":
                return new Tofu();
            case "beef":
                return new Beef();
            default:
                return null;
        }
    }
}
