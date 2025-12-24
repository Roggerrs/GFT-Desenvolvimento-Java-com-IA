
---

````markdown
# 📘 Projeto de Estudo – Java Interfaces Funcionais e Lambda Expressions

Este projeto tem como objetivo **estudar e praticar os principais tipos de Interfaces Funcionais do Java**, utilizando **Lambda Expressions**, conforme definido no pacote `java.util.function`.

O projeto foi desenvolvido no **IntelliJ IDEA**, usando Java (JDK 17+), com exemplos simples e didáticos para facilitar o aprendizado de quem está começando.

---

## 📂 Estrutura do Projeto

```text
src
└── br.com.exemplo.funcional
    ├── binaryoperator
    │   └── Main.java
    ├── consumer
    │   └── Main.java
    ├── predicate
    │   └── Main.java
    ├── supplier
    │   └── Main.java
    ├── Main.java
    └── Mensagem.java
````

Cada pacote demonstra **uma Interface Funcional específica**.

---

## 🔹 Interfaces Funcionais Estudadas

### ✅ Predicate

* Representa uma função que **recebe um valor e retorna `true` ou `false`**.
* Método principal: `test(T t)`

📌 Exemplo:

```java
Predicate<Integer> maiorDeIdade = idade -> idade >= 18;
boolean resultado = maiorDeIdade.test(20);
```

---

### ✅ Consumer

* Representa uma função que **recebe um valor e não retorna nada**.
* Muito usada para imprimir, salvar ou processar dados.
* Método principal: `accept(T t)`

📌 Exemplo:

```java
Consumer<String> imprimir = texto -> System.out.println(texto);
imprimir.accept("Olá, Consumer!");
```

---

### ✅ Supplier

* Representa uma função que **não recebe parâmetros e retorna um valor**.
* Método principal: `get()`

📌 Exemplo:

```java
Supplier<String> mensagem = () -> "Olá, Supplier!";
String resultado = mensagem.get();
```

---

### ✅ BinaryOperator

* Recebe **dois valores do mesmo tipo** e retorna um valor do mesmo tipo.
* Muito usado em operações matemáticas.
* Método principal: `apply(T t1, T t2)`

📌 Exemplo:

```java
BinaryOperator<Integer> soma = (a, b) -> a + b;
int resultado = soma.apply(10, 5);
```

---

### ✅ Interface Funcional Personalizada

O projeto também contém uma **interface funcional criada manualmente**, usando a anotação `@FunctionalInterface`.

📌 Interface:

```java
@FunctionalInterface
public interface Mensagem {
    void enviar();
}
```

📌 Uso com Lambda:

```java
Mensagem msg = () -> System.out.println("Olá, Interface Funcional!");
msg.enviar();
```

---

## 🎯 Objetivo do Projeto

* Entender o conceito de **Interface Funcional**
* Aprender **Lambda Expressions**
* Conhecer as principais interfaces do pacote `java.util.function`
* Praticar código limpo e organizado
* Criar base para estudos futuros com **Streams API**

---

## 🛠 Tecnologias Utilizadas

* Java (JDK 17 ou superior)
* IntelliJ IDEA
* Programação Funcional (básica)
* Lambda Expressions

---

## 📚 Observações

Este é um **projeto educacional**, focado em aprendizado.
Os exemplos são simples de propósito, para facilitar o entendimento de quem está começando em Java.

---

✍️ Autor: Roger
📅 Projeto de estudos em Java

```


