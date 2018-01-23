//@LuisFernando
package boletin17_2;


public class Boletin17_2 {

    
    public static void main(String[] args) {
        MetodosArrayN a1=new MetodosArrayN();
        int[] notas=new int[30];
        Notas[] nota=new Notas[30];
        
       for (int f = 0; f < 30; f++) {
           nota[f] = new Notas((int) (Math.random()*10)+1);
           notas[f] = nota[f].getNota();

        } 
       a1.aprobados(notas);
       a1.nAlta(notas);
       a1.nMedia(notas);
    }
    
}
