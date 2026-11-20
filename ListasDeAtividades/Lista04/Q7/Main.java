package ListasDeAtividades.Lista04.Q7;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            System.out.println("Digite o dividendo");
            int num1 = s.nextInt();
            System.out.println("Digite o divisor");
            int num2 = s.nextInt();
            System.out.println(num1 / num2);
        } catch (ArithmeticException e) {
            System.out.println();
            System.out.println("Erro! não existe divisão por 0!");
        } catch (InputMismatchException e) {
            System.out.println();
            System.out.println("Apenas números inteiros!");

        } finally {
            System.out.println();
            System.out.println("processo finalizado!");
        }
    }

}