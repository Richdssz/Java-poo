public abstract class Funcionario {
    private String nome;
    private double salarioBase;

    public abstract double calcularSalario();

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return this.nome;
    }

    public double getSalarioBase(){
        return this.salarioBase;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

     public void setSalarioBase(double salarioBase){
        this.salarioBase = salarioBase;
    }
}