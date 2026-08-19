package ListasDeAtividades.Lista01.Q1;

public class Main {
    public static void main(String[] args) {
        Filme Interestelar = new Filme("Interestelar", "Ficção Científica", 2014);
        Filme ToyStory = new Filme("Interestelar", "Animação", 1995);

        System.out.println("Filmes criados:");
        System.out.printf("%s - %s (%d)%n", Interestelar.titulo, Interestelar.genero, Interestelar.anoLancamento);
        System.out.printf("%s - %s (%d)%n", ToyStory.titulo, ToyStory.genero, ToyStory.anoLancamento);
        // Para melhor formatação, consultei uma IA para entender melhor o printf
        // Eu não sabia que poderia ser utilizado caracteres como - ()
    }
}
 