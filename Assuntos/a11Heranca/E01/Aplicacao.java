package Assuntos.a11Heranca.E01;

public class Aplicacao {
    public static void main(String[] args) {
        Cachorro caramelo = new Cachorro("Nick", "Vira-lata");
        Cachorro doceDeLeite = new CachorroAdestrado("Zeus", "Poodle");
        Aplicacao.Imprime(caramelo);
        Aplicacao.Imprime(doceDeLeite);

    }

    public static void Imprime(Cachorro tipo) {
        if (tipo instanceof CachorroAdestrado) {
            System.out.print("Nome: " + tipo.getNome());
            System.out.print(", Raça: " + tipo.getRaca());
            System.out.println(" - Como " + tipo.getNome() + " é adestrado, ele pode");
            ((CachorroAdestrado) tipo).fingirDeMorto();
            ((CachorroAdestrado) tipo).rolar();
            ((CachorroAdestrado) tipo).deitar();

        } else if (tipo instanceof Cachorro) {
            System.out.print("Nome: " + tipo.getNome());
            System.out.print(", Raça: " + tipo.getRaca());
            System.out.println(" - " + tipo.getNome() + " não é adestrado");
        }
    }
}
