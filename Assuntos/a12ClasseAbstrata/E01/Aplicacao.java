package Assuntos.a12ClasseAbstrata.E01;

import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {

        //Toda a lógica do código foi feita por mim,
        //Pedi que um agente ajustasse a formatação!

        Scanner sc = new Scanner(System.in);
        Funcionario gerente = new Gerente("Daniel", 5000.0);
        Funcionario programador = new Programador("Richard", 3000.0);
        int menuPrincipal = 0;
        int menuImprimir = 0;
        int menuDefinir = 0;
        int c = 0;

        while (menuPrincipal != 3) {

            System.out.println("\n----------------------------------------");
            System.out.println("            MENU PRINCIPAL");
            System.out.println("----------------------------------------");
            System.out.println("[1] Imprimir dados");
            System.out.println("[2] Aumentar salário");
            System.out.println("[3] Sair");
            System.out.println("----------------------------------------");
            System.out.print("Opção > ");
            menuPrincipal = sc.nextInt();

            if (menuPrincipal == 1) {

                // imprimir
                while (menuImprimir != 3) {
                    System.out.println("\n----------------------------------------");
                    if (c <= 0) {
                        System.out.println("        DE QUEM DESEJA IMPRIMIR?");
                    } else {
                        System.out.println("         DESEJA IMPRIMIR OUTRO?");
                    }
                    System.out.println("----------------------------------------");
                    System.out.println("[1] Gerente");
                    System.out.println("[2] Programador");
                    System.out.println("[3] Voltar ao menu principal");
                    System.out.println("----------------------------------------");
                    System.out.print("Opção > ");
                    menuImprimir = sc.nextInt();

                    if (menuImprimir == 1) {
                        c++;
                        System.out.println("\n----------------------------------------");
                        System.out.println("         DADOS DO FUNCIONÁRIO");
                        System.out.println("----------------------------------------");
                        System.out.println(gerente.toString());
                        System.out.println("----------------------------------------");
                    } else if (menuImprimir == 2) {
                        c++;
                        System.out.println("\n----------------------------------------");
                        System.out.println("         DADOS DO FUNCIONÁRIO");
                        System.out.println("----------------------------------------");
                        System.out.println(programador.toString());
                        System.out.println("----------------------------------------");
                    } else if (menuImprimir == 3) {
                        c++;
                        System.out.println("\nVoltando ao menu principal...");
                    } else {
                        System.out.println("\n[!] Digite uma opção válida!");
                    }

                }
                menuImprimir = 0;
                c = 0;
            }

            else if (menuPrincipal == 2) {

                // menu definir
                while (menuDefinir != 3) {
                    System.out.println("\n----------------------------------------");
                    if (c <= 0) {
                        System.out.println("      ESCOLHA DE QUEM AUMENTAR");
                    } else {
                        System.out.println("       DESEJA ESCOLHER OUTRO?");
                    }
                    System.out.println("----------------------------------------");
                    System.out.println("[1] Gerente");
                    System.out.println("[2] Programador");
                    System.out.println("[3] Voltar ao menu principal");
                    System.out.println("----------------------------------------");
                    System.out.print("Opção > ");

                    menuDefinir = sc.nextInt();

                    if (menuDefinir == 1) {
                        c++;
                        double salarioAntigo = gerente.getSalario();
                        gerente.aumentaSalario();
                        double salarioNovo = gerente.getSalario();
                        double aumento = salarioNovo - salarioAntigo;
                        double percentualAumento = (aumento / salarioAntigo);

                        System.out.println("\n----------------------------------------");
                        System.out.println("       AUMENTO SALARIAL APLICADO");
                        System.out.println("----------------------------------------");
                        System.out.printf("• Cargo / Nome:  Gerente %s%n", gerente.getNome());
                        System.out.printf("• De:            R$ %.2f ➜ Para: R$ %.2f%n", salarioAntigo, salarioNovo);
                        System.out.printf("• Reajuste:      +%.2f%% (+ R$ %.2f)%n", (percentualAumento * 100), aumento);
                        System.out.println("----------------------------------------");

                    } else if (menuDefinir == 2) {
                        c++;
                        double salarioAntigo = programador.getSalario();
                        programador.aumentaSalario();
                        double salarioNovo = programador.getSalario();
                        double aumento = salarioNovo - salarioAntigo;
                        double percentualAumento = (aumento / salarioAntigo);

                        System.out.println("\n----------------------------------------");
                        System.out.println("       AUMENTO SALARIAL APLICADO");
                        System.out.println("----------------------------------------");
                        System.out.printf("• Cargo / Nome:  Programador %s%n", programador.getNome());
                        System.out.printf("• De:            R$ %.2f ➜ Para: R$ %.2f%n", salarioAntigo, salarioNovo);
                        System.out.printf("• Reajuste:      +%.2f%% (+ R$ %.2f)%n", (percentualAumento * 100), aumento);
                        System.out.println("----------------------------------------");

                    } else if (menuDefinir == 3) {
                        System.out.println("\nVoltando ao menu principal...");
                    } else {
                        System.out.println("\n[!] Digite uma opção válida!");
                    }

                }
                menuDefinir = 0;
                c = 0;

            } else if (menuPrincipal == 3) {
                System.out.println("\n----------------------------------------");
                System.out.println("           SISTEMA ENCERRADO");
                System.out.println("----------------------------------------");
            } else {
                System.out.println("\n[!] Digite uma opção válida!");
            }

        }
        sc.close();
    }
}
