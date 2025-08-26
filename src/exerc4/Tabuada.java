package exerc4;

public class Tabuada {

    private int numerosInt;
    private double numerosDouble;

    public Tabuada(int numeroInt, double numerosDouble) {
        this.numerosInt = numeroInt;
        this.numerosDouble = numerosDouble;
    }

    public Tabuada () {

    }

    public int getNumerosInt() {
        return numerosInt;
    }

    public void setNumerosInt(int numerosInt) {
        this.numerosInt = numerosInt;
    }

    public double getNumerosDouble() {
        return numerosDouble;
    }

    public void setNumerosDouble(double numerosDouble) {
        this.numerosDouble = numerosDouble;
    }
}
