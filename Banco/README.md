
---

```md
# 🏦 Banco Digital em Java (POO)

Projeto desenvolvido como parte do desafio **“Criando um Banco Digital com Java e Orientação a Objetos”** da **DIO (Digital Innovation One)**.

O objetivo deste projeto é aplicar, na prática, os **pilares da Programação Orientada a Objetos (POO)** utilizando Java, simulando um banco digital com contas correntes e poupança.

---

## 🎯 Objetivo do Projeto

Reforçar os conceitos de **Programação Orientada a Objetos (POO)** em Java por meio da implementação de um sistema bancário simples, contendo:

- Clientes
- Contas bancárias
- Operações básicas (depósito, saque, transferência)
- Impressão de extratos

---

## 🧠 Conceitos de POO Aplicados

### ✔️ Abstração
A classe `Conta` representa uma conta bancária genérica, abstraindo os atributos e comportamentos comuns.

### ✔️ Encapsulamento
Os atributos das classes são protegidos (`private` ou `protected`) e acessados por métodos, garantindo segurança e controle.

### ✔️ Herança
As classes `ContaCorrente` e `ContaPoupanca` herdam da classe `Conta`, reutilizando código.

### ✔️ Polimorfismo
Cada tipo de conta possui sua própria forma de imprimir o extrato, mesmo compartilhando comportamentos comuns.

---

## 🛠️ Tecnologias Utilizadas

- Java 17+
- IntelliJ IDEA
- Git / GitHub
- Programação Orientada a Objetos (POO)

---

## 📂 Estrutura do Projeto

```
```
br.com.dio.banco
├── Banco.java
├── Cliente.java
├── Conta.java
├── ContaCorrente.java
├── ContaPoupanca.java
└── Main.java
```

---

## 📌 Funcionalidades Implementadas

- Criar cliente
- Criar conta corrente
- Criar conta poupança
- Depositar valores
- Sacar valores
- Transferir valores entre contas
- Imprimir informações da conta

---

## ▶️ Execução do Projeto

1. Abra o projeto no **IntelliJ IDEA**
2. Navegue até a classe:
```

br.com.dio.banco.Main

```
3. Execute o método `main`

### 🔎 Exemplo de saída no console:

```

=== Extrato Conta Corrente ===
Cliente: Roger
Agência: 1
Número: 1
Saldo: 700.0

=== Extrato Conta Poupança ===
Cliente: Roger
Agência: 1
Número: 2
Saldo: 300.0

```

---

## 🚀 Melhorias Futuras (Opcional)

- Validação de saldo antes de saque/transferência
- Menu interativo com `Scanner`
- Persistência de dados
- Tratamento de exceções
- Implementação de interface para contas

---

## 📖 Referência

Projeto baseado no desafio oficial da DIO:  
🔗 https://github.com/falvojr/lab-banco-digital-oo

---

## 👨‍💻 Autor

Projeto desenvolvido para fins educacionais, com foco no aprendizado e prática de **Programação Orientada a Objetos em Java**.

---
```

---

