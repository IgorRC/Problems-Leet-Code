package Richest_customer_welath;

public class SolutionCustomer {
    public int maximumWealth(int[][] accounts) {
        int cantidadMaxima = 0;
        int acumuladorCantidad = 0;
        for(int i = 0 ; i < accounts.length ; i ++){
            for (int j = 0 ; j < accounts[i].length ; j++){
                acumuladorCantidad += accounts[i][j];
            }
            if(acumuladorCantidad >= cantidadMaxima){
                cantidadMaxima = acumuladorCantidad;
            }
            acumuladorCantidad = 0;
        }
        return cantidadMaxima;
    }

}
