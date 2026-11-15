# Questão 3 – Sistema Bancário

Um banco possui dois tipos de contas: conta corrente e conta poupança. Implemente uma classe abstrata ContaBancaria, com os atributos titular e saldo, e os métodos:

• depositar(double valor): método concreto que adiciona um valor ao saldo.
• sacar(double valor): método abstrato.

Crie as subclasses ContaCorrente e ContaPoupanca. Na conta corrente, cada saque possui uma taxa fixa de R$ 2,00. Na conta poupança, os saques não possuem taxa. Implemente um programa que realize depósitos e saques utilizando objetos das duas subclasses.
