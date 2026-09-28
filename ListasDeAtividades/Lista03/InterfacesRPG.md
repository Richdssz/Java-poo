# Atividade 034 — Sistema de Personagens de RPG

Exercício prático de fixação dos conceitos de **Interface**, **Classe Abstrata**, **Herança** e **Polimorfismo** em Java.

---

## 🎯 Objetivo
Criar um sistema de combate RPG em Java aplicando POO com interface, classe abstrata, classes concretas com herança e polimorfismo.

---

## 📋 Requisitos da Atividade

### 1. Interface `Combatente`
- `void atacar(Personagem alvo)`
- `void defender()`
- `void usarHabilidade(Personagem alvo)`
- `void receberDano(int dano)`
- `boolean estaVivo()`

### 2. Classe Abstrata `Personagem`
- **Atributos:**
  - `nome` (String)
  - `nivel` (int)
  - `vida` (int)
  - `vidaMaxima` (int)
- **Métodos Concretos:**
  - `void exibirStatus()`
  - `void curar(int quantidade)`
- **Métodos Abstratos:**
  - `void atacar(Personagem alvo)`
  - `void usarHabilidade(Personagem alvo)`

### 3. Classes Concretas
Todas devem:
- Herdar de `Personagem`;
- Implementar `Combatente`;
- Ter atributos e comportamentos específicos.

#### Classes e Atributos:
1. **`Guerreiro`**
   - Atributos: `forca` (int), `defesa` (int)
   - Ataque e habilidade especial com base em força/defesa (ex.: Golpe Pesado / Investida Furiosa).
2. **`Mago`**
   - Atributos: `inteligencia` (int), `mana` (int)
   - Ataque mágico e magia especial consumindo mana (ex.: Bola de Fogo / Tempestade Arcana).
3. **`Arqueiro`**
   - Atributos: `agilidade` (int), `flechas` (int)
   - Disparo preciso e habilidade gastando flechas (ex.: Chuva de Flechas / Tiro Certeiro).

---

## 🧪 Teste (`Main.java`)
No método `main`:
1. Instanciar um objeto de cada classe (`Guerreiro`, `Mago`, `Arqueiro`).
2. Executar ações:
   - Atacar
   - Defender
   - Usar habilidades especiais
   - Receber dano
   - Exibir os status atualizados de cada um
