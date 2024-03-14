package Part2.Macronutrients.Fats;

public class Avacado extends Fats{
    private static final String  fatName = "Avacado";
    @Override
    public void getMacronutrientInformation() {
        System.out.println("Description: " + fatName);
    }
}
