package ListasDeAtividades.Lista02;

import java.util.ArrayList;

public abstract class Animal {
    private long id;
    private String nome;
    private int idade;
    private double peso;
    private ArrayList<String> habilidades;
    

    public Animal(long id, String nome, int idade, double peso) {
        this.habilidades = new ArrayList<>();
        setId(id);
        setIdade(idade);
        setNome(nome);
        setPeso(peso);
    }

    // Setters

    public void setId(long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public long getId() {
        return id;
    }

    // Getters

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getPeso() {
        return peso;
    }

    public ArrayList<String> getHabilidades() {
        return habilidades;
    }

    // métodos personalizados

    public void adicionarHabilidade(String habilidade) {
        this.habilidades.add(habilidade);
    }

    public String emitirSom() {
        return "Som desconhecido";
    }
    //tolowercase e trim pra tirar os espaços
    public String realizarHabilidade(String habilidade) {
        if (this.habilidades.contains(habilidade.toLowerCase().trim())) {
            return getNome() + " consegue " + habilidade;
        } else {
            return getNome() + " não consegue " + habilidade;
        }
    }

    
}
