package restrictionmapping;

public class RestrictionMapping {

    //set we will be working with
    public int[] L;

    public static void main(String[] args) {
        getUserAction();
    }

    public static int[] BruteForcePDP() {
        int[] x = new int[L.length - 2];
        
        return x;
    }

    public static int[] AnotherBruteForcePDP() {
        int[] x = new int[L.length - 2];
        
        return x;
    }
    
    public static void PartialDigest(int decision){
        int[] x;
        if(decision == 1){
            x = BruteForcePDP();
        }else if(decision == 2){
            x = AnotherBruteForcePDP();
        }
        
        
    }

    public static void getUserAction() {
        System.out.println("Motif Finder: Brandon Hafenrichter");
        System.out.println("");
        System.out.println("1. Retrieve Sequence from a file");
        System.out.println("2. Run Restriction Mapping Algorithms");
        System.out.println("3. Exit the program");
        KeyboardInputClass input = new KeyboardInputClass();
        String decision = input.getKeyboardInput("");

        switch (decision) {
            case "1":
                retrieveSet();
                break;
            case "2":
                executePDPAlgorithms();
                break;
            case "3":
                System.exit(-1);
                break;
            default:
                System.out.println("Invalid Input Please try again.");
                getUserAction();
        }
    }

    private static void executePDPAlgorithms() {
        System.out.println("1. Partial Digest Brute Force Algorithm");
        System.out.println("2. Another Partial Digest Brute Force Algorithm");
        KeyboardInputClass input = new KeyboardInputClass();
        String decision = input.getKeyboardInput("");
        switch(decision){
            case "1":
                PartialDigest(1);
                break;
            case "2":
                PartialDigest(2);
                break;
            default:
                System.out.println("Invalid Response.  Please try again.");
                executePDPAlgorithms();
        }
    }

    public static void retrieveSet() {
        TextFileClass textFile = new TextFileClass();
        textFile.getFileName("Specify the text file to be read:");
        textFile.getFileContents();

    }
}
