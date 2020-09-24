package com.fiap.fase06.grupo10.apipedido.service;

import com.fiap.fase06.grupo10.apipedido.controller.CriarPedidoRequestDTO;
import com.fiap.fase06.grupo10.apipedido.controller.CriarPedidoResponseDTO;
import com.fiap.fase06.grupo10.apipedido.controller.PedidoDTO;
import com.fiap.fase06.grupo10.apipedido.controller.VerPedidoResponse;
import com.fiap.fase06.grupo10.apipedido.domain.Pedido;
import com.fiap.fase06.grupo10.apipedido.domain.StatusPedido;
import com.fiap.fase06.grupo10.apipedido.repository.PedidoRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PedidoService {

    private final PedidoRepository pedidoRepository;

    public PedidoService(PedidoRepository pedidoRepository){
        this.pedidoRepository = pedidoRepository;
    }

    public CriarPedidoResponseDTO criarPedido(CriarPedidoRequestDTO pedidoDTO) {
        Pedido pedido = new Pedido();
        BeanUtils.copyProperties(pedidoDTO, pedido);
        pedido.setStatus(StatusPedido.PROCESSADO.getName());
        Pedido pedidoCriado = pedidoRepository.save(pedido);
        return new CriarPedidoResponseDTO(pedidoCriado.getId(), pedidoCriado.getStatus());
    }

    public VerPedidoResponse listarPedidos(){
        List<Pedido> pedidos = pedidoRepository.findAll();
        List<PedidoDTO> pedidosDTO = new ArrayList<>();
        for (Pedido source: pedidos ) {
            PedidoDTO target= new PedidoDTO();
            BeanUtils.copyProperties(source , target);
            pedidosDTO.add(target);
        }
        return new VerPedidoResponse(pedidosDTO);
    }

}
