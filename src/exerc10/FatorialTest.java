package exerc10;

public class FatorialTest {

    public static void main(String[] args) {
        Fatorial f = new Fatorial();

        int numero = 5;
        int resultado = f.calcularFatorial(numero);

        System.out.printf("O fatorial de %d é: %d\n", numero, resultado);
    }
}