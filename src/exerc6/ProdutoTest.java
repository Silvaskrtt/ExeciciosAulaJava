package exerc6;

import java.util.Scanner;

public class ProdutoTest {

    public static double calcPorcentagem(double thePreco, double theAplicarDesconto) {
            double resultado = thePreco * (theAplicarDesconto / 100);
            return resultado;
    }

    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)){

            Produto meuProduto = new Produto();

            String theNome;
            double thePreco = 0.0;
            double theAplicarDesconto;

            System.out.print("Cadastre o nome do produto: ");
            theNome = input.nextLine();
            meuProduto.setNome(theNome);

            System.out.printf("Cadastre o preço do produto %s: ", theNome);
            thePreco = input.nextDouble();
            meuProduto.setPreco(thePreco);

            System.out.printf("Adicione a porcentagem de desconto para %s: ", theNome);
            theAplicarDesconto = input.nextDouble();
            meuProduto.setAplicarDesconto(theAplicarDesconto);

            double resultado = calcPorcentagem(thePreco, theAplicarDesconto);

            if (theAplicarDesconto <= 50.0) {
                System.out.printf("O valor do desconto foi de: %.2f", resultado);
            } else {
                // mensagem de erro
                System.out.printf("O valor de %.0f porcento ultrapassa o limite de desconto.", theAplicarDesconto);
            }
        }
    }
}
