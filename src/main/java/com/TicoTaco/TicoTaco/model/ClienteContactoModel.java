package com.TicoTaco.TicoTaco.model;

import com.TicoTaco.TicoTaco.serializable.ClienteContactoId;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class ClienteContactoModel {

    @EmbeddedId
    private ClienteContactoId id;

    @ManyToOne
    @MapsId("clienteId")
    @JoinColumn(name = "C_CLIENTE", nullable = false)
    private ClienteModel clienteId;

    @ManyToOne
    @MapsId("contactoId")
    @JoinColumn(name = "C_CONTACTO", nullable = false)
    private ContactoModel contactoId;
}
