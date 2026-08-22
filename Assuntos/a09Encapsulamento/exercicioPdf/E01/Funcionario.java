package Assuntos.a09Encapsulamento.exercicioPdf.E01;

public class Funcionario {
    private int matricula;
    private String nome;
    private Departamento dpto;

    public Funcionario(int matricula, String nome, Departamento dpto) {
       setMatricula(matricula);
       setNome(nome);
       setDpto(dpto);
    }
    public Funcionario() {
      
    }

    // getters
    public int getMatricula() {
        return this.matricula;
    }

    public String getNome() {
        return this.nome;
    }

    public Departamento getDpto() {
        return this.dpto;
    }

    // setters
    public void setMatricula(int m) {
        if (m >= 0) {
            this.matricula = m;
        }
    }

    public void setNome(String n) {
        if (n != null && !n.equals("")) {
            this.nome = n;
        }
    }

    public void setDpto(Departamento d) {
        if (d != null) {
            this.dpto = d;
        }
    }

    public String toString() {
        return "Matricula: " + matricula + ", Nome: " + nome + ", Departamento: " + dpto;
    }
}
