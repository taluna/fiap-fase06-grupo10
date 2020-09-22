package com.fiap.fase06.grupo10.apipedido;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.cloud.stream.schema.client.EnableSchemaRegistryClient;

@SpringBootApplication
@EnableBinding(Processor.class)
@EnableSchemaRegistryClient
public class ApiPedidoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiPedidoApplication.class, args);
    }
}
