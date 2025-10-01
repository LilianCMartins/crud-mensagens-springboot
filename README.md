📝 **Projeto: CRUD de Mensagens com Spring Boot**

**Descrição**

API REST feita com Spring Boot que permite criar, listar, atualizar e deletar mensagens. Os dados são armazenados no banco de dados H2 em memória.

H2 Database

A aplicação permite criar, listar, atualizar e deletar mensagens, utilizando o padrão MVC (Model-View-Controller) e persistência com H2 Database.

🛠️ **Tecnologias Utilizadas**

  - Java 17+ / Java 21+
  - Spring Boot 3.5.x
  - Spring Data JPA
  - Banco de Dados H2 (em memória)
  -Postman (para testes)
  -IntelliJ IDEA

📦 **Estrutura do Projeto**


<img width="259" height="313" alt="image" src="https://github.com/user-attachments/assets/613afa53-4daa-4da3-b81a-0dc3f918c158" />

🧪 **Testando a API com Postman**

Você pode testar os endpoints com o Postman:

  ➕ **Criar mensagem**
  
  POST http://localhost:8080/mensagens
  
  {
    "texto": "Olá, mundo!"
  }
  
  📄 **Listar todas as mensagens**
  
  GET http://localhost:8081/mensagens
  
  🔍 **Buscar por ID**
  
  GET http://localhost:8081/mensagens/1
  
  ✏️ **Atualizar mensagem**
  
  PUT http://localhost:8081/mensagens/1
  
  {
    "texto": "Mensagem atualizada"
  }
  
  ❌ **Deletar mensagem**
  
  DELETE http://localhost:8081/mensagens/1

🗃️ **Console do H2**

Para acessar o banco de dados em memória:

Acesse: http://localhost:8081/h2-console

JDBC URL: jdbc:h2:mem:testdb

User: sa

Password: (deixe em branco)

📌 **Como executar o projeto**

Clone o repositório:

git clone https://github.com/seu-usuario/seu-repositorio.git


Abra o projeto no IntelliJ IDEA

Execute a classe DemoApplication

Acesse a API em http://localhost:8080

📚 **Aprendizados**

Este projeto serve para praticar:

Padrão MVC com Spring Boot

Organização em camadas (Controller, Service, Repository)

CRUD básico com banco em memória (H2)

Testes com Postman

✅ **Autor**

Desenvolvido por Lilian Martins
