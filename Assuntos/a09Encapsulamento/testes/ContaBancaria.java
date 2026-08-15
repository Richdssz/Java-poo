package Assuntos.a09Encapsulamento.testes;

// Modificadores de Visibilidade
// public
// Classe pode ser instanciada por qualquer outra classe
// atributos e métodos são acessíveis (leitura,
// escrita) por objetos de qualquer classe.

// private
// Atributos só podem ser acessados por objetos da mesma classe
// Métodos só podem ser chamados por métodos da própria classe.

// protected
// Atributos e métodos são acessíveis dentro da própria
// classe, das subclasses e das classes que façam parte
// do mesmo pacote.

// Nada especificado
// Classe é visível somente por classes do mesmo pacote
// Atributos e métodos são acessíveis somente dentro
// das classes que pertencem ao mesmo pacote.
// Este modo de acesso é também chamado de default
// (friendly) (amigável)

public class ContaBancaria {
    // ATRIBUTO PRIVADO: Nenhuma classe externa pode alterar diretamente
    private double saldo;

    // MÉTODO PÚBLICO: Qual classe externa pode chamar
    public void depositar(double valor) {
        if (valor > 0) { // Proteção: evita saldo negativo
            this.saldo += valor;
        }
    }

    // GETTER PÚBLICO: Permite apenas LER o saldo com segurança
    public double getSaldo() {
        return this.saldo;
    }
}
