# Questão 02 — Livros e Autores

Objetivo: modelar uma associação entre `Livro` e `Autor` (um `Livro` possui um `Autor`),
implementar os construtores e sobrescrever `toString()` conforme solicitado.

Requisitos:

1) Classe `Autor`:

- Atributos:
  - `nome` : `String`
  - `nacionalidade` : `String`
- Construtor que receba `nome` e `nacionalidade` e inicialize os atributos (use `this`).
- Sobrescreva o método `toString()` com a assinatura obrigatória:

  @Override
  public String toString()

  - Não use `System.out.println()` dentro de `toString()`.
  - Retorne uma única `String` contendo o nome e a nacionalidade do autor,
    organizada de forma clara para exibição.

2) Classe `Livro`:

- Atributos:
  - `titulo` : `String`
  - `anoPublicacao` : `int`
  - `autor` : `Autor` (representa a associação; armazena referência ao objeto `Autor`).
- Construtor que receba `titulo`, `anoPublicacao` e `autor`, inicializando-os com `this`.
- Sobrescreva `toString()` com a assinatura obrigatória:

  @Override
  public String toString()

  - Não use `System.out.println()` dentro de `toString()`.
  - Retorne uma única `String` contendo o título e o ano de publicação.
  - Inclua também os dados do autor associado, obtidos chamando o `toString()` do
    objeto `Autor` (não repita a lógica de formatação do autor em `Livro`).

3) Aplicação (classe `Main`):

- Crie apenas os objetos necessários (não use listas/vetores/ArrayList) para representar
  os dois casos abaixo. Para cada caso, primeiro crie o `Autor`, depois o `Livro` associado.

Dados:

- Caso 1
  - Autor: George Orwell (Nacionalidade: Britânico)
  - Livro: 1984 (Ano de publicação: 1949)

- Caso 2
  - Autor: Machado de Assis (Nacionalidade: Brasileiro)
  - Livro: Dom Casmurro (Ano de publicação: 1899)

- Para cada livro, exiba o objeto `Livro` diretamente com `System.out.println()`.
  A saída deve apresentar pelo menos: título, ano de publicação, nome do autor e
  nacionalidade do autor.

Observações:

- A Questão 2 propositalmente não fornece implementações dos construtores nem do
  `toString()`; a formatação exata das `String`s e a associação dos objetos fazem parte da atividade.
- Não utilize coleções; crie apenas os objetos solicitados.

Para ver o arquivo completo com as questões, consulte o PDF: [Lista_01_POO.pdf](../Lista_01_POO.pdf)
