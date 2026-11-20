package ListasDeAtividades.Lista04.Q7.exemplos;

import java.util.Scanner;
import java.util.InputMismatchException;

/*
 * Exemplo 3: O papel do bloco 'finally'
 * 
 * O bloco 'finally' SEMPRE e executado:
 * - Se o 'try' rodar com sucesso ate o fim -> o 'finally' executa.
 * - Se der erro e cair no 'catch' -> o 'finally' executa logo apos o catch.
 * - Mesmo se houver um 'return' dentro do try ou do catch -> o 'finally' executa antes de sair!
 * 
 * Uso principal: Fechar conexoes de banco de dados, arquivos ou o Scanner.
 */
public class Exemplo03_Finally {
    public static void main(String[] args) {
        System.out.println("--- Teste 1: Fluxo que gera ERRO ---");
        executarOperacao("10", "0");

        System.out.println("\n-------------------------------------");

        System.out.println("--- Teste 2: Fluxo com SUCESSO ---");
        executarOperacao("10", "2");
    }

    public static void executarOperacao(String entradaA, String entradaB) {
        try {
            System.out.println("[TRY]: Convertendo e dividindo...");
            int a = Integer.parseInt(entradaA);
            int b = Integer.parseInt(entradaB);
            int resultado = a / b;
            System.out.println("[TRY]: Sucesso! Resultado = " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("[CATCH]: Capturou divisao por zero!");

        } finally {
            // Observe que esta mensagem aparece TANTO no teste 1 quanto no teste 2:
            System.out.println("[FINALLY]: Limpeza de recursos e encerramento da operacao.");
        }
    }
}
