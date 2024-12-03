package com.benfit.concesionario.modelo;

import jakarta.persistence.*;

@Entity
public class OrdenTrabajo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Integer idOrdenTrabajo;

    @ManyToOne(optional = false)
    @JoinColumn(name="vehiculo_id")
     Vehiculo vehiculo;

     String descripcion;

     Boolean estatus;

}
