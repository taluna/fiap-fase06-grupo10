package com.fiap.fase06.grupo10.apipedido.controller;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class VerPedidoResponse {
    List<PedidoDTO> pedidos;
}
