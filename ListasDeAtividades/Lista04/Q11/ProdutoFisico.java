package ListasDeAtividades.Lista04.Q11;

public class ProdutoFisico extends Produto {
    public ProdutoFisico(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularPrecoFinal() {
        return getPrecoBase() + 15;
    }
}
