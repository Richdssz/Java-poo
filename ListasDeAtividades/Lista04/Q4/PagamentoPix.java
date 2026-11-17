package ListasDeAtividades.Lista04.Q4;

public class PagamentoPix implements Pagamento {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Processando pagamento via Pix...");
        System.out.printf("Transacao autorizada no valor de R$ %.2f%n", valor);
        System.out.println("Comprovante enviado para o cliente.");
    }
}
