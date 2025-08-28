package exerc9;

import java.util.Scanner;

public class UsuarioTest {

    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {

            Usuario meuUsuario = new Usuario();

            String cadastroLogin;
            String cadastroSenha;

            int chance = 3;

            System.out.println("---- Bem-vindo! Cadastre-se no Site ----");

            System.out.print("Digite o seu Usuário: ");
            cadastroLogin = input.nextLine();
            meuUsuario.setLogin(cadastroLogin);

            System.out.print("Digite sua senha: ");
            cadastroSenha = input.nextLine();
            meuUsuario.setSenha(cadastroSenha);

            System.out.println("Conta criada com sucesso!\n");

            System.out.println("---- Faça o login para Acessar o Site ----");

            while (chance > 0) {
                System.out.print("Digite o seu Usuário: ");
                String loginTentativa = input.nextLine();

                System.out.print("Digite sua senha: ");
                String senhaTentativa = input.nextLine();

                if (loginTentativa.equals(cadastroLogin) && senhaTentativa.equals(cadastroSenha)) {
                    System.out.println("O login foi efetuado com sucesso!");
                    break; // encerra o while
                } else {
                    chance--;
                    System.out.printf(" Usuário ou senha incorretos! Você tem %d tentativas restantes.\n", chance);
                }
            }

            if (chance == 0) {
                System.out.println("Conta bloqueada! Você excedeu o número de tentativas.");
            }
        }
    }
}
