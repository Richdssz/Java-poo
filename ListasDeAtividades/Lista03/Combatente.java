package ListasDeAtividades.Lista03;

public interface Combatente {

    public void atacar(Personagem alvo);

    public void defender();

    public void usarHabilidade(Personagem alvo);

    public void receberDano(int dano);

    boolean estaVivo();
}
