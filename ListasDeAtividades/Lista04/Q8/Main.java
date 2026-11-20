package ListasDeAtividades.Lista04.Q8;

public class Main {
    public static void main(String[] args) {
        cadastrarProduto("Teclado", 150.0, 5);
        cadastrarProduto("", 100.0, 2);
        cadastrarProduto("Mouse", 0.0, 3);
        cadastrarProduto("Monitor", 800.0, -1);
    }

    public static void cadastrarProduto(String nome, double preco, int quantidade) {
        try {
            Produto p = new Produto(nome, preco, quantidade);
            System.out.printf("Produto cadastrado: %s | Preço: R$ %.2f | Qtd: %d%n",
                    p.getNome(), p.getPreco(), p.getQuantidade());
        } catch (IllegalArgumentException e) {
            System.out.println("Falha no cadastro: " + e.getMessage());
        }
    }
}
