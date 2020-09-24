package com.fiap.fase06.grupo10.apipedido.config;

import org.springframework.boot.autoconfigure.mongo.MongoProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


@Configuration
@EnableConfigurationProperties({MongoProperties.class})
@EnableMongoRepositories(basePackages = {"com.fiap.fase06.grupo10.apipedido.repository"})
public class MongoConfig {
}
