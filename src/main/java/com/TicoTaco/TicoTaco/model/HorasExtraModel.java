package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "HORAS_EXTRA")
public class HorasExtraModel {

    @Id
    @Column(name = "C_HORAS_EXTRA")
    private Long horasExtraId;

    @Column(name = "Q_HORAS_EXTRA")
    private int cantidadHoras;

    @Column(name = "M_HORAS_EXTRA")
    private double montoHorasExtra;
}
