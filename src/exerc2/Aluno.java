package exerc2;

public class Aluno {

    private String nome;
    private float[] notas;

    public Aluno(String nome, float[] notas) {
        this.nome = nome;
        this.notas = notas;
    }

    public Aluno() {
        this.notas = new float[3]; // Inicializa o vetor de 3 notas
    }

    // Getter e Setter de nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter para o vetor de notas
    public float[] getNotas() {
        return notas;
    }

    // Setter para uma nota específica
    public void setNota(int pos, float nota) {
        if (pos >= 0 && pos < 3) {
            this.notas[pos] = nota;
        } else {
            System.out.println("Posição inválida!");
        }
    }
}