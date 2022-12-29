package Final_value;

public class SolutionValueOperation {
    public int finalValueAfterOperations(String[] operations) {
        int finalVAlue = 0;
        for(String operation : operations){
            switch (operation) {
                case "++X":
                    finalVAlue++;
                    break;
                case "X++":
                    finalVAlue++;
                    break;
                case "X--":
                    finalVAlue--;
                    break;
                case "--X":
                    finalVAlue--;
                    break;
                default:
                    break;
            }
        }
        return finalVAlue;
    }
}
