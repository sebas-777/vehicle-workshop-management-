package com.benfit.concesionario.modelo;

import jakarta.persistence.*;

@Entity
public class OrdenTrabajo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name="vehiculo_id")
    private Vehiculo vehiculo;

    private String descripcion;

    private Boolean estatus;

}
