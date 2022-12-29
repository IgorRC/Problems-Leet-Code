import Final_value.SolutionValueOperation;

public class Main {
    public static void main(String[] args) {
        String [] operaciones = {"++X","++X","X++"};
        SolutionValueOperation solutionValueOperation = new SolutionValueOperation();
        System.out.println(solutionValueOperation.finalValueAfterOperations(operaciones));
    }
}