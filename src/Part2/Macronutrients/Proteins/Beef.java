package Part2.Macronutrients.Proteins;

public class Beef extends Protein{
    private static final String proteinName = "Beef";


    @Override
    public void getMacronutrientInformation() {
        System.out.println("Description: " + proteinName);
    }
}
