package ListasDeAtividades.Lista04.Q10;

public class Main {
    public static void main(String[] args) {
        Conta a = new Conta(1, "500.00");
        Conta b = new Conta(2, "100.00");

        realizarTransferencia(a, b, 200.00);
        realizarTransferencia(a, b, 0.00);
        realizarTransferencia(a, null, 50.00);
        realizarTransferencia(a, b, 1000.00);

        System.out.println("\n--- Saldos Finais ---");
        System.out.println("Conta " + a.getNumero() + ": R$ " + a.getSaldo());
        System.out.println("Conta " + b.getNumero() + ": R$ " + b.getSaldo());
    }

    public static void realizarTransferencia(Conta origem, Conta destino, double valor) {
        try {
            origem.transferir(destino, valor);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro de saldo: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Erro de argumento: " + e.getMessage());
        }
    }
}
