
# 📱 Desafio POO – Modelagem do iPhone

Projeto desenvolvido como parte do desafio **POO – Programação Orientada a Objetos** da **Digital Innovation One (DIO)**, com o objetivo de aplicar conceitos fundamentais de **interfaces, implementação, abstração e polimorfismo em Java**.

---

## 📌 Descrição do Desafio

O desafio consiste em modelar e implementar um componente **iPhone**, representando suas principais funcionalidades apresentadas no lançamento do iPhone de 2007:

- 🎵 Reprodutor Musical  
- 📞 Aparelho Telefônico  
- 🌐 Navegador na Internet  

Cada funcionalidade foi representada por uma **interface**, e a classe `iPhone` realiza a **implementação de todas elas**.

---

## 🧩 Estrutura do Projeto

```

src/
└── br/com/dio/iphone
├── ReprodutorMusical.java
├── AparelhoTelefonico.java
├── NavegadorInternet.java
├── iPhone.java
└── Main.java

````

---

## 🔹 Interfaces Criadas

### 🎵 ReprodutorMusical
```java
tocar()
pausar()
selecionarMusica(String musica)
````

### 📞 AparelhoTelefonico

```java
ligar(String numero)
atender()
iniciarCorreioVoz()
```

### 🌐 NavegadorInternet

```java
exibirPagina(String url)
adicionarNovaAba()
atualizarPagina()
```

---

## 📱 Classe iPhone

A classe `iPhone` implementa simultaneamente as três interfaces, demonstrando o uso de **implementação múltipla de interfaces**, conforme as boas práticas da linguagem Java.

```java
public class iPhone implements 
    ReprodutorMusical, 
    AparelhoTelefonico, 
    NavegadorInternet
```

---

## ▶️ Classe Main

A classe `Main` foi criada para instanciar o objeto `iPhone` e testar todas as funcionalidades implementadas, exibindo mensagens no console.

---

## 🛠️ Tecnologias Utilizadas

* Java 17+
* Visual Studio Code
* Git & GitHub

---

## 🎯 Conceitos Aplicados

* Programação Orientada a Objetos (POO)
* Interfaces
* Implementação
* Polimorfismo
* Organização em pacotes
* Boas práticas de código Java

---

## 📚 Referência

* [Lançamento do iPhone – 2007](https://www.youtube.com/watch?v=9ou608QQRq8)
* [Digital Innovation One – Trilha Java Básico](https://www.dio.me)

---

## 👤 Autor

Projeto desenvolvido por **Roger**
Desafio proposto pela **Digital Innovation One (DIO)**.

```

---
