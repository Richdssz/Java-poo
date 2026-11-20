package ListasDeAtividades.Lista04.Q9;

public class Main {
    public static void main(String[] args) {
        try {
            Livro f = new Livro("A Metamorfose", 2);
            f.emprestar();
            f.emprestar();
            f.emprestar();
        } catch (LivroIndisponivelException e) {
            System.out.println(e.getMessage());
        }
    }
}
