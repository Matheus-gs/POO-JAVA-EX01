import java.util.Scanner;

public class Pessoa {

     String nome;
     String numero;

     Endereco endereco = new Endereco();

     Scanner scan = new Scanner(System.in);

    public void setEndereco() {

        System.out.println("\n Informe a cidade ");
        this.endereco.cidade = scan.nextLine();

        System.out.println("\n Informe o estado ");
        this.endereco.estado = scan.nextLine();

        System.out.println("\n Informe o logradouro ");
        this.endereco.logradouro = scan.nextLine();

        System.out.println("\n Endereco cadastrado com sucesso!");
    };

    public void getEndereco() {
        System.out.println("\n Cidade: " + this.endereco.cidade);
        System.out.println("\n Estado: " + this.endereco.estado);
        System.out.println("\n Logradouro: " + this.endereco.logradouro);
    };

    public void setNome() {
        System.out.println("\n Informe o seu nome ");
        this.nome = scan.nextLine();

        System.out.println("\n Nome cadastrado com sucesso!");
    };

    public void getNome() {
        System.out.println("\n Nome: " + this.nome);
    };

}
