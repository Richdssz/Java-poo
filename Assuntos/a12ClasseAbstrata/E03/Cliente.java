package Assuntos.A13Overriding.E02;

public class Cliente {
    private String nome;
    private String endereco;
    private InfoCliente infoCliente;

    public Cliente(String nome, String endereco, InfoCliente infoCliente) {
        setNome(nome);
        setEndereco(endereco);
        setInfoCliente(infoCliente);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setInfoCliente(InfoCliente infoCliente) {
        this.infoCliente = infoCliente;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public InfoCliente getInfoCliente() {
        return infoCliente;
    }
}
