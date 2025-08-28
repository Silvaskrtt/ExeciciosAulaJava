package exerc8;

public class CarroTest {
    public static void main(String[] args) throws InterruptedException {

        Carro meuCarro = new Carro();

        System.out.println("Iniciando aceleração...");

        // Acelera de 10 em 10 até 180
        while (meuCarro.getVelocidade() < 180) {
            meuCarro.acelerar(10);
            System.out.println("Velocidade: " + meuCarro.getVelocidade() + " km/h");
            Thread.sleep(200); // espera 200ms pra mostrar a subida
        }

        System.out.println("Velocidade máxima atingida!");

        // Agora começa a frear
        System.out.println("\nIniciando frenagem...");
        while (meuCarro.getVelocidade() > 0) {
            meuCarro.frear(15);
            System.out.println("Velocidade: " + meuCarro.getVelocidade() + " km/h");
            Thread.sleep(200); // espera 200ms pra mostrar a descida
        }

        System.out.println("O carro parou!");
    }
}
