package Number_complete;

import java.util.function.BinaryOperator;

public class SolutionCompleteNumber {
    public int findComplement(int num) {
        String binary = "" ;
        for(char character : Integer.toBinaryString(num).toCharArray())
            binary += character == '0' ? '1':'0';
        return  Integer.parseInt(binary, 2);
    }
}
