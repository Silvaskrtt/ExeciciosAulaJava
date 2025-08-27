package exerc6;

public class Produto {

    private String nome;
    private double preco;
    private double aplicarDesconto;

    public Produto(String nome, double preco, double aplicarDesconto) {
        this.nome = nome;
        this.preco = preco;
        this.aplicarDesconto = aplicarDesconto;
    }

    public Produto() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getAplicarDesconto() {
        return aplicarDesconto;
    }

    public void setAplicarDesconto(double aplicarDesconto) {
        this.aplicarDesconto = aplicarDesconto;
    }
}
