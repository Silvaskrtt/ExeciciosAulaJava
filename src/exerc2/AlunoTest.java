package exerc2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class AlunoTest {

    public static

    public static void main(String[] args) {
        // cria um objeto BufferedReader que vai ler do teclado
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Mensagem de boas-vinda ao user
        System.out.println("------- Bem-vindo ao Controle de Notas -------");

        try {
        // Declarando vetor e variável para o LOOP
        float[] vet = new float[3];
        int pos;

        for (pos = 0; pos < 3; pos++) {
            System.out.printf("Digite sua " + (pos + 1) + "° nota: ");
            vet[pos] = Float.parseFloat(reader.readLine());
            }

        System.out.println("Notas Digitas foram:");
        for (pos = 0; pos < 3; pos++) {
            System.out.println("Nota "+ (pos + 1) + ": " + vet[pos]);
            }
        } catch (IOException e) {
            System.out.println("Erro de entrada/saída: "+ e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Erro: Por favor, digite um número válido.");
        }
    }
}
