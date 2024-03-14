package Part2.Macronutrients.Proteins;

public class Fish extends Protein{
    private static final String proteinName = "Tuna";


    @Override
    public void getMacronutrientInformation() {
        System.out.println("Description: " + proteinName);
    }
}
