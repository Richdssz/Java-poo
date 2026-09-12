package ListasDeAtividades.Lista02;

public class Gato extends Animal {

    public Gato(long id, String nome, int idade, double peso) {
        super(id, nome, idade, peso);
        adicionarHabilidade("agilidade");
    }


    @Override 
    public String emitirSom() {
        return "Miau";
    }


}
