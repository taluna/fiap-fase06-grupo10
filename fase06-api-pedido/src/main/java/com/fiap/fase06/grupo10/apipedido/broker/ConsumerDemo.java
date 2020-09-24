package com.fiap.fase06.grupo10.apipedido.broker;

import com.fiap.fase06.grupo10.apipedido.broker.schema.PedidoCriado;
import com.fiap.fase06.grupo10.apipedido.broker.schema.PedidoKey;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ConsumerDemo {

    @KafkaListener(topics = "pedido", groupId = "pedido-1")
    public void consume(ConsumerRecord<PedidoKey, PedidoCriado> record) {
        log.info("Pedido recebido para pagamento -> {}", record.value());
    }
}
