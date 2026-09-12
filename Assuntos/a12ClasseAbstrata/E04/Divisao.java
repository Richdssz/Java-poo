package Assuntos.a12ClasseAbstrata.E04;

public class Divisao extends OperacaoMatematica {
    @Override
    public double Calcula(double a, double b) {
        if (b != 0) {
            return a / b;
        }
        return 0;
    }
}
