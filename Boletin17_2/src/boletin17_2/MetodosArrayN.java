//@LuisFernando
package boletin17_2;

import javax.swing.JOptionPane;


public class MetodosArrayN {
    public MetodosArrayN(){
        
    }
    public void nMedia(int[] notas) {
        float nMedia;
        float suma = 0;
        for (int f = 0; f < notas.length; f++) {
            suma = suma + notas[f];
        }
        nMedia = suma / notas.length;
        System.out.println("Nota media: " + nMedia);
    }

    public void nAlta(int[] notas) {
        int mayor = 0;
        for (int f = 0; f < notas.length; f++) {
            if (notas[f] >= mayor) {
                mayor = notas[f];
            }
        }
        System.out.println("Nota mas alta de clase: " + mayor);
    }

    public void aprobados(int[] notas) {
        int aprobados = 0;
        for (int f = 0; f < notas.length; f++) {
            if (notas[f] >= 5) {
                aprobados++;
            }
        }
        System.out.println("Cantidad de Aprobados: " + aprobados);
        System.out.println("Cantidad de Suspensos: " + (notas.length - aprobados));
    }
     public void amosar(int[] notas) {
        for (int f = 0; f < notas.length; f++) {
            System.out.println(notas[f]);
        }
} 
}

