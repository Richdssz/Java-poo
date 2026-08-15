package Assuntos.a07OrientacaoAObjetos.pooPessoas;

public class Pessoa extends Mamifero {
    String nome;
    int idade;
    float peso;
    String sexo;
    String cpf;
    String especie;
    int dist;

    Pessoa(String nome, int idade, float peso, String sexo, String cpf, String especie, int dist) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.sexo = sexo;
        this.cpf = cpf;
        this.especie = especie;
        this.dist = dist;
    }

    public void andar(int d) {
        System.out.println(nome + " Está andando " + d);
        dist += d;
    }

    public void mamar() {
        System.out.println(nome + " Está sendo amamentado");
    }

    public void dormir() {
        System.out.println(nome + " Dormiu");
    }

    public void aniversario() {
        idade++;
        System.out.print(nome + " fez " + idade + ", Parabéns!");
    }
}
