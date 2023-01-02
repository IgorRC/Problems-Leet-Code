package Kids_with_the_greatest;

import java.util.ArrayList;
import java.util.List;

public class SolutionkidsNumber {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List <Boolean> caramelosRecividos = new ArrayList();
        int dulcesMaximo = 0;
        for(int dulce : candies){
            if(dulce >= dulcesMaximo){
                dulcesMaximo = dulce;
            }
        }
        for(int dulce : candies){
            caramelosRecividos.add(dulce + extraCandies > dulcesMaximo ? true:false);
        }
        return caramelosRecividos;
    }
}
