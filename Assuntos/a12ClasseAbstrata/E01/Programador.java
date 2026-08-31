package Assuntos.a12ClasseAbstrata.E01;

public class Programador extends Funcionario {

    public Programador(String nome, double salario) {
        super(nome, salario);
    }

    public void aumentaSalario() {
        setSalario(getSalario() * 1.2);
    }

    public String toString() {
        return "O programador se chama: " + getNome() + "\nE seu salário é: " + getSalario();
    }

}
