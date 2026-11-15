# Questão 5 – Sistema de Dispositivos Eletrônicos

Uma empresa fabrica dispositivos com diferentes funcionalidades. Crie duas interfaces:

```java
interface Ligavel {
    void ligar();
    void desligar();
}

interface Conectavel {
    void conectarInternet();
}
```

Implemente as seguintes classes:

• Televisao: implementa Ligavel.
• Roteador: implementa Ligavel e Conectavel.
• Computador: implementa Ligavel e Conectavel.

No método main, instancie os três dispositivos e execute seus métodos. Explique, em um comentário no código, por que uma classe pode implementar várias interfaces.
