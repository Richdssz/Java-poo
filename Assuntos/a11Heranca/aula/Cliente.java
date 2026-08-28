package Assuntos.a11Heranca.aula;

public class Cliente {
    private String nome;
    private String endereco;

    public Cliente(String nome, String endereco){
        setNome(nome);
        setEndereco(endereco);
    }

    public String getnome() {
        return this.nome;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    

}
