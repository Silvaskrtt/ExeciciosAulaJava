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
        if (saque <= saldo) {
            this.saque = saque;
            saldo -= saque;
            System.out.println("Saque no valor de "+ saque + " foi realizado com êxito!");
        } else if (saque > saldo) {
            System.out.println("Saque inválido, o valor de " + saque + " é maior que o saldo atual!");
        } else {
            System.out.println("Saque inválido, não há saldo na conta!");
        }
    }

    public double getDepositar() {
        return depositar;
    }

    public void setDepositar(double depositar) {
        if (depositar > 0) {
        this.depositar = depositar;
        saldo += depositar;
        System.out.println("Depósito no valor de "+ depositar + " foi realizado com êxito!");
        } else {
            System.out.print("O valor que você está tentando depositar é inválido!\n");
        }
    }
}