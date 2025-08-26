package exerc4;

import java.util.Scanner;

public class TabuadaTest {

    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {

            Tabuada minhaTabuada = new Tabuada();

            String operador;
            int tamVet, pos, calculoInt = 0;
            double calculoDouble = 0;

            System.out.println("--------- Bem-vindo à Tabuada ---------");

            System.out.print(""" 
                    Digite uma operação que deseje saber a tabuada -> | + | - | ÷ | x |
                    Digite aqui o símbolo da operação: \s""");
            operador = input.nextLine();

            System.out.print("Digite até qual número a tabuada deve ser calculada: ");
            tamVet = input.nextInt();

            // declarada fora para usar depois
            int theNumerosInt = 0;
            double theNumerosDouble = 0;

            if (operador.equals("+") || operador.equals("-") || operador.equals("x")) {
                System.out.print("Digite qual número deseja saber a tabuada: ");
                theNumerosInt = input.nextInt();
                minhaTabuada.setNumerosInt(theNumerosInt);
            } else if (operador.equals("÷")) {
                System.out.print("Digite qual número deseja saber a tabuada: ");
                theNumerosDouble = input.nextDouble();
                minhaTabuada.setNumerosDouble(theNumerosDouble);
            }

            System.out.println("\n---- Resultado da Tabuada ----");

            if (operador.equals("+")) {
                for (pos = 1; pos <= tamVet; pos++) {
                    calculoInt = theNumerosInt + pos;
                    System.out.println(theNumerosInt + " + " + pos + " = " + calculoInt);
                }
            } else if (operador.equals("-")) {
                for (pos = 1; pos <= tamVet; pos++) {
                    calculoInt = theNumerosInt - pos;
                    System.out.println(theNumerosInt + " - " + pos + " = " + calculoInt);
                }
            } else if (operador.equals("x")) {
                for (pos = 1; pos <= tamVet; pos++) {
                    calculoInt = theNumerosInt * pos;
                    System.out.println(theNumerosInt + " x " + pos + " = " + calculoInt);
                }
            } else if (operador.equals("÷")) {
                for (pos = 1; pos <= tamVet; pos++) {
                    calculoDouble = theNumerosDouble / pos;
                    System.out.printf("%.2f ÷ %d = %.2f%n", theNumerosDouble, pos, calculoDouble);
                }
            } else {
                System.out.println("Operador inválido!");
            }
        }
    }
}