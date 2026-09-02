package Assuntos.a11Heranca.EXteams;

public class Funcionario {
    private String nome;
    private String cpf;
    private double salario;

    public Funcionario(String nome, String cpf, double salario) {
        setNome(nome); setCpf(cpf);setSalario(salario);
    }

    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.isBlank()) {
            this.nome = nome;
        }
    }

    public void setCpf(String cpf) {
        if (cpf != null && !cpf.isBlank()) {
            this.cpf = cpf;
        }
    }

    public void setSalario(double salario) {
        if (salario > 0) {
            this.salario = salario;
        }
    }

}