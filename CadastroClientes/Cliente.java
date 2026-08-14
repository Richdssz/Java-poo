package CadastroClientes;

public class Cliente {
    String nome;
    String rg;
    String cpf;
    Data nascimento;
    Endereco endereco;
    Telefone telefone;

    public Cliente(String nome,String rg, String cpf,Data nascimento, Endereco endereco,Telefone telefone){
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.nascimento = nascimento;
        this.endereco = endereco;
        this.telefone = telefone;
    }
}
