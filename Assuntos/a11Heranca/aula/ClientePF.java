package Assuntos.a11Heranca.aula;

public class ClientePF extends Cliente {
    private String cpf;

    public ClientePF(String nome, String endereco,String cpf){
    super(nome, endereco);
}

    public String getCpf(){
        return this.cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    @Override
    public String toString(){
        return "Cliente: " + super.getnome() + "\nEndereço: " + super.getEndereco() + "\nCPF: " + getCpf();
    }
}
