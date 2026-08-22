package Assuntos.a09Encapsulamento.exercicioPdf.E01;

public class Departamento {
    private int codigo;
    private String nome;

    public Departamento(int codigo, String nome) {
        setCodigo(codigo);
        setNome(nome);
    }
    public Departamento() {
        
    }

    public int getCodigo() {
        return this.codigo;
    }

     public String getNome() {
        return this.nome;
    }

    public void setCodigo(int c) {
        if (c >= 0) {
            this.codigo = c;
        } else {
            System.out.println("só maior que 0");
        }
    }

    public void setNome(String n) {
        if (n != null && !n.equals("")) {
            this.nome = n;
        } else {
            System.out.println("Só valores reais");
        }
    }

    public String toString() {
        return codigo + ", " + nome + "!";

    }

}
