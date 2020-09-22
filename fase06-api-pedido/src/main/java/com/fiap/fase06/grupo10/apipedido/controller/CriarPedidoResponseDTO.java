package com.fiap.fase06.grupo10.apipedido.controller;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fiap.fase06.grupo10.apipedido.domain.ItemPedido;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CriarPedidoResponseDTO {
    private String id;
    private String status;
}
