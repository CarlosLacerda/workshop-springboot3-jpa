# Projeto Web Services com Spring Boot, JPA e Hibernate

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://github.com/CarlosLacerda/workshop-springboot3-jpa/blob/main/LICENSE)
![Java](https://img.shields.io/badge/Java-22-007396?logo=java&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.5.4-6DB33F?logo=springboot&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-3+-C71A36?logo=apachemaven&logoColor=white)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-DB-336791?logo=postgresql&logoColor=white)

## 📌 Descrição
Este projeto foi desenvolvido como parte do curso **Java Completo - Programação Orientada a Objetos + Projetos** (DevSuperior).  
O objetivo é construir uma aplicação web de serviços REST utilizando **Spring Boot** e **JPA/Hibernate**, aplicando boas práticas de desenvolvimento.

## 🎯 Objetivos do Projeto
- Criar um projeto Spring Boot com Java
- Implementar o modelo de domínio
- Estruturar camadas lógicas: **resource**, **service**, **repository**
- Configurar banco de dados de teste (H2)
- Popular o banco de dados com dados iniciais
- Implementar operações CRUD (Create, Retrieve, Update, Delete)
- Tratar exceções de forma adequada
- Preparar o projeto para deploy em ambientes diferentes

## 🏗️ Tecnologias Utilizadas
- **Java 22.0.2**
- **Spring Boot 3.5.4**
- **Spring Data JPA**
- **Hibernate**
- **H2 Database** (teste)
- **PostgreSQL** (desenvolvimento e produção)
- **Maven** (embutido via Spring Boot/IDE)

## 📂 Estrutura do Projeto
- **domain** → entidades do modelo de domínio (User, Order, Category, Product, etc.)
- **repository** → interfaces JPA para acesso ao banco de dados
- **service** → camada de regras de negócio
- **resource (controller)** → camada de recursos REST
- **config** → configuração do banco de dados e perfis

## 🗄️ Modelo de Domínio
- **User**
- **Order** (com enum `OrderStatus`)
- **Category**
- **Product**
- **OrderItem** (associação muitos-para-muitos com atributos extras)
- **Payment**

## 🚀 Como executar o projeto
### Pré-requisitos
- Java 22
- IDE de sua preferência (IntelliJ, Eclipse ou VS Code)
- Banco de dados PostgreSQL (para perfil de desenvolvimento)

### Passos
1. Clonar o repositório:
   ```bash
   git clone https://github.com/CarlosLacerda/workshop-springboot3-jpa.git
   ```

2. Acessar a pasta do projeto:
   ```bash
   cd workshop-springboot3-jpa
   ```

3. Executar a aplicação com o perfil de teste (H2 Database):
   ```bash
   ./mvnw spring-boot:run -Dspring-boot.run.profiles=test
   ```
   Ou usar o botão **Run** da sua IDE

4. Acessar o console do H2 (perfil de teste):
   ```
   http://localhost:8080/h2-console
   ```

## ⚡ Endpoints Principais
- `GET /users` → Lista todos os usuários
- `GET /users/{id}` → Busca um usuário por ID
- `POST /users` → Cria um novo usuário
- `PUT /users/{id}` → Atualiza um usuário existente
- `DELETE /users/{id}` → Exclui um usuário

*Endpoints para pedidos, produtos e categorias serão adicionados em breve.*

## 📦 Deploy
O projeto suporta diferentes ambientes:
- **Test** → Banco H2 (em memória)
- **Dev** → PostgreSQL local
- **Prod** → Deploy em serviços como Heroku, AWS ou Railway

### Configuração para Deploy
1. Configurar as variáveis de ambiente para o banco de dados (ex.: `application-prod.properties`)
2. Executar o build do projeto:
   ```bash
   ./mvnw clean package
   ```
3. Fazer o deploy no serviço de sua escolha

## 📖 Referências
- [Repositório oficial do curso (Spring Boot 2)](https://github.com/acenelio/workshop-springboot2-jpa)
- [Repositório oficial do curso (Spring Boot 3)](https://github.com/acenelio/workshop-springboot3-jpa)

## 📜 Licença
Este projeto está licenciado sob a [MIT License](https://github.com/CarlosLacerda/workshop-springboot3-jpa/blob/main/LICENSE).

## 🤝 Contribuições
Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou pull requests no [repositório](https://github.com/CarlosLacerda/workshop-springboot3-jpa).
