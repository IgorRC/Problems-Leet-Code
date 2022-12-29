package Reverse_Integer;

public class SolutionReverse {
    /**
     * 
     * numero por validar : 1534236469
     * 
     * @author Igor Ramos Cruzado
     * @param x
     * @return
     */
    public int reverse(int x) {
        boolean negativo = false;
        if( x < 0 ){
            x = x*(-1);
            negativo = true;
        }
        int reversoNumero = 0;
        int auxNumero = x;
        byte longitud = 0;
        while(auxNumero > 0){
            auxNumero/=10;
            longitud++;
        }
        for(int i = 0 ; i < longitud ; i++){
            reversoNumero = reversoNumero*10 + (x%10);
            x/=10;
        }
        if(negativo == true){
            reversoNumero = reversoNumero*(-1);
        }
        return reversoNumero;
    }
}
