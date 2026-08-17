package Assuntos.a07OrientacaoAObjetos.pooPessoas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pessoa Rich = new Pessoa("richard", 20, 67f, "macho", "676767", "Homo-sapiens", 67);
        Pessoa Joao = new Pessoa("Junin", 67, 67f, "Alpha", "9739458", "Homo-erectus", 76);

        Rich.andar(67);
        Rich.aniversario();
        System.out.println("");
        System.out.println(Joao.idade);
        Rich.andar(67);
        Rich.andar(67);
        Rich.andar(67);

        Circulo c = new Circulo(5);

        c.Area();
        c.comprimento();
        sc.close();
    }
}
