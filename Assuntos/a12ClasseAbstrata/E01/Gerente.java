package Assuntos.a12ClasseAbstrata.E01;

public class Gerente extends Funcionario {

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void aumentaSalario() {
        setSalario(getSalario() * 1.1);
        // set espera o salario novo como argumento, dentro de () acontece
        // getSalario é igual a: x, (x * 1.1)(1000 * 1.1) ->
        // set define queNovo Salário é 1100
    }

    public String toString() {
        return "O gerente se chama: " + getNome() + "\nSeu saláro é: " + getSalario();
    };
}
