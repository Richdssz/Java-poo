package Assuntos.a09Encapsulamento.exercicioPdf.E01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Departamento d = new Departamento();
        Funcionario f = new Funcionario();
    
        System.out.println("Insira as irformações abaixo...");
        System.out.println("Código do Departamento");
        int cod = s.nextInt();
        s.nextLine();
        d.setCodigo(cod);

        System.out.println("Nome do departamento");
        String nome = s.nextLine();
        d.setNome(nome);

        System.out.println("Matrícula do Funcionário");
        int m = s.nextInt();
        s.nextLine();
        f.setMatricula(m);

        System.out.println("Nome do funcionário");
        String n = s.nextLine();
        f.setNome(n);
        f.setDpto(d);

        System.out.println("\n" + f);

    }
}
