package ListasDeAtividades.Lista04.Q3;

public class ContaPoupanca extends ContaBancaria {

    public ContaPoupanca(String titular, double saldo) {
        super(titular, saldo);
    }

    public String sacar(double valor) {
        if (valor <= 0) {
            return "Valor inválido para saque!";
        } else if (getSaldo() >= valor) {
            setSaldo(getSaldo() - valor);
            return "Saque no valor de " + valor + " concluído! " + getSaldo() + " é seu novo saldo!";
        } else {
            return "Saldo insuficiente, deposite e tente novamente!";
        }
    }
}