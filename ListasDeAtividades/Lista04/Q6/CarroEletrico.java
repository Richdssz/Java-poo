package ListasDeAtividades.Lista04.Q6;

public class CarroEletrico extends Veiculo implements Eletrico {

    public CarroEletrico(String modelo, int velocidadeatual) {
        super(modelo, velocidadeatual);
    }

    @Override
    public void carregarBateria() {
        System.out.println("Carregando...");
    }

    @Override
    void acelerar() {
        setVelocidadeatual(getVelocidadeatual() + 15);
    }

  

}
