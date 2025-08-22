package exerc2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AlunoTest {

    // Função que calcular a média do aluno
    static float calcularMedia(float nota1, float nota2, float nota3) {
        float resultado;
        resultado = (nota1 + nota2 + nota3) / 3;
        return resultado;
    }


    public static void main(String[] args) {
        // cria um objeto BufferedReader que vai ler do teclado
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // cria um objeto Aluno e atribui a meuAluno
        Aluno meuAluno = new Aluno();

        // Mensagem de boas-vinda ao user
        System.out.println("------- Bem-vindo ao Controle de Notas -------");

        try {
        // Declarando vetor e variável para o LOOP
        float[] vet = new float[3];
        int pos;

        System.out.print("Digite o seu nome: ");
        String theNome = reader.readLine();
        meuAluno.setNome(theNome);

        for (pos = 0; pos < 3; pos++) {
            System.out.printf("Digite sua " + (pos + 1) + "° nota: ");
            float theNota = Float.parseFloat(reader.readLine());
            meuAluno.setNota(theNota);
            }

            // exibe o nome armazenado no objeto meuAluno
            System.out.println("Nome: "+ meuAluno.getNome());
            System.out.println("Nota: "+ meuAluno.getNota());

            /* --- Exemplo de como chamar a função ---  
            public static void main(String[] args) {
                int resultado = somar(5, 3); // chamando a função
                System.out.println("A soma é: " + resultado);*/

        } catch (IOException e) {
            System.out.println("Erro de entrada/saída: "+ e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Erro: Por favor, digite um número válido.");
        }
    }
}
