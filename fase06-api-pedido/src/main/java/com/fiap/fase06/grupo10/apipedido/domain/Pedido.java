package com.fiap.fase06.grupo10.apipedido.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document("pedido")
public class Pedido {
    @Id
    private String id;
    private String clienteId;
    private String endereco;
    private String cep;
    private String status;
    private String restauranteId;
    private String pagamentoId;
    private List<ItemPedido> items;

    public Pedido(String clienteId, String endereco, String cep,String status, String restauranteId) {
        this.clienteId = clienteId;
        this.endereco = endereco;
        this.cep = cep;
        this.status = status;
        this.restauranteId = restauranteId;
    }

    public void setItems(final List<ItemPedido> items){
        this.items = List.copyOf(items);
    }

    public Double getValorTotal(){
        return items.stream()
                .map(ItemPedido::getValor)
                .reduce((double) 0, Double::sum);
    }
}

