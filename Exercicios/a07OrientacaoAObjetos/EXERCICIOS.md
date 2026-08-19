# 📋 Questões de Programação Orientada a Objetos em Java
**Autor:** Richd ([Richdssz](https://github.com/Richdssz))  
**Instituição:** Universidade Católica de Pernambuco (UNICAP)  
**Disciplina:** Programação Orientada a Objetos (POO)  
**Módulo:** 07 - Orientação a Objetos (`a07OrientacaoAObjetos`)  

> **Propósito:** Caderno de exercícios de fixação e desafios com curva gradual de aprendizado, dividido em 4 níveis: **Fácil**, **Médio**, **Difícil** e **Impossível**.

---

## 🎯 Painel de Acompanhamento (Tracker de Progresso)

> **Dica:** Marque `[x]` nas caixas abaixo conforme for resolvendo os exercícios e salvando seus códigos.

| # | Nível | Título do Exercício | Foco Principal | Status | Código da Solução |
|:---:|:---:|:---|:---|:---:|:---|
| **01** | 🟢 Fácil | Lâmpada Inteligente | Atributos booleanos, métodos de alternância e estado | [ ] Pendente | [`q01_lampada`](./q01_lampada) |
| **02** | 🟢 Fácil | Termômetro Digital | Atributos double e fórmulas matemáticas simples | [ ] Pendente | [`q02_termometro`](./q02_termometro) |
| **03** | 🟢 Fácil | Contador de Passos | Incremento de estado e cálculo estimado | [ ] Pendente | [`q03_contador`](./q03_contador) |
| **04** | 🟢 Fácil | Retângulo Geométrico | Métodos com retorno (`calcularArea`, `calcularPerimetro`) | [ ] Pendente | [`q04_retangulo`](./q04_retangulo) |
| **05** | 🟢 Fácil | Perfil de Jogador | Construtor, evolução de nível e ficha formatada | [ ] Pendente | [`q05_jogador`](./q05_jogador) |
| **06** | 🟡 Médio | Conta Bancária Simplificada | Validações condicionais de saque e depósito | [ ] Pendente | [`q06_conta_bancaria`](./q06_conta_bancaria) |
| **07** | 🟡 Médio | Elevador Predial | Limite de andares superior/inferior e passageiros | [ ] Pendente | [`q07_elevador`](./q07_elevador) |
| **08** | 🟡 Médio | Controle de Estoque de Produto | Reposição, venda com verificação e faturamento | [ ] Pendente | [`q08_estoque_produto`](./q08_estoque_produto) |
| **09** | 🟡 Médio | Carro com Consumo de Combustível | Tanque, consumo por km e autonomia de viagem | [ ] Pendente | [`q09_carro_combustivel`](./q09_carro_combustivel) |
| **10** | 🟡 Médio | Aluno e Média Ponderada | Notas com pesos, média e situação acadêmica | [ ] Pendente | [`q10_aluno_media`](./q10_aluno_media) |
| **11** | 🔴 Difícil | Ar-Condicionado Inteligente | Modos (Frio/Quente), limites de temperatura e consumo de energia | [ ] Pendente | [`q11_ar_condicionado`](./q11_ar_condicionado) |
| **12** | 🔴 Difícil | Bomba de Combustível de Posto | Abastecer por valor vs por litro, alteração de preço e faturamento | [ ] Pendente | [`q12_bomba_combustivel`](./q12_bomba_combustivel) |
| **13** | 🔴 Difícil | Cartão de Transporte com Integração | Saldo, recarga, débito de tarifa e integração por tempo de viagem | [ ] Pendente | [`q13_cartao_transporte`](./q13_cartao_transporte) |
| **14** | 💀 Impossível | Robô Explorador de Grade 2D | Navegação cartesiana (X, Y), energia dinâmica e colisões de borda | [ ] Pendente | [`q14_robo_grid`](./q14_robo_grid) |
| **15** | 💀 Impossível | Duelo de Personagens RPG em Turnos | Interação entre objetos, cálculo de dano com armadura e narrativa | [ ] Pendente | [`q15_rpg_duelo`](./q15_rpg_duelo) |

---

## 🟢 Nível 1: Fácil (Conceitos Básicos, Atributos e Métodos Simples)

### Questão 01: Lâmpada Inteligente
- **Objetivo:** Modelar uma classe simples e alternar estados booleanos.
- **Especificação:**
  - Crie a classe `Lampada` com: `ligada` (`boolean`), `potencia` (`int`, em Watts) e `cor` (`String`).
  - Métodos:
    - `ligar()`: define `ligada = true` e imprime `"A lâmpada acendeu."`.
    - `desligar()`: define `ligada = false` e imprime `"A lâmpada apagou."`.
    - `mostrarEstado()`: exibe o estado atual, potência e cor.
- **No `Main`:** Instancie duas lâmpadas, ligue uma, desligue a outra e mostre seus estados.

---

### Questão 02: Termômetro Digital
- **Objetivo:** Conversão matemática de valores e manipulação de atributos de ponto flutuante.
- **Especificação:**
  - Crie a classe `Termometro` com o atributo `temperaturaCelsius` (`double`).
  - Métodos:
    - `definirTemperatura(double temp)`: atualiza o valor da temperatura.
    - `exibirFahrenheit()`: calcula e retorna em Fahrenheit ($F = C \times 1.8 + 32$).
    - `exibirKelvin()`: calcula e retorna em Kelvin ($K = C + 273.15$).

---

### Questão 03: Contador de Passos
- **Objetivo:** Modificação cumulativa de estado e métodos de incremento/reset.
- **Especificação:**
  - Crie a classe `ContadorPassos` com o atributo `passos` (`int`).
  - Métodos:
    - `darPasso()`: incrementa 1 passo.
    - `darPassos(int quantidade)`: soma a quantidade ao total.
    - `resetar()`: zera os passos.
    - `exibirPassos()`: imprime a contagem atual.
    - `estimarDistanciaMetros()`: retorna a distância percorrida (0.75m por passo).

---

### Questão 04: Retângulo Geométrico
- **Objetivo:** Métodos com retorno de valores e construtor com parâmetros.
- **Especificação:**
  - Crie a classe `Retangulo` com `largura` (`double`) e `altura` (`double`).
  - Construtor: `Retangulo(double largura, double altura)`.
  - Métodos:
    - `calcularArea()`: retorna `largura * altura`.
    - `calcularPerimetro()`: retorna `2 * (largura + altura)`.
    - `isQuadrado()`: retorna `true` se `largura == altura`, senão `false`.

---

### Questão 05: Perfil de Jogador
- **Objetivo:** Instanciação, acúmulo de pontos e formatação de saída textual.
- **Especificação:**
  - Crie a classe `Jogador` com: `nickname` (`String`), `nivel` (`int`, inicia em 1) e `pontuacao` (`int`, inicia em 0).
  - Métodos:
    - `ganharPontos(int pts)`: soma pontos. A cada 100 pontos acumulados, sobe 1 nível automaticamente.
    - `exibirFicha()`: exibe o nickname, nível atual e total de pontos.

---

## 🟡 Nível 2: Médio (Regras de Negócio e Validações de Estado)

### Questão 06: Conta Bancária Simplificada
- **Objetivo:** Controle de fluxo condicional baseado no saldo atual da instância.
- **Especificação:**
  - Crie a classe `ContaBancaria` com: `numero` (`String`), `titular` (`String`), `saldo` (`double`).
  - Métodos:
    - `depositar(double valor)`: só aceita valores estritamente positivos.
    - `sacar(double valor)`: só permite o saque se `valor > 0` e `saldo >= valor`. Retorna `boolean`.
    - `exibirExtrato()`: imprime o titular e o saldo formatado em R$.

---

### Questão 07: Elevador Predial
- **Objetivo:** Modelagem de limites físicos superior e inferior e controle de capacidade.
- **Especificação:**
  - Crie a classe `Elevador` com: `andarAtual` (`int`, inicia em 0 - térreo), `totalAndares` (`int`), `capacidadePessoas` (`int`), `pessoasPresentes` (`int`, inicia em 0).
  - Métodos:
    - `entrar(int qtd)`: só adiciona se não ultrapassar `capacidadePessoas`.
    - `sair(int qtd)`: só remove se houver pessoas suficientes dentro.
    - `subir()`: sobe 1 andar até `totalAndares`.
    - `descer()`: desce 1 andar até o térreo (0).

---

### Questão 08: Controle de Estoque de Produto
- **Objetivo:** Cálculos de inventário, reposição e saídas parciais.
- **Especificação:**
  - Crie a classe `ProdutoEstoque` com: `codigo` (`String`), `nome` (`String`), `precoUnitario` (`double`), `quantidadeEmEstoque` (`int`).
  - Métodos:
    - `repor(int quantidade)`: adiciona unidades ao estoque.
    - `vender(int quantidade)`: se houver estoque suficiente, reduz e retorna o valor faturado (`quantidade * precoUnitario`). Se não houver, exibe aviso e retorna `0.0`.
    - `calcularValorTotalEstoque()`: retorna `quantidadeEmEstoque * precoUnitario`.

---

### Questão 09: Carro com Consumo de Combustível
- **Objetivo:** Simular relação de consumo por quilômetro e capacidade do tanque.
- **Especificação:**
  - Crie a classe `Carro` com: `modelo` (`String`), `tanqueAtual` (`double`), `capacidadeTanque` (`double`), `consumoKmLitro` (`double`).
  - Métodos:
    - `abastecer(double litros)`: enche o tanque sem transbordar o limite máximo.
    - `viajar(double distanciaKm)`: calcula o combustível necessário (`distanciaKm / consumoKmLitro`). Se houver combustível, deduz do tanque e imprime sucesso. Se não houver, informa a distância máxima que conseguiria percorrer.

---

### Questão 10: Aluno e Média Ponderada
- **Objetivo:** Manipulação de múltiplas notas e cálculo de situação acadêmica.
- **Especificação:**
  - Crie a classe `Aluno` com: `matricula` (`String`), `nome` (`String`), `nota1` (`double`), `nota2` (`double`), `peso1` (`double`), `peso2` (`double`).
  - Métodos:
    - `calcularMediaPonderada()`: retorna $\frac{(nota1 \times peso1) + (nota2 \times peso2)}{peso1 + peso2}$.
    - `obterSituacao()`: retorna `"Aprovado"` se média $\ge 7.0$, `"Recuperação"` se entre $5.0$ e $6.9$, ou `"Reprovado"` se $< 5.0$.
    - `gerarBoletim()`: imprime notas, pesos, média final e situação formatada.

---

## 🔴 Nível 3: Difícil (Regras de Negócio Avançadas com uma Classe)

### Questão 11: Ar-Condicionado Inteligente
- **Objetivo:** Gerenciar múltiplos estados interconectados (ligado, modo, temperatura alvo, gasto energético).
- **Especificação:**
  - Crie a classe `ArCondicionado` com os atributos:
    - `ligado` (`boolean`), `temperaturaAtual` (`int`), `modo` (`String`: `"Frio"` ou `"Quente"`), `potenciaWatts` (`int`), `horasDeUso` (`double`).
  - Métodos:
    - `ligar()` e `desligar()`.
    - `aumentarTemperatura()` e `diminuirTemperatura()`: só funcionam se ligado e dentro da faixa de **16°C a 30°C**.
    - `alterarModo(String novoModo)`: valida para aceitar apenas `"Frio"` ou `"Quente"`.
    - `usar(double horas)`: acumula as horas de uso se estiver ligado.
    - `calcularConsumoKWh(double precoKWh)`: calcula o consumo total:
      $$\text{Consumo (R\$)} = \left(\frac{\text{potenciaWatts} \times \text{horasDeUso}}{1000}\right) \times \text{precoKWh}$$

---

### Questão 12: Bomba de Combustível de Posto
- **Objetivo:** Métodos de abastecimento alternativos com sincronização de caixa e estoque de combustível.
- **Especificação:**
  - Crie a classe `BombaCombustivel` com:
    - `tipoCombustivel` (`String`), `valorLitro` (`double`), `quantidadeCombustivel` (`double`, litros no reservatório da bomba), `totalFaturado` (`double`).
  - Métodos:
    - `abastecerPorValor(double valor)`: calcula a quantidade de litros que o valor paga (`valor / valorLitro`), verifica se a bomba possui combustível suficiente, debita da bomba, soma ao `totalFaturado` e retorna a quantidade de litros colocados.
    - `abastecerPorLitro(double litros)`: calcula o valor a ser pago (`litros * valorLitro`), verifica a disponibilidade na bomba, debita o combustível, soma ao faturamento e retorna o valor a pagar.
    - `alterarValorLitro(double novoValor)`: atualiza o preço do combustível se for maior que zero.
    - `reabastecerBomba(double litros)`: adiciona combustível ao reservatório da bomba.

---

### Questão 13: Cartão de Transporte com Integração
- **Objetivo:** Simular cobrança tarifária com controle temporal simplificado e limites de saldo.
- **Especificação:**
  - Crie a classe `CartaoTransporte` com:
    - `numeroCartao` (`String`), `saldo` (`double`), `valorTarifa` (`double`, ex: R$ 4.50), `minutosDesdeUltimoUso` (`int`, iniciado em 999).
  - Métodos:
    - `recarregar(double valor)`: valida se valor > 0 e soma ao saldo.
    - `passarNaCatraca(int minutosAtuais)`:
      - Se a diferença de minutos entre o uso atual e o último uso for menor ou igual a **60 minutos** (integração): exibe `"Integração tarifária! Passagem gratuita."` e não debita saldo.
      - Caso contrário: verifica se tem saldo $\ge$ `valorTarifa`. Se tiver, debita a tarifa e atualiza o horário do último uso. Se não tiver, exibe `"Saldo Insuficiente!"` e bloqueia a passagem.
    - `exibirExtrato()`: mostra o saldo atual e status do cartão.

---

## 💀 Nível 4: Impossível (Desafios Integradores / Hardcore)

> ⚡ **Aviso:** Estes desafios exigem alto raciocínio de controle de fluxo, estruturas de repetição, múltiplos limites de validação e interação profunda entre instâncias ou planos cartesianos.

### Questão 14: Robô Explorador de Grade 2D
- **Objetivo:** Navegação cartesiana, consumo dinâmico de bateria, detecção de colisões e radar de coordenadas.
- **Especificação:**
  - Crie a classe `RoboExplorador` com:
    - `nome` (`String`), `posicaoX` (`int`), `posicaoY` (`int`), `tamanhoGrid` (`int`, ex: 10 para área 0 a 10), `nivelEnergia` (`int`, 0 a 100), `passosTotais` (`int`).
  - Métodos:
    - `mover(char direcao)`: aceita `'N'` (Norte / $Y+1$), `'S'` (Sul / $Y-1$), `'L'` (Leste / $X+1$), `'O'` (Oeste / $X-1$).
      - Cada movimento consome **5 unidades de energia**.
      - Se a energia for $< 5$, o robô avisa que descarregou e não sai do lugar.
      - Se o movimento for levar o robô para fora da grade ($X < 0$, $X > \text{tamanhoGrid}$, $Y < 0$ ou $Y > \text{tamanhoGrid}$), cancela o movimento, preserva a energia e alerta `"Colisão de Borda!"`.
      - Incrementa `passosTotais` a cada passo bem-sucedido.
    - `recarregar(int quantidade)`: adiciona energia respeitando o teto de 100%.
    - `radar()`: calcula e retorna a distância euclidiana da origem $(0, 0)$ usando $D = \sqrt{X^2 + Y^2}$ (`Math.sqrt(Math.pow(posicaoX, 2) + Math.pow(posicaoY, 2))`).
    - `exibirStatus()`: exibe relatório completo de coordenadas, energia, passos e distância da base.

---

### Questão 15: Duelo de Personagens RPG em Turnos
- **Objetivo:** Passagem de instâncias como parâmetro entre objetos, combate com mitigação de armadura, chances de golpe crítico e controle de morte.
- **Especificação:**
  - Crie a classe `PersonagemRPG` com:
    - `nome` (`String`), `vida` (`int`), `vidaMaxima` (`int`), `ataque` (`int`), `defesa` (`int`), `chanceCritico` (`double`, 0.0 a 1.0), `vivo` (`boolean`).
  - Métodos:
    - `atacar(PersonagemRPG oponente)`:
      - Se o atacante estiver morto (`!vivo`), não pode atacar.
      - Sorteia se o golpe é crítico (`Math.random() < chanceCritico`). Se for crítico, o ataque causa **1.5x o dano base**.
      - Dano efetivo: $\text{Dano} = \text{Ataque} - \text{Defesa do Oponente}$. Se o resultado for menor que 1, o dano mínimo é sempre **1**.
      - Chama o método `receberDano(dano)` no oponente.
      - Imprime a narrativa do combate com riqueza de detalhes (se foi crítico, quanto de vida restou ao alvo).
    - `receberDano(int dano)`: subtrai da vida. Se `vida <= 0`, define `vida = 0`, `vivo = false` e imprime que o guerreiro foi abatido.
    - `pocaoDeCura(int quantidade)`: se vivo, regenera vida sem ultrapassar `vidaMaxima`.
- **Classe Principal (`Main`):** Crie dois guerreiros (ex: Guerreiro vs Mago) e faça um loop `while` onde eles se atacam alternadamente até que um dos dois caia!
