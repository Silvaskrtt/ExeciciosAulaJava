package exerc7;

import java.util.Scanner;

public class NumeroPrimoTest {

    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {

            NumeroPrimo meuNumPrimo = new NumeroPrimo();

            System.out.println("---------- Bem-vindo ao verificador de número primo ----------");
            System.out.println("Confira os números primos de 1 a 20:");

            for (int i = 1; i <= 20; i++) {
                meuNumPrimo.setNumeroPrimo(i);
            }
        }
    }
}