
package boletin17_4;


public class Boletin17_4 {

    
       public static void main(String[] args) {
        // TODO code application logic here
    
    DNI dni=new DNI(39489810);
    String[] letter={"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
        System.out.println("Letra: "+dni.calcularLetra(dni.getNif(), letter));
    }
    }
    

