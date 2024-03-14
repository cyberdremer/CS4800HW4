package Part2.Macronutrients.Proteins;

public class Tofu extends Protein{
    private static final String proteinName = "Tofu";


    @Override
    public void getMacronutrientInformation() {
        System.out.println("Description: " + proteinName);
    }
}
