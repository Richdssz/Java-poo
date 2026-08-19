package ListasDeAtividades.Lista01.Q2;

public class Main {
    public static void main(String[] args) {
        Autor Go = new Autor("George Orwell", "Britânico");
        Autor Ma = new Autor("Machado de Assis", "Brasileiro");
        Livro NeF = new Livro("1984",1984, Go );
        Livro Dc = new Livro("Dom Casmurro",1899, Ma );

        System.out.println(Dc);
        System.out.println(NeF);

    }
}
