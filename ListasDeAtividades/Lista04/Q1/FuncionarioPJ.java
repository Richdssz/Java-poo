public class FuncionarioPJ extends Funcionario {

    public FuncionarioPJ(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
       return super.getSalarioBase() * 0.95;
    }

}
