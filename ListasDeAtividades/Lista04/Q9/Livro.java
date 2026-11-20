package ListasDeAtividades.Lista04.Q9;

public class Livro {
    private String titulo;
    private int exemplaresDisponiveis;

    Livro(String t, int e) {
        setTitulo(t);
        setExemplaresDisponiveis(e);
    }

    public int getExemplaresDisponiveis() {
        return exemplaresDisponiveis;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setExemplaresDisponiveis(int exemplaresDisponiveisNovo) {
        this.exemplaresDisponiveis = exemplaresDisponiveisNovo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void emprestar() throws LivroIndisponivelException {
        if (getExemplaresDisponiveis() <= 0) {
            throw new LivroIndisponivelException("Não temos mais livros");
        } else {
            setExemplaresDisponiveis(getExemplaresDisponiveis() - 1);
            System.out.println("Livro emprestado! " );
        }
    }
}
