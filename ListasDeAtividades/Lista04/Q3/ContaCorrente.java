package ListasDeAtividades.Lista04.Q3;

public class ContaCorrente extends ContaBancaria{

    public ContaCorrente(String titular, double saldo){
        super(titular, saldo);
    }

    public String sacar(double valor) {
        if (valor <= 0) {
            return "Valor inválido para saque!";
        } else if (getSaldo() >= valor + 2) {
            setSaldo(getSaldo() - 2 - valor);
            return "Saque no valor de " + valor + " concluído! " + getSaldo() + " é seu novo saldo! OBS: R$2 em taxas";
        } else {
            return "Saldo insuficiente, deposite e tente novamente!";
        }
    }
}