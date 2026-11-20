package ListasDeAtividades.Lista04.Q7.exemplos;

/*
 * Exemplo 1: Estrutura Basica do try-catch
 * 
 * O bloco 'try' contem o codigo que pode falhar em tempo de execucao.
 * Se ocorrer um erro, a JVM pula imediatamente para o bloco 'catch' compativel.
 */
public class Exemplo01_Basico {
    public static void main(String[] args) {

        
        System.out.println("--- Inicio do Programa ---");

        try {
            String textoInteiro = "x";

            
            System.out.println("Resultado do parse: " + Integer.parseInt(textoInteiro));

        } catch (NumberFormatException e) {
            // O objeto 'e' guarda informacoes valiosas sobre o erro ocorrido:
            System.out.println("\n[ERRO CAPTURADO COM SUCESSO]");
            System.out.println("Tipo da excecao: " + e.getClass().getSimpleName());
            System.out.println("Mensagem interna da JVM: " + e.getMessage());
            System.out.println("Mensagem amigavel para o usuario: Nao e permitida divisao por zero!");
        }

        System.out.println("\n--- Fim do Programa (o programa nao travou!) ---");
    }
}
