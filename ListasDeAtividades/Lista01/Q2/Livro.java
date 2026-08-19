package ListasDeAtividades.Lista01.Q2;

public class Livro {
    String titulo;
    int anoPublicacao;
    Autor autor;


    public Livro(String titulo, int anoPublicacao, Autor autor){
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.autor = autor;
    }

    @Override
    public String toString(){
        return "titulo: " + this.titulo + ", Ano: " + this.anoPublicacao + ", Autor: " + autor; 
    }
}
