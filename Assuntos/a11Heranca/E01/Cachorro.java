package Assuntos.a11Heranca.E01;

public class Cachorro {
    private String nome;
    private String raca;

    // setters

    public void setNome(String nome) {
        if (nome != null && !nome.isBlank()) {
            this.nome = nome;
        } else {
            System.out.println("Digite um nome válido!");
        }
    }

    public void setRaca(String raca) {
        if (raca != null && !raca.isBlank()) {
            this.raca = raca;
        } else {
            System.out.println("Digite uma raça válida!");
        }
    }

    // getters
    public String getNome() {
        return this.nome;
    }

    public String getRaca() {
        return this.raca;
    }
}

