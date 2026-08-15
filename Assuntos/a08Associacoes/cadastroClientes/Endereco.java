package Assuntos.a08Associacoes.cadastroClientes;

public class Endereco {
    String Logradouro;
    int num;
    String bairro;
    String cidade;
    String estado;

    public Endereco(String Logradouro, int num, String bairro, String cidade, String estado) {
        this.Logradouro = Logradouro;
        this.num = num;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }
}
