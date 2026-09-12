package Assuntos.a12ClasseAbstrata.E04;

public class Main {
    public static void main(String[] args) {
        boolean i = false;

        OperacaoMatematica soma = new Soma();
        OperacaoMatematica subtracao = new Subtracao();
        OperacaoMatematica multiplicacao = new Multiplicacao();
        OperacaoMatematica divisao = new Divisao();
        while (i == false) {
            System.out.println("Digite a operação que você deseja realizar");
            while (i) {
                System.out.println(
                        "Digite 1 para soma\nDigite 2 para subtração\nDigite 3 para multiplicação\nDigite 4 para divisão");
            }
        }
    }
}
