package ListasDeAtividades.Lista01.Q2;

public class Autor {
    String nome;
    String nacionalidade;

    public Autor(String nome, String nacionalidade){
        this.nome = nome;
        this.nacionalidade = nacionalidade;
    }

    @Override
    public String toString(){
        return this.nome + ", nacionalidade: " + this.nacionalidade;
    }
}
