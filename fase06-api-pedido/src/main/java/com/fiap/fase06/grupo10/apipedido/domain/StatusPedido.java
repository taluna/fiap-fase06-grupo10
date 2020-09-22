package com.fiap.fase06.grupo10.apipedido.domain;

import lombok.Getter;

@Getter
public enum StatusPedido {
    PROCESSADO(0,"Aguardando pagamento"),
    PAGO(1,"Aguardando confirmação do restaurante"),
    CONFIRMADO(2,"Em preparo"),
    RETIRADO(3,"Entregador a caminho"),
    ENTREGUE(4,"Finalizado"),
    CANCELADO(5, "Cancelado");

    private Integer id;
    private String name;

    StatusPedido(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
}
