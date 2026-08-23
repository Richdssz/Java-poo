# Exercícios Práticos: Atributos e Métodos Estáticos

Aqui estão 3 exercícios de nível **médio e direto ao ponto** para você praticar membros estáticos (`static`) sem complicação.

---

## Exercício 1: Gerador de Matrícula (`Aluno`)

### Objetivo
Praticar a geração de IDs/matrículas automáticas sequenciais e contagem de instâncias usando um atributo estático.

### Especificações
- **Classe `Aluno`**:
  - **Atributos de Instância**: `matricula` (int), `nome` (String), `nota` (double).
  - **Atributos Estáticos**: `proximaMatricula` (iniciado em `1001`) e `totalAlunos` (iniciado em `0`).
  - **Construtor**: Recebe `nome` e `nota`. Atribui o valor de `proximaMatricula` à `matricula` do aluno e incrementa tanto `proximaMatricula` quanto `totalAlunos`.
  - **Métodos**:
    - `isAprovado()` (instância): Retorna `true` se `nota >= 7.0`.
    - `getTotalAlunos()` (estático): Retorna a quantidade total de alunos criados.
- **Classe `Main`**:
  - Crie 3 alunos. Imprima o nome, a matrícula gerada e se foi aprovado.
  - Exiba o total de alunos cadastrados chamando `Aluno.getTotalAlunos()`.

---

## Exercício 2: Calculadora de Geometria (`CalculadoraGeometria`)

### Objetivo
Criar uma classe utilitária contendo apenas métodos e constantes estáticos (como a classe `Math` do Java).

### Especificações
- **Classe `CalculadoraGeometria`**:
  - **Atributos Estáticos**:
    - `PI` (constante `public static final double` igual a `3.14159`).
    - `totalCalculos` (contador estático privado iniciado em `0`).
  - **Métodos Estáticos**:
    - `areaCirculo(double raio)`: Retorna `PI * raio * raio` e incrementa `totalCalculos`.
    - `areaRetangulo(double largura, double altura)`: Retorna `largura * altura` e incrementa `totalCalculos`.
    - `areaTriangulo(double base, double altura)`: Retorna `(base * altura) / 2` e incrementa `totalCalculos`.
    - `getTotalCalculos()`: Retorna o total de cálculos realizados.
- **Classe `Main`**:
  - Faça alguns cálculos de áreas chamando os métodos diretamente pela classe `CalculadoraGeometria.areaCirculo(...)`.
  - Imprima o total de cálculos realizados no final.

---

## Exercício 3: Controle Geral de Estoque (`Produto`)

### Objetivo
Sincronizar a quantidade de itens individuais com o total geral de estoque mantido por um atributo estático.

### Especificações
- **Classe `Produto`**:
  - **Atributos de Instância**: `nome` (String), `quantidade` (int).
  - **Atributos Estáticos**: `totalItensEstoque` (soma total de itens de todos os produtos).
  - **Construtor**: Recebe `nome` e `quantidade` inicial. Adiciona a quantidade inicial ao `totalItensEstoque`.
  - **Métodos**:
    - `adicionarEstoque(int qtd)` (instância): Aumenta a quantidade do produto e adiciona `qtd` ao `totalItensEstoque`.
    - `removerEstoque(int qtd)` (instância): Reduz a quantidade do produto (se houver suficiente) e reduz `qtd` do `totalItensEstoque`.
    - `getTotalItensEstoque()` (estático): Retorna o total geral de itens no estoque de todos os produtos juntos.
- **Classe `Main`**:
  - Crie dois produtos (ex: "Celular" com 10 unidades e "Notebook" com 5 unidades).
  - Adicione estoque a um e remova de outro.
  - Imprima a quantidade de cada produto e o estoque total geral da loja.
