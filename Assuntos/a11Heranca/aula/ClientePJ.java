package Assuntos.a11Heranca.aula;

public class ClientePJ extends Cliente {
    private String cnpj;

    public ClientePJ(String nome, String endereco,String cnpj){
    super(nome, endereco);
    setCnpj(cnpj);
}

    public String getCnpj(){
        return this.cnpj;
    }

    public void setCnpj(String cpnj){
        this.cnpj = cpnj;
    }

    @Override
    public String toString(){
        return "Cliente: " + super.getnome() + "\nEndereço: " + super.getEndereco() + "\nCPNJ: " + getCnpj();
    }
}
