package bases;


import java.util.Arrays;
import java.util.List;



public class ex1 {
    public static void main(String[] args) {
        List<Integer> listeNombres= Arrays.asList(9,78,51,0,0,2,6);

        int cpt=0;
        for (int nombre : listeNombres) {
            if(nombre==0){
                cpt++;
            }            
        }
        System.out.println(String.valueOf(cpt) + " fois 0");
    }
}
