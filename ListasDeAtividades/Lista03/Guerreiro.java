package ListasDeAtividades.Lista03;

public class Guerreiro extends Personagem {
    private int forca;
    private int defesa;

    public Guerreiro(int forca, int defesa, String nome, int nivel, int vida) {
        super(nome, nivel, vida);
        this.forca = forca;
        this.defesa = defesa;
    }

    @Override
    public void ExibirStatus() {
        System.out.println(
                "O Guerreiro " + getNome() + " está no nível " + getNivel() + " com a vida atual de " + getVida());
    }

    @Override
    public void atacar(Personagem alvo) {
        alvo.receberDano(this.forca);
        System.out.println(alvo.getNome() + " recebeu " + this.forca + " de dano");

        alvo.defender();
        // chance de 20% de se defender
    }

    @Override
    public void usarHabilidade(Personagem alvo) {
        setNivel(50);
        System.out.println(getNome() + " usou sua habilidade");
    }

    @Override
    public void defender() {
        int sorteado = (int) (Math.random() * 10) + 1;
        if (sorteado <= 3) {
            curar(this.defesa);
            System.out.println(getNome() + " Se defendeu, e recuperou " + this.defesa + "\nVida atual " + getVida());

        } else if (sorteado == 10) {
            curar(100);
            System.out.println(getNome() + " Se defendeu, e recuperou a vida inteira!");

        }

    };

    @Override
    public void receberDano(int dano) {
        setVida(getVida() - dano);
    };

    @Override
    public boolean estaVivo() {
        return getVida() > 0;
    };

}
