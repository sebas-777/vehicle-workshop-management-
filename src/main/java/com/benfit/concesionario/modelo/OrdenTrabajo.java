package com.benfit.concesionario.modelo;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
public class OrdenTrabajo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Integer idOrdenTrabajo;

    @ManyToOne(optional = false)
    @JoinColumn(name="vehiculo_id")
     Vehiculo vehiculo;

    @NotBlank
    @Column(name="descripcion")
     String descripcion;

    @Column(name="estatus")
     Boolean estatus;

    public Integer getIdOrdenTrabajo() {
        return idOrdenTrabajo;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Boolean getEstatus() {
        return estatus;
    }

    public void setIdOrdenTrabajo(Integer idOrdenTrabajo) {
        this.idOrdenTrabajo = idOrdenTrabajo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setEstatus(Boolean estatus) {
        this.estatus = estatus;
    }

    public OrdenTrabajo() {
    }

    public OrdenTrabajo(Integer idOrdenTrabajo, Vehiculo vehiculo, String descripcion, Boolean estatus) {
        this.idOrdenTrabajo = idOrdenTrabajo;
        this.vehiculo = vehiculo;
        this.descripcion = descripcion;
        this.estatus = estatus;
    }

    @Override
    public String toString() {
        return "OrdenTrabajo{" +
                "idOrdenTrabajo=" + idOrdenTrabajo +
                ", vehiculo=" + vehiculo +
                ", descripcion='" + descripcion + '\'' +
                ", estatus=" + estatus +
                '}';
    }
}
