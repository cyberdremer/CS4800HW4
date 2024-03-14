package Part2.Macronutrients.Fats;

public class SourCream extends Fats{
    private static final String fatName = "Sour Cream";


    @Override
    public void getMacronutrientInformation() {
        System.out.println("Description: " + fatName);
    }
}
