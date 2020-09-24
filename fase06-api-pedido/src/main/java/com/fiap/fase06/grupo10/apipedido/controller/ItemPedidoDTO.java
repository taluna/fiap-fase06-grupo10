package com.fiap.fase06.grupo10.apipedido.controller;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ItemPedidoDTO {
    private String descricao;
    private Integer quantidade;
    private Double valor;
    private Double precoUnitario;
}
