package com.fiap.fase06.grupo10.apipedido.controller;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fiap.fase06.grupo10.apipedido.domain.ItemPedido;
import lombok.Data;

import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CriarPedidoRequestDTO {
    private String clienteId;
    private String cep;
    private String endereco;
    private String restauranteId;
    private String pagamentoId;
    private List<ItemPedido> items;
}
