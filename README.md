<h2>API REST CRUD pessoas com Spring Boot</h2>

### Pontos importantes do projeto
* Setup inicial de projeto com o Spring Boot Initialzr 
* Criação de modelo de dados para o mapeamento de entidades em bancos de dados
* Operações implementadas (Cadastro, leitura, atualização e exclusão de pessoas de um sistema).
* Relação de cada uma das operações acima com o padrão arquitetural REST.
* Testes unitários implementado para validação das funcionalidades
* Implantação do sistema na nuvem através do Heroku

Para executar o projeto no terminal, digite o seguinte comando:

```shell script
mvn spring-boot:run 
```

Após executar o comando acima, basta apenas abrir o seguinte endereço e visualizar a execução do projeto:

```
http://localhost:8080/api/v1/people

```
Pré-requisitos para a execução do projeto desenvolvido:

* Java 11 ou versões superiores.
* Maven 3.6.3 ou versões superiores.
* Uma IDE exemplo Intellj IDEA Community Edition, Eclipse ou qualquer outra de sua escolha.

Abaixo, seguem links bem bacanas:

* [SDKMan! para gerenciamento e instalação do Java e Maven](https://sdkman.io/)
* [Referência do Intellij IDEA Community, para download](https://www.jetbrains.com/idea/download)
* [Site oficial do Spring](https://spring.io/)
* [Site oficial do Spring Initialzr, para setup do projeto](https://start.spring.io/)
* [Site oficial do Heroku](https://www.heroku.com/)
* [Site oficial do GIT](https://git-scm.com/)
* [Site oficial do GitHub](http://github.com/)
* [Documentação oficial do Lombok](https://projectlombok.org/)
* [Documentação oficial do Map Struct](https://mapstruct.org/)
* [Referência para o padrão arquitetural REST](https://restfulapi.net/)


# Para Acessar o banco h2 console após execultar o projeto.
* http://localhost:8080/h2-console   
* em seguida no caminho  JDBC URL Adicionar : jdbc:h2:mem:testdb esse caminho é exibido no console quando levantamos o projeto, depois é só se conectar em conect. <br />

# Padrão DTO utilizado neste projeto. 
Um dos objetivos de receber uma classe dto como argumento é o tratamento de exceção <br />
Se fossemos receber uma classe de entidade de banco de dados e ocorrer algum tipo de exceção <br />
Iriamos ter exceção expecificas do banco de dados em nossa aplicação e seria algo mais complicado de tratar. <br />

# map struct biblioteca.org
disponibiliza através de uma unica interface,  faz uma conversão de um objeto de uma entidade para um DTO e de um DTO para uma entidade.
é preciso adicionar a dependencia mapstruct no pom.xml


