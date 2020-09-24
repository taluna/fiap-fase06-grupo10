package com.fiap.fase06.grupo10.apipedido.repository;

import com.fiap.fase06.grupo10.apipedido.domain.Pedido;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PedidoRepository extends MongoRepository<Pedido, String> {
}
