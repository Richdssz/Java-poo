package ListasDeAtividades.Lista04.Q4;

public class Main {
    public static void main(String[] args) {
        Pagamento[] pagamentos = new Pagamento[] {
            new PagamentoPix(),
            new PagamentoCartao(),
            new PagamentoBoleto()
        };

        double[] valores = { 150.00, 320.50, 480.00 };

        for (int i = 0; i < pagamentos.length; i++) {
            pagamentos[i].processarPagamento(valores[i]);
        }
    }
}
