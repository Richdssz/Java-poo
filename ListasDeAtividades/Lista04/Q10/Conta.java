package ListasDeAtividades.Lista04.Q10;

import java.math.BigDecimal;

public class Conta {
    private int numero;
    private BigDecimal saldo;

    public Conta(int numero, String saldo) {
        setNumero(numero);
        setSaldo(saldo);
    }

    public int getNumero() {
        return numero;
    }

    private void setNumero(int numero) {
        this.numero = numero;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(String saldo) {
        this.saldo = new BigDecimal(saldo);
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public void transferir(Conta destino, double valor) throws SaldoInsuficienteException {
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor da transferência deve ser maior que zero.");
        }
        if (destino == null) {
            throw new IllegalArgumentException("A conta de destino não pode ser nula.");
        }

        BigDecimal valorBD = BigDecimal.valueOf(valor);
        if (this.saldo.compareTo(valorBD) < 0) {
            throw new SaldoInsuficienteException("Saldo insuficiente na conta " + this.numero + ".");
        }

        this.saldo = this.saldo.subtract(valorBD);
        destino.setSaldo(destino.getSaldo().add(valorBD));
        System.out.printf("Transferência de R$ %.2f da conta %d para a conta %d realizada com sucesso!%n",
                valor, this.numero, destino.getNumero());
    }
}
