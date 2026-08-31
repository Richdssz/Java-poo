package Assuntos.a12ClasseAbstrata.E01;

public abstract class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        setNome(nome);
        setSalario(salario);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.isBlank() && nome.length() > 3) {
            this.nome = nome;
        }
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        if (salario >= 0) {
            this.salario = salario;
        }
    }

    public abstract void aumentaSalario();

    public abstract String toString();

}
