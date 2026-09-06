package Assuntos.a11Heranca.EXteams;

public class Desenvolvedor extends Funcionario {
    private String linguagemPrincipal;

    public Desenvolvedor(String nome, String cpf, double salario, String linguagemPrincipal) {
        super(nome, cpf, salario);
        setLinguagemPrincipal(linguagemPrincipal);

    }

    public String getLinguagemPrincipal() {
        return linguagemPrincipal;
    }

    public void setLinguagemPrincipal(String linguagemPrincipal) {
        if (linguagemPrincipal != null && !linguagemPrincipal.isBlank()) {
            this.linguagemPrincipal = linguagemPrincipal;
        }
    }

    @Override
    public String toString() {
        return "    Nome: " + getNome()
                + "\n    CPF: " + getCpf()
                + "\n    Linguagem: " + getLinguagemPrincipal()
                + "\n    Salário: R$ " + String.format("%.2f", getSalario());
    }
}
