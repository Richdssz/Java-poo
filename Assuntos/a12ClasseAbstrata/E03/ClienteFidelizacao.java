package Assuntos.A13Overriding.E02;

public class ClienteFidelizacao extends Cliente {
    private double bonus;
    private String validade;

    public ClienteFidelizacao(String nome, String endereco, InfoCliente infoCliente, double bonus, String validade) {
        super(nome, endereco, infoCliente);
        setBonus(bonus);
        setValidade(validade);
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public void adicionaBonus(double valorCompra) {
        setBonus(getBonus() + (valorCompra * 0.05));
    }

    public double getBonus() {
        return bonus;
    }

    public String getValidade() {
        return validade;
    }

    @Override
    public String toString() {
        return "O cliente " + getNome() + " tem R$ " + getBonus() + " de saldo, com validade de: " + getValidade() + "!";
    }
}
