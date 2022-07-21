package com.example.vendas.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "tb_item_pedidos")
public class ItemPedido {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "pedido_id")
    private Pedido pedido;

    @ManyToOne
    @JoinColumn(name = "produto_id")
    private Produto produto;

    @Column
    private Integer quantidade;


}
