package Number_of_good_paris;

public class SolutionPairs {
    public int numIdenticalPairs(int[] nums) {
        int pairs = 0;
        for(int i = 0 ; i < nums.length ; i ++){
            for( int j = 0 ; j < nums.length ; j++){
                if(nums[i] == nums[j] && i < j){
                    pairs++;
                }
            }
        }
        return pairs;
    }
}
