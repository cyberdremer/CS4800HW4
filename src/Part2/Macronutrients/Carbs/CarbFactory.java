package Part2.Macronutrients.Carbs;

import Part2.Macronutrients.Macronutrient;
import Part2.Macronutrients.MacronutrientFactory;

import javax.swing.plaf.PanelUI;

public class CarbFactory extends MacronutrientFactory {
    private static CarbFactory factory = null;

    private CarbFactory(){}

    public static CarbFactory getInstance(){
        if (factory == null){
            factory = new CarbFactory();
        }
        return factory;
    }
    @Override
    public Macronutrient getMacronutrient(String type){
        switch (type.toLowerCase().strip()){
            case "cheese":
                return new Cheese();
            case "pistachio":
                return new Pistachio();
            case "bread":
                return new Bread();
            case "lentil":
                return new Lentil();
            default:
                return null;
        }
    }
}
