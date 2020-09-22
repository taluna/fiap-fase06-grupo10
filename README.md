# fiap-fase06-grupo10

#### Realizar o build do projeto

```make build-projects```

#### Subir a aplicação e suas dependências

```docker-compose up -d```

#### Pedido

Endpoint para criar pedido http://localhost:8080/pedidos

Para testar, criar uma collection no Postman com method POST e passar o json correspondente da classe CriarPedidoRequestDTO body da requisição.

A criação do pedido vai gravar o pedido no MongoDB e enviar uma mensagem para o Kafka utilizando a Spring Cloud Stream com Apache Avro
