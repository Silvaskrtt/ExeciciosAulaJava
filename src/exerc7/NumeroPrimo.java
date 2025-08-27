package exerc7;

public class NumeroPrimo {

    private int numeroPrimo;

    public NumeroPrimo(int numeroPrimo){
        this.numeroPrimo = numeroPrimo;
    }

    public NumeroPrimo() {
        // Construtor vazio
    }

    public int getNumeroPrimo() {
        return numeroPrimo;
    }

    public void setNumeroPrimo(int numeroPrimo) {
        boolean ehPrimo = true;

        if (numeroPrimo <= 1) {
            ehPrimo = false; // 0, 1 e negativos não são primos
        } else {
            for (int pos = 2; pos * pos <= numeroPrimo; pos++) {
                if (numeroPrimo % pos == 0) {
                    ehPrimo = false;
                    break;
                }
            }
        }

        if (ehPrimo) {
            this.numeroPrimo = numeroPrimo;
            System.out.println(numeroPrimo + " é primo!");
        } else {
            System.out.println(numeroPrimo + " NÃO é primo!");
        }
    }
}
