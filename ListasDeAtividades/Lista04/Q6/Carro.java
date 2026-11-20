package ListasDeAtividades.Lista04.Q6;

public class Carro extends Veiculo {
    

    public Carro(String modelo, int velocidadeatual) {
        super(modelo, velocidadeatual);
    }

    @Override
    void acelerar() {
        setVelocidadeatual(getVelocidadeatual() + 10);
    }

}
