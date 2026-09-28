package ListasDeAtividades.Lista03;

public class Main {
    public static void main(String[] args) {
        Personagem maximus = new Guerreiro(25,20,"Máximus Décimus Meridius", 33, 100);
        Personagem harry = new Mago(16,15,"Harry Potter", 16, 100);
        Personagem greenArrow = new Arqueiro(14,20,"Oliver Queen", 33, 100);

        maximus.atacar(harry);
        harry.ExibirStatus();
        greenArrow.usarHabilidade(maximus); 
        System.out.println("Máximus está vivo? " + maximus.estaVivo());
    }
}
