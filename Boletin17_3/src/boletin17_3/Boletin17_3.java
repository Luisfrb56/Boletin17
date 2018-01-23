//@LuisFernando
package boletin17_3;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;

public class Boletin17_3 {

 
    public static void main(String[] args) {
        MetodosArrayN a1=new MetodosArrayN();
        
        int[] notas=new int[5];
        
        String[]nome=new String[5];
        
        Notas[] nota=new Notas[5];
        //Con Math.random me saltaba un error diciendo que tenia que crear la variable Notas en la clase notas como int algo que preferi no hacer y busque esta solución.
        nota[0] =new Notas((int)ThreadLocalRandom.current().nextInt(0, 11), "Alberto");
        nota[1] =new Notas((int)ThreadLocalRandom.current().nextInt(0, 11), "Luis");
        nota[2] =new Notas((int)ThreadLocalRandom.current().nextInt(0, 11), "Fran");
        nota[3] =new Notas((int)ThreadLocalRandom.current().nextInt(0, 11), "Tahia");
        nota[4] =new Notas((int)ThreadLocalRandom.current().nextInt(0, 11), "Pablo");
        for (int f = 0; f < 5; f++) {
            notas[f] = nota[f].getNota();
            nome[f] = nota[f].getNome();
    }
        a1.amosarept("Luis", notas, nome);
        a1.nomeAp(notas, nome);
        notas=a1.ordenar(notas);
        System.out.println(notas.toString());
        String nomes= JOptionPane.showInputDialog("Dime un nome: ");
        a1.amosarept(nomes, notas, nome);
}
}
