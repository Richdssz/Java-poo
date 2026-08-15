package Assuntos.a08Associacoes.cadastroClientes;

public class Rodar {
    public static void main(String args[]) {
        Telefone telefone = new Telefone(81, 8191);
        Data data = new Data(14, 05, 2006);
        Endereco endereco = new Endereco("RuaUm", 66, "Curado", "Recife", "Pe");
        Cliente cliente = new Cliente("joão", "1324", "123", data, endereco, telefone);
        System.out.println("O cliente é " + cliente.nome + " " + cliente.cpf);
    }
}
