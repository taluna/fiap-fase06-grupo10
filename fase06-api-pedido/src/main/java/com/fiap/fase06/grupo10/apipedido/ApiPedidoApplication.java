package com.fiap.fase06.grupo10.apipedido;

import org.modelmapper.ModelMapper;
import org.modelmapper.config.Configuration;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ApiPedidoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiPedidoApplication.class, args);
    }
}
