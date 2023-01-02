package Maximun_number_of_word;

public class SolutionMaximunNumber {
    public int mostWordsFound(String[] sentences) {
        int acumuladorEspacion = 0;
        int numeroMaximoEspacios = 0;
        for(int i = 0 ; i < sentences.length ; i++){
            for (int j = 0 ; j < sentences[i].length() ; j++){
                if(sentences[i].charAt(j) == ' '){
                    acumuladorEspacion++;
                }                
            }
            if(acumuladorEspacion > numeroMaximoEspacios){
                numeroMaximoEspacios = acumuladorEspacion;
            }
            acumuladorEspacion = 0;
        }
        return numeroMaximoEspacios+1;   
    }
}
