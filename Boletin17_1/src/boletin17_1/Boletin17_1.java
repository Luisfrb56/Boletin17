
package boletin17_1;

import java.util.Arrays;


public class Boletin17_1 {


    public static void main(String[] args) {
        MetodosArray a1=new MetodosArray();
            int[]numeros;
        numeros=MetodosArray.crearArray();
        MetodosArray.amosar(numeros);
       //numeros=MetodosArray.reverse(numeros);
       Arrays.sort(numeros);
        MetodosArray.amosar(numeros);
        
    }
    
}
