package com.fiap.fase06.grupo10.apipedido.broker;

import com.fiap.fase06.grupo10.apipedido.broker.schema.PedidoCriado;
import com.fiap.fase06.grupo10.apipedido.broker.schema.PedidoKey;
import com.fiap.fase06.grupo10.apipedido.domain.Pedido;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class Producer {
    @Value("${topic.name}")
    private String TOPIC;

    private final KafkaTemplate<PedidoKey, PedidoCriado> kafkaTemplate;

    @Autowired
    public Producer(KafkaTemplate<PedidoKey, PedidoCriado> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void enviarPedido(Pedido pedido) {
        PedidoCriado pedidoCriado = new PedidoCriado();
        BeanUtils.copyProperties(pedido, pedidoCriado);
        PedidoKey key = new PedidoKey(pedidoCriado.getId(), pedidoCriado.getClienteId(),
                pedidoCriado.getRestauranteId());

        this.kafkaTemplate.send(TOPIC, key, pedidoCriado);
        log.info("Pedido enviado para pagamento -> {}", pedidoCriado);
    }
}
