package exerc10;

public class Fatorial {

    // Metodo para calcular o fatorial de um número
    public int calcularFatorial(int n) {
        int resultado = 1;

        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }

        return resultado;
    }
}
