package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;
import java.util.Set;

@Data
@Entity
@Table(name = "PEDIDO_CLIENTE")
public class PedidoClienteModel {

    @Id
    @Column(name = "C_PEDIDO_CLIENTE")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long pedidoClienteId;

    @Column(name = "N_MESA_ASIGNADA")
    private int mesaAsignada;

    @Column(name = "F_TIEMPO_PREPARACION")
    private Data tiempoPreparacion;

    @ManyToOne
    @JoinColumn(name = "C_ESTADO", nullable = false)
    private EstadoPedidoModel estadoId;

    @ManyToOne
    @JoinColumn(name = "C_EXPRESS", nullable = false)
    private ExpressModel expressId;

    @ManyToOne
    @JoinColumn(name = "C_EMPLEADO", nullable = false)
    private EmpleadoModel empleadoId;

    @ManyToOne
    @JoinColumn(name = "C_CLIENTE", nullable = false)
    private ClienteModel clienteId;

    @ManyToOne
    @JoinColumn(name = "C_MENU", nullable = false)
    private MenuModel menuId;

    @OneToMany(mappedBy = "pedidoClienteId")
    private Set<FacturaModel> facturaId;
}

