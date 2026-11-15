public class Main {
    public static void main(String[] args) {
        FuncionarioCLT Joao = new FuncionarioCLT("joao", 1600);
        FuncionarioPJ Marcos = new FuncionarioPJ("Marcos", 8000);
        System.out.printf("Salário final: %.2f%n" , Joao.calcularSalario());
        System.out.printf("Salário final: %.2f%n" , Marcos.calcularSalario());

    }
}