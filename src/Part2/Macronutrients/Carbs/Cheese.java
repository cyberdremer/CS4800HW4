package Part2.Macronutrients.Carbs;

public class Cheese extends Carb{
    private static final String carbName = "Cheese";
    @Override
    public void getMacronutrientInformation() {
        System.out.println("Description: " + carbName);
    }

}
