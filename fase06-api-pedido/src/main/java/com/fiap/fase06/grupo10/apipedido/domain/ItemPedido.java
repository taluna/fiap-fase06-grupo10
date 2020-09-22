package com.fiap.fase06.grupo10.apipedido.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ItemPedido {
    private String codigo;
    private Integer quantidade;
    private Double precoUnitario;

    public Double getValor(){
        return quantidade * precoUnitario;
    }
}
