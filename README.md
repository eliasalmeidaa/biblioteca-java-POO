# Biblioteca POO

Sistema de controle de biblioteca desenvolvido em Java, aplicando conceitos de Programação Orientada a Objetos (POO), como exercício de faculdade.

## Sobre o projeto

O sistema permite cadastrar livros e usuários, realizar empréstimos e devoluções, e controlar a quantidade disponível de cada livro em estoque. A interação acontece via terminal, através de um menu com `Scanner`.

## Classes

- **Livro** — título, autor, ISBN, ano de publicação e quantidade disponível.
- **Usuario** — nome, CPF, matrícula e email.
- **Emprestimo** — data do empréstimo, data de devolução, e os objetos `Livro` e `Usuario` envolvidos. Controla o estoque do livro ao emprestar (diminui) e devolver (aumenta).
- **Main** — menu no terminal para cadastrar livros, cadastrar usuários, realizar empréstimos e devoluções.

## Funcionalidades implementadas

- Cadastro de livro
- Cadastro de usuário
- Realizar empréstimo (com checagem de estoque)
- Devolver livro (com checagem se o livro foi emprestado)
- Menu interativo via terminal

## O que falta

- **Persistência em banco de dados (MySQL)** — atualmente os dados existem apenas em memória, enquanto o programa está rodando. Ao fechar o programa, tudo é perdido. O próximo passo é conectar o projeto a um banco MySQL para salvar livros, usuários e empréstimos de forma permanente.
- Suporte a múltiplos livros e usuários simultâneos (listas), com busca por ISBN e CPF.
- Consulta de livros disponíveis e de empréstimos realizados.
- Validação para não permitir ISBN e CPF duplicados.

## Tecnologias

- Java
- IntelliJ IDEA

## Como executar

1. Clone o repositório
2. Abra o projeto no IntelliJ
3. Rode a classe `Main`
