package ListasDeAtividades.Lista04.Q6;

public abstract class Veiculo {
    private String modelo;
    private int velocidadeatual;

    abstract void acelerar();

    public Veiculo(String modelo, int velocidadeatual) {
        setModelo(modelo);
        setVelocidadeatual(velocidadeatual);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidadeatual() {
        return this.velocidadeatual;
    }

    public void setVelocidadeatual(int velocidadeatual) {
        this.velocidadeatual = velocidadeatual;
    }

}
