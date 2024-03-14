package Part2.Macronutrients.Proteins;

public class Chicken extends Protein{
    private static final String proteinName = "Chicken";


    @Override
    public void getMacronutrientInformation() {
        System.out.println("Description: " + proteinName);
    }
}
