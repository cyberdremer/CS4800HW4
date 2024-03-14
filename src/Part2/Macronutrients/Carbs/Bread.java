package Part2.Macronutrients.Carbs;

public class Bread extends Carb{
    private static final String carbName = "Bread";
    @Override
    public void getMacronutrientInformation() {
        System.out.println("Description: " + carbName);

    }
}
