package com.fiap.fase06.grupo10.apipedido.broker;

import com.fiap.fase06.grupo10.apipedido.broker.schema.PedidoCriado;
import com.fiap.fase06.grupo10.apipedido.broker.schema.PedidoKey;
import com.fiap.fase06.grupo10.apipedido.domain.Pedido;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

@Component
public class PedidoProducer {

    private final Processor processor;

    public PedidoProducer(Processor processor) {
        this.processor = processor;
    }

    public void send(Pedido pedido) {
        PedidoCriado pedidoCriado = new PedidoCriado();
        pedidoCriado.setId(pedido.getId());
        pedidoCriado.setClienteId(pedido.getClienteId());
        pedidoCriado.setPagamentoId(pedido.getPagamentoId());
        pedidoCriado.setStatus(pedido.getStatus());
        pedidoCriado.setValorTotal(pedido.getValorTotal());

        PedidoKey pedidoKey = new PedidoKey(pedidoCriado.getId());

        Message<PedidoCriado> message = MessageBuilder.withPayload(pedidoCriado)
                .setHeader(KafkaHeaders.MESSAGE_KEY, pedidoKey)
                .build();

        processor.output().send(message);

    }
}
