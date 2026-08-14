public class Pessoa extends Mamifero {
    String nome;
    int idade;
    float peso;
    String sexo;
    String cpf;
    String especie;
    int dist;


    public void mamar(){
        System.out.println(nome + "Está sendo amamentado");
    }

    public void andar(int d) {
        System.out.println(nome + " Está andando" + d);
        dist += d;
    }

    public void dormir() {
        System.out.println(nome + " Dormiu");
    }

    public void aniversario(){
        idade++;
        System.out.print(nome + " fez " + idade + ", Parabéns!");
    }

}
