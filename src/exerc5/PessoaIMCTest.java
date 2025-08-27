package exerc5;

import java.util.Scanner;

public class PessoaIMCTest {

    public static double calcIMC(double thePeso, double theAltura) {
        double resultado;
        resultado = thePeso / (theAltura * theAltura);
        return resultado;
    }

    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {

            PessoaIMC meuIMC = new PessoaIMC();

            // variáveis do programa
            double theAltura = 0;
            double thePeso = 0;
            String theNome;

            // Mensagem de boas-vindas ao usuário
            System.out.println("------ Bem-vindo(a) a calculadora de IMC ------");

            System.out.print("Qual o seu nome: ");
            theNome = input.nextLine();
            meuIMC.setNome(theNome);

            System.out.print("Por favor digite sua altura:");
            theAltura = input.nextDouble();
            meuIMC.setAltura(theAltura);

            System.out.print("Por favor, digite seu peso:");
            thePeso = input.nextDouble();
            meuIMC.setPeso(thePeso);

            double resultado = calcIMC(thePeso, theAltura);

            if (resultado >=30) {
                System.out.printf("Calculo do IMC: %.2f você está com Obesidade.", resultado);
            } else if (resultado >= 25.0  && resultado < 29.9) {
                System.out.printf("Calculo do IMC: %.2f você está com Sobrepeso.", resultado);
            } else if (resultado >= 18.5 && resultado < 24.9) {
                System.out.printf("Calculo do IMC: %.2f você está com Peso normal.", resultado);
            } else {
                System.out.printf("Calculo do IMC: %.2f você está com Magreza.", resultado);
            }
        }
    }
}
