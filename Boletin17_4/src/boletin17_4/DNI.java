
package boletin17_4;


public class DNI {
     private float nif;

    public DNI(float nif) {
        this.nif = nif;
    }

    public float getNif() {
        return nif;
    }

    public void setNif(float nif) {
        this.nif = nif;
    }

    public String calcularLetra(float nif, String[] letter) {
        int resto = (int) (nif % 23);
        return letter[resto];

    }
}
