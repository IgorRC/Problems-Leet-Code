package Roman_to_integer;

import java.util.HashMap;
import java.util.Map;

public class ThirteenSolution {
    public int romanToInt(String s) {
        int numeroResultante = 0;
        Map<String,Integer> romanNumerals = new HashMap<>(){{
            put("I", 1);
            put("V", 5);
            put("X", 10);
            put("L", 50);
            put("C", 100);
            put("D", 500);
            put("M", 1000);
        }};
        for(int i = 0 ; i < s.length() ; i++){
            if( i == s.length()-1 || romanNumerals.get(String.valueOf(s.charAt(i))) >= romanNumerals.get(String.valueOf(s.charAt(i+1)))){
                numeroResultante += romanNumerals.get(String.valueOf(s.charAt(i)));
            }else{
                numeroResultante -= (romanNumerals.get(String.valueOf(s.charAt(i))));
            }
        }
        return numeroResultante;
    }
}