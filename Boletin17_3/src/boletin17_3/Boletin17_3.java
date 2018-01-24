//@LuisFernando
package boletin17_3;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;

public class Boletin17_3 {

 
    public static void main(String[] args) {
        MetodosArrayN a1=new MetodosArrayN();
        Random rnd=new Random();
        int[] notas=new int[5];
        
        String nome[]={new String("Luis"),new String("Alberto"),new String ("Tahia"),new String("Fran"),new String("Iria")};
        
        Notas[] nota=new Notas[5];
        for (int f = 0; f < notas.length; f++) {
        int notat=(int)(Math.random()*(10+0));
        }
        a1.amosarept("Luis", notas, nome);
        a1.nomeAp(notas, nome);
        notas=a1.ordenar(notas);
        System.out.println(notas.toString());
        String nomes= JOptionPane.showInputDialog("Dime un nome: ");
        a1.amosarept(nomes, notas, nome);
}
}
