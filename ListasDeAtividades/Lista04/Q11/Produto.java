package ListasDeAtividades.Lista04.Q11;

public abstract class Produto {
    private String nome;
    private double precoBase;

    public Produto(String nome, double precoBase) {
        setNome(nome);
        setPrecoBase(precoBase);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(double precoBase) {
        if (precoBase <= 0) {
            throw new PrecoInvalidoException("Não pode cadastrar com esse valor");
        }
        this.precoBase = precoBase;
    }

    public abstract double calcularPrecoFinal();

}
