package pooPessoas;

public class Main {
    public static void main(String[] args) {
        Pessoa Rich = new Pessoa();
        Rich.idade = 20;
        Rich.nome = "richard";
        Rich.peso = 67;
        Rich.sexo = "macho";
        Rich.cpf = "676767";
        Rich.especie = "Homo-sapiens";
        Rich.dist = 67;

        Pessoa Joao = new Pessoa();
        Joao.idade = 67;
        Joao.nome = "Junin";
        Joao.peso = 67;
        Joao.sexo = "Alpha";
        Joao.cpf = "9739458";
        Joao.especie = "Homo-erectus";
        Joao.dist = 76;

        Rich.andar();
        Rich.aniversario();
        System.out.println("");
        System.out.println(Joao.idade);
        Rich.andar();
        Rich.andar();
        Rich.andar();

        Rich.andar();
        Rich.andar();
        Rich.andar();
    }
}
