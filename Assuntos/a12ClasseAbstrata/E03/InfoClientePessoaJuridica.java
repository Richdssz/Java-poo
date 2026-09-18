package Assuntos.A13Overriding.E02;

public class InfoClientePessoaJuridica extends InfoCliente {
    private String cnpj;

    public InfoClientePessoaJuridica(String cpnj){
        super();
        setCnpj(cpnj);
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public String getCnpj() {
        return cnpj;
    }
}
