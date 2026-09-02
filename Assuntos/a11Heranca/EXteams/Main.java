package Assuntos.a11Heranca.EXteams;

public class Main {
    public static void main(String[] args) {
        Funcionario Marcos = new Gerente("Marcos", "xxxxx", 25, "Vendas");
        Funcionario Richard = new Desenvolvedor("Rich", "xxxxxx", 12.5, "Java");
        Projeto novoInstagram = new Projeto("Newgram", "cópia do instagram", ((Desenvolvedor) Richard));
        Empresa Banco = new Empresa((Gerente) Marcos);

        System.out.println("Dados da empresa");
        System.out.println(Func);
        System.out.println("Dados da empresa");
        System.out.println("Dados da empresa");
        System.out.println("Dados da empresa");

    }
}
