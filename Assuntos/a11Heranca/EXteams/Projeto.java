package Assuntos.a11Heranca.EXteams;

public class Projeto {
    private String nome;
    private String descricao;
    private Desenvolvedor desenvolvedorResponsavel;

    public Projeto(String nome, String descricao, Desenvolvedor DesenvolvedorResponsavel) {
        setNome(nome);
        setDescricao(descricao);
        setDesenvolvedor(DesenvolvedorResponsavel);
    }

    public String getNome() {
        return this.nome;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public Desenvolvedor getDesenvolvedor() {
        return this.desenvolvedorResponsavel;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.isBlank()) {
            this.nome = nome;
        }
    }

    public void setDescricao(String desc) {
        if (desc != null && !desc.isBlank()) {
            this.descricao = desc;
        }
    }

    public void setDesenvolvedor(Desenvolvedor dev) {
        if (dev != null) {
            this.desenvolvedorResponsavel = dev;
        }
    }

    @Override
    public String toString() {
        return "• Projeto: " + getNome()
                + "\n  Descrição: " + getDescricao()
                + "\n  Responsável:\n" + getDesenvolvedor();
    }

}
