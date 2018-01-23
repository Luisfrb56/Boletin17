//@LuisFernando
package boletin17_2;


public class Notas {
   private int nota;

  

    public Notas(int nota) {
        this.nota = nota;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Nota: " + nota;
    }
    
}
