# 📦 Mercado Livre - Sistema de Produtos em Java

## 🎯 Descrição

Este projeto acadêmico foi desenvolvido como atividade prática para a disciplina de **Programação Orientada a Objetos (POO)**. O sistema simula um marketplace inspirado no **Mercado Livre**, permitindo o cadastro, gerenciamento e listagem de produtos e eletrodomésticos.

O projeto foi desenvolvido em **Java** e aplica conceitos fundamentais de POO, como:

- 🏛️ **Classes e Objetos**
- 🔑 **Encapsulamento (Getters e Setters)**
- 🚀 **Sobrecarga de Construtores**
- 🧬 **Herança**
- 🧠 **Interfaces**
- 🔥 **Métodos Abstratos**

---

## 🗂️ Estrutura de Arquivos

📂 src
|- 📄 Eletrodomestico.java

|-📄 IRepositorio.java

|-📄 Main.java

|- 📄 Produto.java

|-📄 ProdutoRepositorio.java

---

## 🏗️ Funcionalidades das Classes

### ✔️ **Produto.java**
- 🔸 Classe **abstrata** que representa um produto genérico.
- 🔸 Atributos principais: `id`, `nome`, `preco`, `quantidade`, `descricao`.
- 🔸 Contém **Getters**, **Setters** e **3 construtores**.
- 🔸 Método **abstrato**: `exibirInformacoes()`.

### ✔️ **Eletrodomestico.java**
- 🔸 **Herda** da classe Produto.
- 🔸 Atributos adicionais: `potencia`, `voltagem`.
- 🔸 Implementa o método abstrato `exibirInformacoes()`.

### ✔️ **IRepositorio.java**
- 🔸 Interface que define operações básicas de repositório.
- 🔸 Métodos abstratos:
  - `adicionar()`
  - `remover()`
  - `listar()`
  - `buscarPorId()`

### ✔️ **ProdutoRepositorio.java**
- 🔸 **Implementa a interface IRepositorio**.
- 🔸 Gerencia a lista de produtos (adicionar, remover, listar e buscar).
- 🔸 Utiliza **ArrayList** para armazenamento temporário.

### ✔️ **Main.java**
- 🔸 Classe principal para execução do programa.
- 🔸 Cria objetos das classes e demonstra as funcionalidades do sistema:
  - Cadastro
  - Listagem
  - Busca
  - Remoção de produtos

---

## 🔧 Conceitos de POO Aplicados

| Conceito           | Implementação no Projeto                           |
| ------------------ | --------------------------------------------------- |
| **Encapsulamento** | Atributos privados + Getters e Setters             |
| **Construtores**   | Cada classe possui no mínimo 3 construtores        |
| **Herança**        | `Eletrodomestico` herda de `Produto`               |
| **Interface**      | `IRepositorio` define métodos obrigatórios         |
| **Abstração**      | `Produto` é uma classe abstrata                    |
| **Método Abstrato**| `exibirInformacoes()` na classe `Produto`          |

---

## 🚀 Como Executar

1. Clone o repositório:

```bash
git clone https://github.com/seu-usuario/nome-do-repositorio.git
```
2. Abra em sua IDE Java (Eclipse, IntelliJ, NetBeans ou VSCode com extensão Java).
3. Compile e execute o arquivo Main.java.
