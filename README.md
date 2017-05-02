# XY-INC

## Arquitetura

- Java 1.8
- Spring Boot 1.5.3
- Spring Rest Data
- Spring Data
- H2 Database (in memory)


Usando o spring-boot podemos usar o conceito de micro-service, sendo um serviço para cada módulo do sistema. Com o conceito de micro-service podemos desenvolver serviços com baixo acoplamento e alta coesão. Também está sendo utilizado o [JSON Hal](https://en.wikipedia.org/wiki/Hypertext_Application_Language) sendo necessário apenas declarar o repositório e todo o mapeamento de objetos complexo é transformado em URLs auto-referencia.

Para escalar o módulo poderá ser usado um loadbalance (haproxy ou nginx?), se o mesmo se encontrarem em servidores ou containers distintos.
Além disso, para que este módulo entre em produção seria necessário utilizar um banco de dados relacional real (PostGresSQL, MySQL (ou MariaDB), Oracle ou MSSQL), tem possibilidade de utilizar MongoDB, porem seria necessário alterar código. Foi utilizado o banco de dados relacional porque para nivel de exemplo torna mais fácil iniciar o projeto.


### Diagrama

![Diagrama da arquitetura](src/site/resources/images/xinc.class.png)

## Iniciando

Para iniciar o serviço basta executar:

### LINUX/UNIX/OSX

```
./mvnw spring-boot:run
```

### Windows

```
mvnw spring-boot:run
```

## Testes

Para testar estou utilizando o [cURL](https://curl.haxx.se/download.html), os comando são:


### Usuários

```
curl -i -X POST -H "Content-Type:application/json" -d '{"firstName" : "Frodo",  "lastName" : "Baggins", "email" : "frodo@baggins.net", "birthDate": "1981-04-08T00:00:00.00" }' http://localhost:8080/clients
```

### Produtos

```
curl -i -X POST -H "Content-Type:application/json" -d '{"name" : "Product 1", "price": 10.90 }' http://localhost:8080/products
```

### Pedidos

```
curl -i -X POST -H "Content-Type:application/json" -d '{"client" : "http://localhost:8080/clients/1",  "product" : "http://localhost:8080/products/1"}' http://localhost:8080/orders
```

## Endereço

[http://localhost:8080/](http://localhost:8080/)