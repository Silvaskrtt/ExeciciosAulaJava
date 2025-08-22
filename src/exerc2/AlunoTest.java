package exerc2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AlunoTest {

    // Função que calcula a média de um vetor de 3 notas
    static float calcularMedia(float[] notas) {
        float soma = 0;
        for (float nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Aluno meuAluno = new Aluno();

        System.out.println("------- Bem-vindo ao Controle de Notas -------");

        try {
            System.out.print("Digite o seu nome: ");
            String theNome = reader.readLine();
            meuAluno.setNome(theNome);

            for (int pos = 0; pos < 3; pos++) {
                System.out.printf("Digite sua " + (pos + 1) + "ª nota: ");
                float theNota = Float.parseFloat(reader.readLine());
                meuAluno.setNota(pos, theNota);
            }

            float resultado = calcularMedia(meuAluno.getNotas());

            // Exibe os resultados
            System.out.println("\n--- Resultado Final ---");
            System.out.println("Nome: " + meuAluno.getNome());
            System.out.printf("Notas: %.2f, %.2f, %.2f\n",
                    meuAluno.getNotas()[0],
                    meuAluno.getNotas()[1],
                    meuAluno.getNotas()[2]);
            System.out.printf("Média: %.2f\n", resultado);

        } catch (IOException e) {
            System.out.println("Erro de entrada/saída: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Erro: Por favor, digite um número válido.");
        }
    }
}
