package Assuntos.A13Overriding.E01;

public abstract class Funcionario {
    private String nome;
    private double Salario;

    public Funcionario(String nome, double Salario) {
        setNome(nome);
        setSalario(Salario);
    }

    public void setSalario(double salario) {
        if (salario < 0) {
            
        }Salario = salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return Salario;
    }

    public String getNome() {
        return nome;
    }

    public void aumentaSalario() {

    }
}
