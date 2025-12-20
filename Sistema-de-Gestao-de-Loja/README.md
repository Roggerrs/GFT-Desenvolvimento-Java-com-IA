
---

# 📄 README.md — Sistema de Gestão de Loja

```md
# 🏪 Sistema de Gestão de Loja

Projeto desenvolvido em **Java** com o objetivo de praticar os principais conceitos de **Programação Orientada a Objetos (POO)**, **Collections (Map)** e **Testes Unitários com JUnit 5**.

Este projeto é **didático**, voltado para estudo e treino prático, incluindo digitação do código para reforçar a memória muscular.

---

## 📚 Conceitos Trabalhados

- Programação Orientada a Objetos (POO)
- Encapsulamento
- Classes e Objetos
- Map (`HashMap`, `TreeMap`)
- Regras de negócio
- Cálculo automático de valores
- Testes Unitários com **JUnit 5**
- Estrutura de projeto em camadas (model / service)
- Boas práticas de código

---

## 📂 Estrutura do Projeto

## 📂 Estrutura do Projeto

```text
src
├── main
│   └── java
│       └── br
│           └── com
│               └── loja
│                   ├── model
│                   │   ├── Cliente.java
│                   │   ├── Produto.java
│                   │   └── Venda.java
│                   │
│                   ├── service
│                   │   ├── ClienteService.java
│                   │   ├── EstoqueService.java
│                   │   └── RelatorioService


---

## 🧩 Descrição das Classes

### 📦 Produto
Representa um produto da loja.

**Atributos:**
- código
- nome
- preço
- quantidade

---

### 👤 Cliente
Representa um cliente da loja.

**Atributos:**
- CPF
- nome

---

### 🧾 Venda
Representa uma venda realizada.

- O **valor total é calculado automaticamente** no construtor:
```

valorTotal = preco do produto × quantidade

```

---

### 🧠 EstoqueService
Responsável por gerenciar os produtos da loja.

**Funcionalidades:**
- Adicionar produtos
- Listar produtos
- Calcular valor total do estoque
- Encontrar o produto mais caro
- Retornar `null` quando o estoque estiver vazio

---

### 👥 ClienteService
Responsável por gerenciar os clientes.

**Funcionalidades:**
- Adicionar cliente
- Buscar cliente pelo CPF
- Listar clientes

---

### 📊 RelatorioService
Responsável por gerar relatórios.

**Funcionalidades:**
- Listar produtos ordenados por código usando `TreeMap`

---

## 🧪 Testes Unitários

O projeto possui testes unitários utilizando **JUnit 5**, cobrindo:

### ✔ EstoqueServiceTest
- Produto mais caro
- Valor total do estoque
- Retorno `null` quando o estoque está vazio

### ✔ ClienteServiceTest
- Adicionar cliente
- Buscar cliente por CPF

### ✔ VendaTest
- Cálculo automático do valor total da venda

---

## ▶️ Como Executar o Projeto

1. Abrir o projeto no **IntelliJ IDEA**
2. Executar a classe `Main`
3. Ver os resultados no console

---

## ▶️ Como Executar os Testes

- Clique no ícone ▶️ ao lado da classe de teste  
ou  
- Clique com o botão direito no arquivo de teste → **Run**

---

## 🎯 Objetivo do Projeto

Este projeto foi criado com foco em:

- Aprendizado prático
- Fixação de conceitos básicos de Java
- Preparação para desafios técnicos e entrevistas
- Organização de código para portfólio no GitHub

---

## ✍️ Autor

**Roger**  
Projeto desenvolvido para estudo e evolução contínua em Java 🚀
```

---

## ✅ AGORA TEM

✔ Projeto funcional
✔ Testes unitários
✔ README profissional
✔ Código organizado
✔ Base sólida para entrevistas

