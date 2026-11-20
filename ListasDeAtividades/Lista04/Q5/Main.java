package ListasDeAtividades.Lista04.Q5;

/*
 * Por que uma classe pode implementar varias interfaces em Java?
 * 
 * Em Java, nao existe heranca multipla de classes (uma classe so pode herdar de uma superclasse direta com 'extends')
 * para evitar ambiguidades como o "Problema do Diamante" (conflito de implementacoes e estado de atributos).
 * 
 * Porem, uma classe pode implementar multiplas interfaces ('implements A, B') porque as interfaces definem apenas
 * contratos de comportamento (o que fazer, e nao como fazer). A propria classe concreta e quem fornece a implementacao
 * dos metodos, eliminando ambiguidades e permitindo que um objeto assuma diferentes papeis no sistema.
 */
public class Main {
    public static void main(String[] args) {
        Televisao samsung = new Televisao();
        Roteador tpLink = new Roteador();
        Computador pichau = new Computador();

        System.out.println("--- Televisao ---");
        samsung.ligar();
        samsung.desligar();

        System.out.println("\n--- Roteador ---");
        tpLink.ligar();
        tpLink.conectarInternet();
        tpLink.desligar();

        System.out.println("\n--- Computador ---");
        pichau.ligar();
        pichau.conectarInternet();
        pichau.desligar();
    }
}
