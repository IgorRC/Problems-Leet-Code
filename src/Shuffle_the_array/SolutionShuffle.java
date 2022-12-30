package Shuffle_the_array;

public class SolutionShuffle {
    public int[] shuffle(int[] nums, int n) {
        int combinacion []= new int[nums.length]; 
        for(int i = 0 , j = 1 , k = 0 ; n < nums.length; i=i+2 , j=j+2){
            combinacion[i] = nums[k++];
            combinacion[j] = nums[n++];
        }
        return combinacion;   
    }
}
