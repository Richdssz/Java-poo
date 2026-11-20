package ListasDeAtividades.Lista04.Q5;

public class Televisao implements Ligavel {
    @Override
    public void ligar() {
        System.out.println("Tv on");
    }

    @Override
    public void desligar() {
        System.out.println("Tv off");
    }
}
