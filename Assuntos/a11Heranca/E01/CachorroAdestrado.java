package Assuntos.a11Heranca.E01;

public class CachorroAdestrado extends Cachorro {

    public CachorroAdestrado(String nome, String raca) {
        super(nome, raca);
    }

    public void deitar() {
        System.out.println(super.nome + " deitou");
    }

    public void rolar() {
        System.out.println(super.nome + " está rolando");
    }

    public void fingirDeMorto() {
        System.out.println(super.nome + " fingiu de morto");
    }

}
