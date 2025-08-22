import java.util.Scanner;

public class PessoaTest
{
    public static void main(String[] args)
    {
        // cria um objeto Scanner para obter entrada a partir da janela de comando
        Scanner input = new Scanner(System.in);

        // cria um objeto e Pessoa atribui a minhaPessoa
        Pessoa minhaPessoa = new Pessoa();

        System.out.println("---------- Criar Identidade ----------");

        // Entrada de dados do usuário
        System.out.print("Digite o seu nome: ");
        String theNome = input.nextLine();
        minhaPessoa.setNome(theNome);

        System.out.print("Digite a sua idade: ");
        int theIdade = input.nextInt();
        minhaPessoa.setIdade(theIdade);
        input.nextLine(); // limpa o buffer do Enter


        System.out.print("Digite a sua altura: ");
        String theAltura = input.nextLine();
        minhaPessoa.setAltura(theAltura);

        System.out.print("Digite a sua CPF: ");
        String theCpf = input.nextLine();
        minhaPessoa.setCpf(theCpf);

        // exibe o nome armazenado no objeto minhaPessoa
        System.out.println("========= Registro Geral =========");
        System.out.println("Nome: " + minhaPessoa.getNome());
        System.out.println("Idade: " + minhaPessoa.getIdade());
        System.out.println("Altura: " + minhaPessoa.getAltura());
        System.out.println("CPF: " + minhaPessoa.getCpf());

        input.close();
    }
}