package ListasDeAtividades.Lista04.Q6;

public class Main {
    public static void main(String[] args) {
        Carro fiat = new Carro("palio 2011", 0);
        CarroEletrico byd = new CarroEletrico("King 2025", 0);

        Veiculo[] veiculos = { fiat, byd };
        for (Veiculo veiculo : veiculos) {
            System.out.println("Modelo: " + veiculo.getModelo());
            veiculo.acelerar();
            System.out.println("Velocidade atual: " + veiculo.getVelocidadeatual() + " km/h");

            if (veiculo instanceof Eletrico e) {
                e.carregarBateria();
            }
        }
    }
}
