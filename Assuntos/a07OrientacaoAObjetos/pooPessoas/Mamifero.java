package Assuntos.a07OrientacaoAObjetos.pooPessoas;

public class Mamifero {
    String nome;
    String especie;
    String idade;
    float peso;
    String sexo;

    public void mamar() {
        System.out.println(nome + " Está sendo amamentado");
    }

    public void emitirSom() {
        System.out.println();
    }

    public void andar() {
        System.out.println(nome + " Está andando");
    }

    public void correr() {
        System.out.println(nome + " correu ");
    }
}
