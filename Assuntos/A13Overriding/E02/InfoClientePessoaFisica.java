package Assuntos.A13Overriding.E02;

public class InfoClientePessoaFisica extends InfoCliente {
    private String cpf;

    public InfoClientePessoaFisica(String cpf) {
        super();
        setCpf(cpf);
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }
}
