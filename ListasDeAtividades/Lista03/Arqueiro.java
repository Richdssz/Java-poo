package ListasDeAtividades.Lista03;

public class Arqueiro extends Personagem {
    private int agilidade;
    private int flechas;

    public Arqueiro(int agilidade, int flechas, String nome, int nivel, int vida) {
        super(nome, nivel, vida);
        this.agilidade = agilidade;
        this.flechas = flechas;
    }

    @Override
    public void ExibirStatus() {
        System.out.println(
                "O Arqueiro " + getNome() + " está no nível " + getNivel() + " com a vida atual de " + getVida());
    }

    @Override
    public void atacar(Personagem alvo) {
        if (flechas > 0) {
            flechas--;

            System.out.println(getNome() + " disparou uma flecha!");
            alvo.receberDano(agilidade);
            alvo.defender();
            // chance de 20% de se defender

        } else {
            System.out.println("Flechas insuficientes!");
        }

    }

    @Override
    public void usarHabilidade(Personagem alvo) {
        alvo.setVida(0);
        System.out.println(getNome() + " usou sua habilidade tiro certeiro e eliminou " + alvo.getNome());
    }

    @Override
    public void defender() {
        int sorteado = (int) (Math.random() * 10) + 1;
        if (sorteado <= 3) {
            curar(agilidade);
            System.out.println(getNome() + " Se defendeu, e recuperou " + this.agilidade + "\nVida atual " + getVida());
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
