package ListasDeAtividades.Lista03;

public abstract class Personagem implements Combatente {
    private String nome;
    private int nivel;
    private int vida;
    private final int vidaMax = 100;

    public Personagem(String nome, int nivel, int vida) {
        setNome(nome);
        setNivel(nivel);
        setVida(vida);
    }

    public void ExibirStatus() {
        System.out.println(
                "O personagem " + getNome() + " está no nível " + getNivel() + " com a vida atual de " + getVida());
    }

    public void curar(int quantidade) {
        int novaVida = this.vida + quantidade;
        if (novaVida <= vidaMax) {
            setVida(novaVida);
        } else {
            setVida(vidaMax);
        }

    }

    // Métodos abstratos
    public abstract void atacar(Personagem alvo);

    public abstract void usarHabilidade(Personagem alvo);

    // Getters
    public String getNome() {
        return nome;
    }

    public int getNivel() {
        return nivel;
    }

    public int getVida() {
        return vida;
    }

    public int getVidaMax() {
        return vidaMax;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void setVida(int vidaNova) {
        if (vidaNova <= vidaMax) {
            this.vida = vidaNova;
        }
    }

}
