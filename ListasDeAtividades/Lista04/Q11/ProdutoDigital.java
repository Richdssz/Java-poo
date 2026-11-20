package ListasDeAtividades.Lista04.Q11;

public class ProdutoDigital extends Produto implements Descontavel {
    public ProdutoDigital(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularPrecoFinal() {
        return getPrecoBase();
    }

    public double aplicarDesconto(double percentual) {
        if(percentual < 0 || percentual > 100){
            throw new IllegalArgumentException("Digite um percentual válido");
        }
        double desconto = getPrecoBase() * (percentual / 100);
        return getPrecoBase() - desconto;
    }
}
