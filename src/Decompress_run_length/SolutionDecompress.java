package Decompress_run_length;

public class SolutionDecompress {
    public int[] decompressRLElist(int[] nums) {
        int cantidad = 0;
        int result [];
        
        for(int i = 0 ; i < nums.length ; i +=2)
            cantidad += nums[i];

        result = new int[cantidad];
        for(int j = 0, h = 0, aux = 0; j < nums.length; j+=2){
            while(h < nums[j]){
                result[aux+h] = nums[j+1];
                h++;
            }
            aux += h;
            h = 0; 
        }
        return result;
    }

    
}
