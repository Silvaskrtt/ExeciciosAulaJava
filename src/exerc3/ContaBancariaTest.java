package exerc3;

import java.util.Scanner;

public class ContaBancariaTest {

    // recursividade para voltar ao menu do programa
    public static void menu(Scanner input, ContaBancaria minhaConta) {
        System.out.print("""
                1. Saldo
                2. Saque
                3. Depositar
                4. Sair
                Digite aqui:\s""");
        int opcaoMenu = input.nextInt();

        if (opcaoMenu == 1) {
            System.out.printf("Saldo atual: %.2f\n", minhaConta.getSaldo());

        } else if (opcaoMenu == 2) {
            System.out.print("Digite o valor que deseja sacar: ");
            double theSaque = input.nextDouble();
            minhaConta.setSaque(theSaque);

        } else if (opcaoMenu == 3) {
            System.out.print("Digite o valor que deseja depositar: ");
            double theDeposito = input.nextDouble();
            minhaConta.setDepositar(theDeposito);

        } else if (opcaoMenu == 4) {
            System.out.println("Fechando a Conta!");
            return; // Encerra a recursão aqui
        } else {
            System.out.println("Opção inválida!");
        }

        // Após qualquer ação (exceto sair), chama o menu de novo
        menu(input, minhaConta);
    }


    public static void main(String[] args) {

        // Cria um novo objeto Scanner para receber dados
        try (Scanner input = new Scanner(System.in)) {

            // cria um objeto e ContaBancaria atribui a minhaConta
            ContaBancaria minhaConta = new ContaBancaria();
            int opcaoMenu, opcaoMenuRollBack;

            // Menu de entrada de dados
            System.out.println("----------- Bem-vindo ao Banco do Senai -----------");
            System.out.print("Digite o seu nome: ");
            String theTitular = input.nextLine();
            minhaConta.setTitular(theTitular);

            //Mensagem de boas-vindas e escolha de opções
            System.out.println("Seja bem vindo " + theTitular + " a sua conta do Senai!");
            System.out.println("Escolha uma das opções abaixo: ");

                System.out.print("""
                        1. Saldo
                        2. Saque
                        3. Depositar
                        4. Sair
                        Digite aqui:\s""");
                opcaoMenu = input.nextInt();

            // Condição para verificar qual opção será acionada
            while (opcaoMenu != 4) {
                // Mostra o saldo atual da conta
                if (opcaoMenu == 1) {
                    System.out.printf("Saldo atual: %.2f\n", minhaConta.getSaldo());

                    // Escolha do usuário
                    System.out.print("""
                            1. Voltar ao Menu
                            2. Sair da conta
                            Selecione uma opção:\s""");
                    opcaoMenuRollBack = input.nextInt();

                    // Verificação para chamar a recursividade ou parar o programa
                    if (opcaoMenuRollBack == 1) {
                        menu(input, minhaConta);
                    } else {
                        System.out.println("Fechando a Conta!");
                    }

                } else if (opcaoMenu == 2) {
                    System.out.print("Digite o valor que deseja sacar: ");
                    double theSaque = input.nextDouble();
                    minhaConta.setSaque(theSaque);

                    // Escolha do usuário
                    System.out.print("""
                            1. Voltar ao Menu
                            2. Sair da conta
                            Selecione uma opção:\s""");
                    opcaoMenuRollBack = input.nextInt();

                    // Verificação para chamar a recursividade ou parar o programa
                    if (opcaoMenuRollBack == 2) {
                        menu(input, minhaConta);
                    } else {
                        System.out.println("Fechando a Conta!");
                    }

                } else if (opcaoMenu == 3){
                    System.out.print("Digite o valor que deseja depositar: ");
                    double theDeposito = input.nextDouble();
                    minhaConta.setDepositar(theDeposito);

                    // Escolha do usuário
                    System.out.print("""
                            1. Voltar ao Menu
                            2. Sair da conta
                            Selecione uma opção:\s""");
                    opcaoMenuRollBack = input.nextInt();

                    // Verificação para chamar a recursividade ou parar o programa
                    if (opcaoMenuRollBack == 1) {
                        menu(input, minhaConta);
                    } else {
                        System.out.println("Fechando a Conta!");
                    }

                } else {
                    System.out.println("Fechando a Conta!");
                }
            }
        }
    }
}
