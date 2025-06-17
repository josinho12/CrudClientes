# 📦 CRUD de Clientes - API REST com Spring Boot

Este é um projeto de uma **API REST** desenvolvida em **Java 21** com Spring Boot, que permite realizar operações **CRUD** (Create, Read, Update, Delete) em um cadastro de clientes. Foi desenvolvido como parte de um desafio técnico e tem como objetivo demonstrar conhecimento em construção de APIs, boas práticas e organização de código.

---

## 🚀 Tecnologias utilizadas

- Java 21
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 Database (em memória)
- Maven
- Insomnia (ou Postman) para testes de requisição

---

## 📁 Estrutura do projeto
```
CRUD-CLIENTES/
├── src/
│ ├── main/
│ │ └── java/com/josue/crudclientes/
│ │ ├── controller/
│ │ ├── model/
│ │ ├── repository/
│ │ └── CrudClientesApplication.java
│ ├── resources/
│ └── test/
├── pom.xml
└── README.md
```
---

## 🧪 Como executar o projeto localmente

1. **Clone o repositório:**

```
git clone https://github.com/josinho12/CRUD-CLIENTES.git
cd CRUD-CLIENTES
```
2. **Execute a aplicação com Maven:**
````
./mvnw spring-boot:run
````
A API será iniciada em:
📍 http://localhost:8080

🔁 Endpoints disponíveis
| Método | Rota           |Descrição|
| -------| -------------  |------------- 
| POST   | /clientes      | Cadastra um novo cliente  |
| GET    | /clientes      | Lista todos os clientes  |
| GET    | /clientes/{id} | Busca cliente por ID |
| PUT    | /clientes/{id} | Atualiza dados do cliente  |
| DELETE | /clientes/{id} | Remove cliente do sistema  |


📬 Exemplo de requisição (POST /clientes)

URL: http://localhost:8080/clientes

Método: POST

Corpo da requisição (JSON):
````
{
  "nome": "João da Silva",
  "email": "joao@email.com" 
}
````
🧰 Banco de dados H2
Durante a execução, o banco roda em memória e pode ser acessado pelo navegador em:

🔗 http://localhost:8080/h2-console

JDBC URL: jdbc:h2:mem:testdb

Usuário: sa

Senha: (em branco)

👨‍💻 Autor
Josué Borges
📧 jsueborges@gmail.com

🔗 LinkedIn [(https://www.linkedin.com/in/josu%C3%A9-borges-b0b65b291/)]
