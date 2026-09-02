package Assuntos.a11Heranca.EXteams;

public class Gerente extends Funcionario {
    private String departamento;

    public Gerente(String nome, String cpf, double salario, String departamento) {
        super(nome, cpf, salario);
        setDepartamento(departamento);

    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        if (departamento != null && !departamento.isBlank()) {
            this.departamento = departamento;
        }
    }
}
