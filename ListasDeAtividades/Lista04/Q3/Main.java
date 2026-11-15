package ListasDeAtividades.Lista04.Q3;

public class Main {
    public static void main(String args[]){
        ContaCorrente caixa = new ContaCorrente("Richard", 100);
        ContaPoupanca nubank = new ContaPoupanca("Silva",2);
        System.out.println(caixa.consultarSaldo());
        System.out.println(caixa.sacar(50));
        System.out.println(nubank.consultarSaldo());
        System.out.println(nubank.sacar(2.01));
        System.out.println(caixa.depositar(100));
        System.out.println(caixa.consultarSaldo());
        System.out.println(caixa);
        System.out.println(nubank.depositar(50));
        System.out.println(nubank.consultarSaldo());
        System.out.println(nubank);
    }
}
