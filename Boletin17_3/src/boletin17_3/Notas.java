//@LuisFernando
package boletin17_3;

public class Notas {
    private int nota;
    private String nome;

    public Notas(int nota, String nome) {
        this.nota = nota;
        this.nome = nome;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Nota: " + nota + " Nome: " + nome;
    }
    
    
}
