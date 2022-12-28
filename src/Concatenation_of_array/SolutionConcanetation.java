package Concatenation_of_array;

public class SolutionConcanetation {
    public int[] getConcatenation(int[] nums) {
        int concatenation [] = new int[nums.length*2];
        for(int i = 0 , y = 0; i < nums.length*2 ; i++){
            concatenation[i]  = (i < nums.length) ? nums[i]:nums[y++];
        }
        return concatenation;
    }
}
