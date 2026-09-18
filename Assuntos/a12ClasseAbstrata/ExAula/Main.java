import java.util.Scanner;

public class Main{
    public static Scanner sc = new Scanner();

    public static void main(String[]args){
        System.out.println("Olá, O que deseja fazer?");

        Conta Nubank = new Corrente(001, 0);
        Conta Caixa = new Poupanca(001, 0);
        Nubank.depositar(2100);
        System.out.println(Nubank.getSaldo());


    }
}