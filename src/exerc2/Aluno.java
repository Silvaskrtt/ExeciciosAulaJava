package exerc2;

public class Aluno {

    private String nome;
    private float nota;

    public Aluno(String nome, float nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public Aluno() {
        // construtor vazio
    }

    // Getter e Setter de nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter e Setter de nome
    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }
}
