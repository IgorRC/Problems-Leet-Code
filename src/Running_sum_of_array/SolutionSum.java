package Running_sum_of_array;

public class SolutionSum {

    /***
     * @author Igor Ramos Cruzado
     * @param nums
     * @return
     */
    public int[] runningSum(int[] nums) {
        int arrSum [] = new int[nums.length];
        for(int i = 0 , x = 0; i < nums.length ;i ++){
            while( x <= i){
                arrSum[i] += nums[x++];
            }
            x = 0;
        }
        return arrSum;
    }
}
