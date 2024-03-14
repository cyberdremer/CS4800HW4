package Part2.Macronutrients.Fats;

public class Tuna extends Fats{
    private static final String fatName = "Tuna";


    @Override
    public void getMacronutrientInformation() {
        System.out.println("Description: " + fatName);
    }
}
