# todolist
API para gerenciar tarefas (CRUD) que faz parte do desafio para pessoas desenvolvedoras backend júnior, que se candidatam para a Simplify.

O projeto foi elaborado nesse vídeo.

# Tecnologias
Spring Boot
Spring MVC
Spring Data JPA
SpringDoc OpenAPI 3
Postgres

# Práticas adotadas
API REST
Consultas com Spring Data JPA
Injeção de Dependências
Tratamento de respostas de erro
Geração automática do Swagger com a OpenAPI 3

# Como Executar:
Clonar repositório git
Construir o projeto:
$ ./mvnw clean package
Executar a aplicação:
$ java -jar target/todolist-0.0.1-SNAPSHOT.jar
A API poderá ser acessada em localhost:8080. O Swagger poderá ser visualizado em localhost:8080/psb/swagger-ui.html

# API Endpoints
Para fazer as requisições HTTP abaixo, foi utilizada a ferramenta insomnia:

