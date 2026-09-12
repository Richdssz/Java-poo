package Assuntos.A13Overriding.E02;

public class Main {
    public static void main(String[] args) {
        InfoCliente infoCli1 = new InfoClientePessoaFisica("xxxx");
        InfoCliente infoCli2 = new InfoClientePessoaJuridica("xxxx");

        ClienteFidelizacao cf = new ClienteFidelizacao("Alirio", "rua 1, do lado da rua 2", infoCli1, 0, "98 anos");
        ClienteFidelizacaoEspecial cfe = new ClienteFidelizacaoEspecial("Italo", "rua 2, do lado da rua 3", infoCli2, 0, "51 anos");

        cf.adicionaBonus(100);
        cf.adicionaBonus(100);
        System.out.println(cf.getBonus());
        System.out.println();
        cfe.adicionaBonus(100);
        cfe.adicionaBonus(100);
        System.out.println(cfe.getBonus());
        System.out.println(cf);
        System.out.println(cfe);
    }

}
