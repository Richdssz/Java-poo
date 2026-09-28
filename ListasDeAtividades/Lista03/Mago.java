package ListasDeAtividades.Lista03;

public class Mago extends Personagem {
    private int inteligencia;
    private int mana;

    public Mago(int inteligencia, int mana, String nome, int nivel, int vida) {
        super(nome, nivel, vida);
        this.inteligencia = inteligencia;
        this.mana = mana;
    }

    @Override
    public void ExibirStatus() {
        System.out.println(
                "O mago " + getNome() + " está no nível " + getNivel() + " com a vida atual de " + getVida());
    }

    @Override
    public void atacar(Personagem alvo) {
        System.out.println(getNome() + " lançou Diffindo");
        alvo.receberDano(inteligencia);
        alvo.defender();

    }

    @Override
    public void usarHabilidade(Personagem alvo) {
        alvo.setVida(0);
        System.out.println(getNome() + " usou sua habilidade Avada Kedavra eliminou " + alvo.getNome());
    }

    @Override
    public void defender() {
        int sorteado = (int) (Math.random() * 10) + 1;
        if (sorteado <= 3) {
            curar(inteligencia);
            System.out.println(
                    getNome() + " Se defendeu, e recuperou " + this.inteligencia + "\nVida atual " + getVida());

        } else if (sorteado == 10) {
            curar(100);
            System.out.println(getNome() + " Se defendeu, e recuperou a vida inteira!");

        }
        return;

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
