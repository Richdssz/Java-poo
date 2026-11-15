# Questão 10 – Sistema de Transferências Bancárias

Crie uma classe Conta com os atributos numero e saldo. Implemente um método:

void transferir(Conta destino, double valor)

O método deverá transferir um valor de uma conta para outra, respeitando as seguintes regras:

• O valor deve ser maior que zero.
• A conta de destino não pode ser null.
• A conta de origem deve possuir saldo suficiente.

Crie uma exceção personalizada SaldoInsuficienteException para representar transferências que não podem ser realizadas por falta de saldo. Utilize try-catch para demonstrar transferências válidas e inválidas.
