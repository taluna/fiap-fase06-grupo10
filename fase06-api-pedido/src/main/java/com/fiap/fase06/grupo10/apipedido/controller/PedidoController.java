package com.fiap.fase06.grupo10.apipedido.controller;

import com.fiap.fase06.grupo10.apipedido.service.PedidoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/pedidos")
public class PedidoController {

    private final PedidoService pedidoService;

    public PedidoController(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }

    @PostMapping
    public ResponseEntity criarPedido(@RequestBody CriarPedidoRequestDTO pedidoDTO) {
        CriarPedidoResponseDTO responseDTO = pedidoService.criarPedido(pedidoDTO);
        return new ResponseEntity<>(responseDTO, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity listarPedidos() {
        VerPedidoResponse responseDTO = pedidoService.listarPedidos();
        return new ResponseEntity<>(responseDTO, HttpStatus.CREATED);
    }
}
