package Assuntos.a07OrientacaoAObjetos.horaEdia;

public class Data {
    int dia;
    int mes;
    int ano;
    Hora hora;

    public Data(int dia, int mes, int ano, Hora hora) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.hora = hora;
    }

    @Override
    public String toString() {
        return this.dia + "/" + this.mes + "/" + this.ano + " - " + this.hora;
    }
    
    public String getDataComBarras() {
        return dia + "-" + mes + "-" + ano;
    }
}
