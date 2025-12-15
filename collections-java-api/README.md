
---

# 📚 Projeto: Sala de Aula (Collections Java)

## 📌 Descrição

Este projeto foi criado com o objetivo de **praticar conceitos básicos de Java e Programação Orientada a Objetos (POO)**, utilizando **List** e **ArrayList**.

A ideia do projeto é simples:

* Um **Aluno** representa uma pessoa (apenas com nome)
* Uma **SalaDeAula** organiza vários alunos
* É possível:

    * adicionar alunos
    * remover alunos pelo nome
    * listar todos os alunos

Este projeto é **didático**, voltado para quem está aprendendo Java.

---

## 🧠 Conceitos praticados

* Classes e objetos
* Construtores
* Encapsulamento (`private`, getters)
* List e ArrayList
* Laço `for-each`
* Método `toString()`
* Método `main`
* Organização em pacotes

---

## 🗂 Estrutura do projeto

```
src
└── br.com.escola.salaaula
    ├── Aluno.java
    └── SalaDeAula.java
```

---

## 📦 Classe Aluno

Representa **um aluno**.

* Possui apenas o atributo `nome`
* Serve apenas para **guardar dados**
* Não possui regras de negócio

Exemplo:

```java
new Aluno("Ana");
```

---

## 🏫 Classe SalaDeAula

Responsável por **gerenciar a lista de alunos**.

Funcionalidades:

* Adicionar alunos
* Remover alunos pelo nome
* Listar todos os alunos

Internamente, utiliza:

```java
List<Aluno> alunos = new ArrayList<>();
```

---

## ▶️ Executando o projeto

1. Abra o projeto no **IntelliJ IDEA**
2. Localize a classe `SalaDeAula`
3. Execute o método `main`

---

## 🧪 Exemplo de saída no console

```
[Ana, João, Carlos]
[Ana, Carlos]
```

Explicação:

* Primeiro, todos os alunos são exibidos
* Depois, o aluno **João** é removido
* A lista é exibida novamente sem ele

---

## 🎯 Objetivo do projeto

Este projeto tem como objetivo ajudar iniciantes a entenderem que:

* **Objetos representam coisas reais**
* **Uma classe pode cuidar de vários objetos**
* **Collections servem para organizar dados**
* O mesmo padrão pode ser reutilizado em vários contextos

---

## 👨‍💻 Autor

Projeto desenvolvido para fins de estudo e prática em Java.

---

