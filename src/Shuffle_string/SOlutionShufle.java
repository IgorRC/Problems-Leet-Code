package Shuffle_string;

import java.util.HashMap;

public class SOlutionShufle {
    public String restoreString(String s, int[] indices) {
        HashMap<Integer,Character> cadena = new HashMap<>();
        for(int x  = 0 ; x < indices.length ; x++){
            cadena.put(indices[x], s.charAt(x));   
        }
        s = "";
        for(int f = 0 ; f < indices.length ; f++){
            s +=cadena.get(f);
        }
        return s;
    }
}
