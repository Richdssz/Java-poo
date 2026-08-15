package Assuntos.a09Encapsulamento.testes;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        // ❌ ERRO DE COMPILAÇÃO: saldo é privado!
        // conta.saldo = 10000; 
        // ✅ FORMA CORRETA: passando pelas regras do método público
        conta.depositar(1000);
        System.out.println(conta.getSaldo()); // Imprime: 1000.0
    }
}
