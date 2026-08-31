package Assuntos.a12ClasseAbstrata.E01;

public class Aplicacao {
    public static void main(String[] args) {

        Funcionario gerente = new Gerente("Carlos", 5000.0);
        Funcionario programador = new Programador("Richard", 3000.0);

        System.out.println(gerente);
        System.out.println(programador);

        gerente.aumentaSalario();
        programador.aumentaSalario();

        System.out.println("\nApós aumento:");
        System.out.println(gerente);
        System.out.println(programador);
    }
}
