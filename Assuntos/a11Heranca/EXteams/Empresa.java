package Assuntos.a11Heranca.EXteams;

import java.util.ArrayList;

public class Empresa {
    private Gerente gerente;
    private ArrayList<Projeto> projetos;
    private String nome;

    // ele cria o arraylist vazio
    public Empresa(Gerente gerente) {
        setGerente(gerente);
        this.projetos = new ArrayList<>();
    }

    // já usa o arraylist que foi colocado como atributo
    public Empresa(Gerente gerente, ArrayList<Projeto> projetos, String nome) {
        setGerente(gerente);
        setProjetos(projetos);
        setNome(nome);
    }

    public void setNome(String nome) {
        if (nome != null && !nome.isBlank()) {
            this.nome = nome;
        }
    }

    public void setGerente(Gerente g) {
        if (g != null) {
            this.gerente = g;
        }
    }

    public void setProjetos(ArrayList<Projeto> projetos) {
        this.projetos = projetos;
    }

    public Gerente getGerente() {
        return this.gerente;
    }

    public ArrayList<Projeto> getProjetos() {
        return projetos;
    }

    public String getNome() {
        return this.nome;
    }

    public void addProjeto(Projeto projeto) {
        if (projeto != null) {
            this.projetos.add(projeto);
        }
    }

    // compara via nome dos dois e ignora casas decimais
    public void removeProjeto(Projeto projeto) {
        for (int i = 0; i < this.projetos.size(); i++) {
            if (projeto == null)
                return;
            if (this.projetos.get(i).getNome().equalsIgnoreCase(projeto.getNome())) {

                this.projetos.remove(i);
                break;

            }
        }

    }

    @Override
    public String toString() {
        String resultado = "\n================ EMPRESA ================"
                + "\nNome: " + getNome()
                + "\n---------------- GERENTE ----------------\n"
                + getGerente()
                + "\n---------------- PROJETOS ---------------";

        for (Projeto p : projetos) {
            resultado += "\n" + p + "\n-----------------------------------------";
        }

        return resultado;
    }

}