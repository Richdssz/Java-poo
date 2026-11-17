package ListasDeAtividades.Lista04.Q4;

public class PagamentoCartao implements Pagamento {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Processando pagamento via Cartao de Credito/Debito...");
        System.out.printf("Transacao autorizada pela operadora no valor de R$ %.2f%n", valor);
        System.out.println("Comprovante enviado para o cliente.");
    }
}
