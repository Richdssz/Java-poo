package ListasDeAtividades.Lista04.Q11;

public class Main {
    public static void main(String[] args) {
        try {
            ProdutoDigital gta6 = new ProdutoDigital("GTA 6", 600);
            ProdutoFisico Iphone = new ProdutoFisico("Iphone 18", 600);
            ProdutoFisico samsung = new ProdutoFisico("s25", 0);
            
            Produto[] x = { gta6, Iphone, samsung };
            for (Produto produto : x) {
                System.out.println(produto.getNome() + "- Preço final: " + produto.calcularPrecoFinal());

                if (produto instanceof ProdutoDigital) {
                    System.out.println(
                            produto.getNome() + " - Preço final com desconto: " + ((ProdutoDigital) produto).aplicarDesconto(20.0));
                }
            }

        } catch (PrecoInvalidoException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finalizado!!");
        }
    }
}
