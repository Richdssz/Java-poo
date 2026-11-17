package ListasDeAtividades.Lista04.Q4;
public class PagamentoBoleto implements Pagamento {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Processando emissao de Boleto Bancario...");
        System.out.printf("Boleto gerado no valor de R$ %.2f%n", valor);
        System.out.println("Aguardando compensacao bancaria (prazo de ate 3 dias uteis).");
    }
}
