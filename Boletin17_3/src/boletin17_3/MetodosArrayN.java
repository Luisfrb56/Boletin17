//@LuisFernando
package boletin17_3;

import java.util.Arrays;


public class MetodosArrayN {

   public MetodosArrayN(){
       
   }
   
public void nMedia(int[] nota) {
        float nMedia;
        float suma = 0;
        for (int f = 0; f < nota.length; f++) {
            suma = suma + nota[f];
        }
        nMedia = suma / nota.length;
        System.out.println("Nota media: " + nMedia);
    }

    public void nAlta(int[] nota) {
        int mayor = 0;
        for (int f = 0;  f< nota.length; f++) {
            if (nota[f] >= mayor) {
                mayor = nota[f];
            }
        }
        System.out.println("Nota mas alta de la clase: " + mayor);
    }

    public void aprobados(int[] nota) {
        int aprobados = 0;
        for (int f = 0; f < nota.length; f++) {
            if (nota[f] >= 5) {
                aprobados++;
            }
        }
        System.out.println("Cantidad de Aprobados: " + aprobados);
        System.out.println("Cantidad de Suspensos: " + (nota.length - aprobados));
    }

    public void amosar(int[] notas) {
        for (int f = 0; f < notas.length; f++) {
            System.out.println(notas[f]);
        }
    }

    public void nomeAp(int[] nota, String[] nomes) {
        for (int f = 0; f < nota.length; f++) {
            if (nota[f] >= 5) {
                System.out.println(nomes[f]);
            }
        }
    }

    public void amosarept(String nome, int[] notas, String[] nomes) {
        for (int i = 0; i < notas.length; i++) {
            if (nomes[i].equals(nome)) {
                System.out.println("Nota de " + nomes + ":" + notas[i]);
            }
        }
    }
    public int[] ordenar(int[] nota){
        Arrays.sort(nota);
        return nota;
    }
}
