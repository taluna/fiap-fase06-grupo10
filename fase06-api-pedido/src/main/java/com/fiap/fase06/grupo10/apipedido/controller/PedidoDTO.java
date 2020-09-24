package com.fiap.fase06.grupo10.apipedido.controller;

import com.fiap.fase06.grupo10.apipedido.domain.ItemPedido;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PedidoDTO {
    private String id;
    private String status;
    private Double valorTotal;
    private List<ItemPedido> items;
}
