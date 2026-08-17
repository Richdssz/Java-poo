package Assuntos.a07OrientacaoAObjetos.horaEdia;

public class Aplicacao {
    public static void main(String[] args) {

        Hora hora = new Hora(10, 30, 45);
        Data data = new Data(14, 8, 2024, hora);
        data.dia = 2;
        System.out.print("Data é " + data.toString());

        
        data.getDataComBarras();
    }
}
