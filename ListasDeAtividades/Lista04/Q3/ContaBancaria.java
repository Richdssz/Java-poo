package ListasDeAtividades.Lista04.Q3;

public abstract class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldo) {
        setSaldo(saldo);
        setTitular(titular);
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double valor) {
        this.saldo = valor;
    }

    public String depositar(double valor){
        if(valor <= 0 ) return "Valor inválido";
        else {
            setSaldo(getSaldo() + valor);
            return "Deposito de " + valor + " concluído! " + "seu novo saldo é " + getSaldo();
        }
    }

    public abstract String sacar(double valor);

    public String consultarSaldo(){
        return "Seu saldo atual é de R$" + getSaldo();
    }

    @Override
    public String toString() {
        return "titular:" + titular  +
                ", saldo:" + saldo;
    }
}
