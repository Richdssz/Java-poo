package ListasDeAtividades.Lista04.Q7.exemplos;

/*
 * Exemplo 2: Multiplos blocos 'catch' e Hierarquia
 * 
 * Um unico bloco 'try' pode correr riscos de naturezas diferentes:
 * 1. O usuario pode digitar uma letra em vez de numero (NumberFormatException / InputMismatchException).
 * 2. O usuario pode digitar zero como divisor (ArithmeticException).
 * 3. Pode acontecer outro erro inesperado (Exception generica).
 * 
 * REGRA DE OURO: Sempre coloque os catchs mais especificos (subclasses)
 * PRIMEIRO, e os mais genericos (Exception) por ULTIMO.
 */
public class Exemplo02_MultiplosCatch {
    public static void main(String[] args) {
        // Simulando entradas que vieram de um formulario, teclado ou arquivo:
        String textoNumero1 = "20";
        String textoNumero2 = "zero"; // Entrada invalida (texto em vez de digito)

        try {
            System.out.println("Tentando converter os textos para inteiros...");
            int n1 = Integer.parseInt(textoNumero1);
            int n2; // Dispara NumberFormatException aqui!

            System.out.println("Dividindo os valores...");
            int resultado = n1 / n2;
            System.out.println("Resultado: " + resultado);

        } catch (NumberFormatException e) {
            System.out.println("[Catch 1]: Erro de conversao! Digite apenas algarismos numericos.");

        } catch (ArithmeticException e) {
            System.out.println("[Catch 2]: Erro matematico! Impossivel dividir por zero.");

        } catch (Exception e) {
            // Catch coringa: captura qualquer outro erro que nao seja os dois acima
            System.out.println("[Catch Generico]: Ocorreu um erro inesperado: " + e.getMessage());
        }
    }
}
