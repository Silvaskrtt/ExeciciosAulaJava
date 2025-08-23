package exerc3;

public class ContaBancaria {

    String titular;
    double saldo;
    double saque;
    double depositar;

    public ContaBancaria(String titular, double saldo, double saque, double depositar) {
        this.titular = titular;
        this.saldo = saldo;
        this.saque = saque;
        this.depositar = depositar;
    }

    public ContaBancaria (){
        this.titular = "Usuário Desconhecido";
        this.saldo = 0.0;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaque() {
        return saque;
    }

    public void setSaque(double saque) {
        if (saldo > 0.0) {
            this.saque = saque;
            saldo -= saque;
        } else {
            System.out.println("Saque invãlido, não há saldo na conta!");
        }
    }

    public double getDepositar() {
        return depositar;
    }

    public void setDepositar(double depositar) {
        this.depositar = depositar;
    }
}