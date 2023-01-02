package How_mani_number;

public class SolutionManyNumber {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int numbers [] = new int [nums.length];
        int coutManyNumber = 0;
        for(int i = 0 ;  i < nums.length ; i++){
            for(int numy : nums){
                if(nums[i] > numy){
                    coutManyNumber++;
                }
            }
            numbers[i] = coutManyNumber;
            coutManyNumber = 0;
        }
        return numbers;
    }
}
