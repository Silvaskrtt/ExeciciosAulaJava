package exerc8;

public class Carro {
    private int velocidade;

    public Carro() {
        this.velocidade = 0; // começa parado
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void acelerar(int incremento) {
        if (velocidade + incremento <= 180) {
            velocidade += incremento;
        } else {
            velocidade = 180; // trava no limite
        }
    }

    public void frear(int decremento) {
        if (velocidade - decremento >= 0) {
            velocidade -= decremento;
        } else {
            velocidade = 0; // trava em 0
        }
    }
}