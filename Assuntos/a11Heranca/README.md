# Aula 11: Herança e Polimorfismo (Páginas 16 a 21)

Este guia explica detalhadamente a evolução do exemplo das **Páginas 16 a 21** do PDF `POO_11_Heranca.pdf`, cobrindo o tipo declarado de variáveis, o problema da perda de informação, o uso de **Cast** e a verificação segura com **`instanceof`**.

---

## 1. O Problema: Perda de Informação pelo Tipo Declarado (Páginas 16 e 18)

### O Código

```java
public class AplicacaoCliente {
    public static void main(String[] args) {
        // Objeto real é ClientePessoaFisica, mas a variável é do tipo Cliente
        Cliente cli = new ClientePessoaFisica("Fulano", "Rua tal", "123");
        AplicacaoCliente.imprime(cli);
    }

    public static void imprime(Cliente c) {
        System.out.println("Nome: " + c.getNome());
        System.out.println("Endereço: " + c.getEndereco());
        System.out.println("CPF: " + c.getCpf()); // ❌ ERRO DE COMPILAÇÃO!
    }
}
```

### Por que dá Erro de Compilação?

- **Regra Fundamental do Java**: O compilador toma decisões baseando-se **exclusivamente no tipo declarado da variável** (`Cliente`), e NÃO no objeto real que está na memória (`ClientePessoaFisica`).
- Como o parâmetro do método é `(Cliente c)`, o compilador olha para a classe `Cliente`.
- A classe `Cliente` possui `getNome()` e `getEndereco()`, mas **NÃO possui** o método `getCpf()`.
- Logo, o compilador bloqueia a chamada `c.getCpf()` antes mesmo do programa rodar, resultando em erro de compilação.

---

## 2. A Tentativa Incompleta: Conversão de Tipo / Cast (Página 19)

Para "forçar" o compilador a aceitar a chamada, podemos fazer um **Downcast** (converter a referência da superclasse de volta para a subclasse).

### O Código

```java
public static void imprime(Cliente c) {
    System.out.println("Nome: " + c.getNome());
    System.out.println("Endereço: " + c.getEndereco());

    // Cast manual: avisamos ao compilador "confie em mim, c é um ClientePessoaFisica"
    System.out.println("CPF: " + ((ClientePessoaFisica) c).getCpf()); // ✅ Compila!
}
```

### Por que agora compila?

O cast `((ClientePessoaFisica) c)` diz ao compilador para tratar temporariamente a variável `c` como `ClientePessoaFisica`, liberando o acesso ao método `getCpf()`.

### O Perigo do Cast Forçado

O código **compila**, mas cria uma armadilha em tempo de execução se passarmos outro tipo de cliente!

---

## 3. O Erro em Tempo de Execução: `ClassCastException` (Página 20)

### O Cenário de Erro

```java
public class AplicacaoCliente {
    public static void main(String[] args) {
        // Agora passamos uma Pessoa JURÍDICA para o mesmo método
        Cliente cli = new ClientePessoaJuridica("Sun", "Rua 2", "456");
        AplicacaoCliente.imprime(cli);
    }

    public static void imprime(Cliente c) {
        System.out.println("Nome: " + c.getNome());
        System.out.println("Endereço: " + c.getEndereco());

        // 💥 ERRO EM TEMPO DE EXECUÇÃO: ClassCastException!
        System.out.println("CPF: " + ((ClientePessoaFisica) c).getCpf());
    }
}
```

### O que acontece aqui?

1. O código compila sem problemas.
2. Quando o programa roda, `c` contêm um objeto `ClientePessoaJuridica`.
3. O Java tenta forçar a conversão desse objeto para `ClientePessoaFisica`.
4. Como `ClientePessoaJuridica` **não é** uma `ClientePessoaFisica`, o programa é interrompido imediatamente com a exceção:  
   `java.lang.ClassCastException: ClientePessoaJuridica cannot be cast to ClientePessoaFisica`.

---

## 4. A Solução Definitiva: O Operador `instanceof` (Página 21)

Para evitar erros em tempo de execução ao fazer o cast, usamos o operador `instanceof`. Ele faz um **teste dinâmico em tempo de execução** para verificar o tipo real do objeto antes de converter.

### O Código Seguro

```java
public class AplicacaoCliente {
    public static void main(String[] args) {
        Cliente cli = new ClientePessoaFisica("Fulano", "Rua tal", "123");
        AplicacaoCliente.imprime(cli);
    }

    public static void imprime(Cliente c) {
        System.out.println("Nome: " + c.getNome());
        System.out.println("Endereço: " + c.getEndereco());

        // Verifica o tipo REAL do objeto na memória antes de fazer o cast
        if (c instanceof ClientePessoaFisica) {
            // É seguro fazer o cast para ClientePessoaFisica!
            ClientePessoaFisica pf = (ClientePessoaFisica) c;
            System.out.println("CPF: " + pf.getCpf());
        } else if (c instanceof ClientePessoaJuridica) {
            // É seguro fazer o cast para ClientePessoaJuridica!
            ClientePessoaJuridica pj = (ClientePessoaJuridica) c;
            System.out.println("CNPJ: " + pj.getCnpj());
        }
    }
}
```

---

## Resumo dos 4 Passos das Páginas 16–21

| Passo                                      | Código                                                     | Resultado               | Motivo                                                                          |
| :----------------------------------------- | :--------------------------------------------------------- | :---------------------- | :------------------------------------------------------------------------------ |
| **1. Chamada direta (Pág 18)**             | `c.getCpf()` em `Cliente c`                                | ❌ Erro de Compilação   | O compilador só olha para o tipo declarado (`Cliente`), que não tem `getCpf()`. |
| **2. Cast direto (Pág 19)**                | `((ClientePessoaFisica)c).getCpf()`                        | ✅ Compila              | O cast força o compilador a aceitar o método.                                   |
| **3. Passando Pessoa Jurídica (Pág 20)**   | Cast de `ClientePessoaJuridica` para `ClientePessoaFisica` | 💥 `ClassCastException` | O objeto real em memória não é compatível com o cast forçado.                   |
| **4. Validação com `instanceof` (Pág 21)** | `if (c instanceof ClientePessoaFisica)`                    | 🛡️ 100% Seguro          | O teste garante que o cast só é feito se o objeto for do tipo correto.          |
