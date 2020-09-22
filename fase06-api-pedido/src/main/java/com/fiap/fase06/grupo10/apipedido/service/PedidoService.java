package com.fiap.fase06.grupo10.apipedido.service;

import com.fiap.fase06.grupo10.apipedido.broker.PedidoProducer;
import com.fiap.fase06.grupo10.apipedido.controller.CriarPedidoRequestDTO;
import com.fiap.fase06.grupo10.apipedido.controller.CriarPedidoResponseDTO;
import com.fiap.fase06.grupo10.apipedido.domain.Pedido;
import com.fiap.fase06.grupo10.apipedido.domain.StatusPedido;
import com.fiap.fase06.grupo10.apipedido.repository.PedidoRepository;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {

    private final PedidoRepository pedidoRepository;
    private final PedidoProducer pedidoProducer;

    public PedidoService(PedidoRepository pedidoRepository, PedidoProducer pedidoProducer){
        this.pedidoRepository = pedidoRepository;
        this.pedidoProducer = pedidoProducer;
    }

    public CriarPedidoResponseDTO criarPedido(CriarPedidoRequestDTO pedidoDTO) {

        Pedido pedido = createPedido(pedidoDTO);

        Pedido pedidoCriado = pedidoRepository.save(pedido);

        pedidoProducer.send(pedidoCriado);

        return new CriarPedidoResponseDTO(pedidoCriado.getId(), pedidoCriado.getStatus());
    }

    private Pedido createPedido(CriarPedidoRequestDTO pedidoDTO) {
        Pedido pedido = new Pedido(pedidoDTO.getClienteId(),
                pedidoDTO.getEndereco(),
                pedidoDTO.getCep(),
                StatusPedido.PROCESSADO.getName(),
                pedidoDTO.getRestauranteId());
        pedido.setItems(pedidoDTO.getItems());
        pedido.setPagamentoId(pedidoDTO.getPagamentoId());
        return pedido;
    }
}
