package Part2.Macronutrients.Carbs;

public class Pistachio extends Carb{
    private static final String carbName = "Pistachio";
    @Override
    public void getMacronutrientInformation() {
        System.out.println("Description: " + this.carbName);

    }
}
