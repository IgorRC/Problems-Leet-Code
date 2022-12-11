package Median_of__two_sorted_Arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FourSolution {

    /*
    Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
    The overall run time complexity should be O(log (m+n)).
    * */
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int lista [] = new int[nums1.length + nums2.length];
        int index = 0;
        for(int numero : nums1)
            lista[index++] = numero;
        for(int numero : nums2)
            lista[index++] = numero;

        List <Integer> a = (ArrayList<Integer>)Arrays.stream(lista).boxed().collect(Collectors.toList());
        Collections.sort(a);
        if(a.size()%2 == 0){
            int length = a.size();
            return (double)(a.get((length/2)-1) + a.get(length/2))/2;
        }else{
            int length = a.size();
            return a.get(length/2);
        }
    }
}
