package exerc4;

import java.util.Scanner;

public class TabuadaTest {

    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {

            Tabuada minhaTabuada = new Tabuada();

            String operador;
            int tamVet, pos, calculo;

            System.out.println("--------- Bem-vindo a Tabuada ---------");

            System.out.print(""" 
                    Digite uma operação que deseje saber a tabuada -> | + | - | ÷ | x |.
                    Digite aqui o simbólo da operação: \s""");
            operador = input.nextLine();

            System.out.print("Digite até qual número a tabuada deve ser calculada: ");
            tamVet = input.nextInt();

            System.out.print("Digite qual número deseja saber a tabuada: ");
            int theNumero = input.nextInt();
            minhaTabuada.setNumero(theNumero);

            System.out.println("\n---- Resultado da Tabuada ----");

            if (operador.equals("+")) {
                for (pos = 0; pos < tamVet; pos++) {
                    calculo = theNumero + pos;
                    System.out.println(theNumero + "+" + tamVet + "=" + calculo);
                }
            }
        }
    }
}
