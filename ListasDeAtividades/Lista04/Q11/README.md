# Questão 11 – Sistema de Pedidos

Desenvolva um sistema simplificado de gerenciamento de pedidos utilizando classes abstratas, interfaces e tratamento de exceções. O sistema deverá possuir:

1. Classe abstrata Produto
Atributos nome e precoBase, além do método abstrato calcularPrecoFinal().

2. Classes concretas
• ProdutoFisico: o preço final inclui uma taxa fixa de entrega de R$ 15,00.
• ProdutoDigital: o preço final corresponde ao preço-base, sem taxa de entrega.

3. Interface Descontavel
```java
interface Descontavel {
    double aplicarDesconto(double percentual);
}
```
A classe ProdutoDigital deverá implementar essa interface, retornando o preço final após aplicar o percentual informado.

4. Exceção personalizada
Crie uma exceção PrecoInvalidoException, que deverá ser lançada caso um produto seja cadastrado com preço menor ou igual a zero.

5. Programa principal
• Crie produtos físicos e digitais.
• Armazene os produtos em um vetor do tipo Produto.
• Percorra o vetor e exiba o preço final de cada produto.
• Aplique um desconto a um produto digital.
• Utilize try-catch para tratar a tentativa de cadastrar um produto com preço inválido.
