package totalweight;

/**
 *
 * @author Tristan Epler
 */
public class TotalWeight {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int weightOfLoaf = 16;
        int numberOfLoaves = 4;
        
        System.out.print("With a weight of "+ weightOfLoaf +" ounces in each loaf, ");
        System.out.println("and a total of "+ numberOfLoaves +" loaves, ");
        int totalWeight = weightOfLoaf*numberOfLoaves;
        System.out.println(" the total weight of all "+ numberOfLoaves +" loaves is "+totalWeight+ " ounces.\n");
    }
}
