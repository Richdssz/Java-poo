package Assuntos.a07OrientacaoAObjetos.horaEdia;

public class Aplicacao {
    public static void main(String[] args) {

        Hora hora = new Hora(10, 30, 45);
        Data data = new Data(14, 8, 2024, hora);
        System.out.println("Data é " + data);
    }
}
