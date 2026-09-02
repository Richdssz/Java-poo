package Assuntos.a11Heranca.EXteams;

import java.util.ArrayList;

public class Empresa {
    private Gerente gerente;
    private ArrayList<Projeto> projetos;

    // ele cria o arraylist vazio
    public Empresa(Gerente gerente) {
        setGerente(gerente);
        this.projetos = new ArrayList<>();
    }

    // já usa o arraylist que foi colocado como atributo
    public Empresa(Gerente gerente, ArrayList<Projeto> projetos) {
        setGerente(gerente);
        setProjetos(projetos);
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
}