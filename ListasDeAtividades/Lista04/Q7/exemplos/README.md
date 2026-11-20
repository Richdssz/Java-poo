# Guia Prático de Tratamento de Exceções em Java

Esta pasta contém exemplos didáticos e autocontidos para fixação dos conceitos de exceções na UNICAP.

---

## 📂 Arquivos de Exemplo:

### 1. `Exemplo01_Basico.java`
* **Conceito:** O fluxo fundamental do `try-catch`.
* **O que observar:** Como o programa não aborta bruscamente (*crash*) e como usamos o objeto `e` para inspecionar a causa do erro (`e.getMessage()`, `e.getClass().getSimpleName()`).

### 2. `Exemplo02_MultiplosCatch.java`
* **Conceito:** Encadeamento de múltiplos `catch` e regra de precedência na hierarquia de exceções.
* **O que observar:** Exceções mais específicas (como `NumberFormatException` e `ArithmeticException`) devem sempre vir **antes** da mais genérica (`Exception`), permitindo tratamentos personalizados para cada tipo de falha.

### 3. `Exemplo03_Finally.java`
* **Conceito:** A garantia de execução do bloco `finally`.
* **O que observar:** O `finally` roda **sempre**, tanto quando o `try` tem sucesso quanto quando ocorre um erro e cai no `catch`. É ideal para fechar recursos e garantir que operações sejam finalizadas de forma limpa.

---

## 💡 Resumo Rápido dos Comandos

| Palavra-chave | O que faz? |
|---|---|
| `try { ... }` | Delimita o trecho de código que corre risco de lançar exceções. |
| `catch (TipoErro e) { ... }` | Captura e trata uma exceção específica se ela ocorrer dentro do `try`. |
| `finally { ... }` | Bloco executado **sempre** após o `try` e `catch`, com ou sem erro. |
| `throw new ...` | Lança manualmente uma nova exceção para que ela seja tratada. |
| `throws ...` | Avisa na assinatura do método que ele pode disparar aquela exceção. |
