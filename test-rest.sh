#!/bin/bash
curl -i -X POST -H "Content-Type:application/json" -d '{"firstName" : "Frodo",  "lastName" : "Baggins", "email" : "frodo@baggins.net", "birthDate": "1981-04-08T00:00:00.00" }' http://localhost:8080/clients
curl -i -X POST -H "Content-Type:application/json" -d '{"name" : "Product 1", "price": 10.90 }' http://localhost:8080/products
curl -i -X POST -H "Content-Type:application/json" -d '{"client" : "http://localhost:8080/clients/1",  "product" : "http://localhost:8080/products/1"}' http://localhost:8080/orders
