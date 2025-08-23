package exerc3;

import java.util.Scanner;

public class ContaBancariaTest {

    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {

            // cria um objeto e ContaBancaria atribui a minhaConta
            ContaBancaria minhaConta = new ContaBancaria();
            int opcao;

            // Menu de entrada de dados
            System.out.println("----------- Bem-vindo ao Banco do Senai -----------");
            System.out.print("Digite o seu nome: ");
            String theTitular = input.nextLine();
            minhaConta.setTitular(theTitular);

            //Mensagem de boas-vindas e escolha de opções
            System.out.println("Seja bem vindo " + theTitular + " a sua conta do Senai!");
            System.out.println("Escolha uma das opções abaixo: ");

            //
            System.out.print("1. Saldo\n" + "2. Saque\n" + "3. Depositar\n" + "Digite aqui: ");
            opcao = input.nextInt();


            if (opcao == 2) {
                System.out.print("Digite o valor que deseja sacar: ");
                double theSaque = input.nextDouble();
                minhaConta.setSaque(theSaque);
            }
        }
    }
}
