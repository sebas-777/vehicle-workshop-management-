package com.benfit.concesionario.modelo;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.io.Serializable;


@Entity
@Table(name="vehiculo")
public class Vehiculo implements Serializable {

    private static final long serialVersionUID= 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
     Integer idVehiculo;

    @Column(name="matricula")
    private String matricula;

    @NotBlank
    @Column(name="marca")
     String marca;

    @Column(name="modelo")
     String modelo;

    @Column(name="fabricado")
     Integer fabricado;

    public Integer getIdVehiculo() {
        return idVehiculo;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Integer getFabricado() {
        return fabricado;
    }

    public void setIdVehiculo(Integer idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setFabricado(Integer fabricado) {
        this.fabricado = fabricado;
    }

    public Vehiculo(Integer idVehiculo, String matricula, String marca, String modelo, Integer fabricado) {
        this.idVehiculo = idVehiculo;
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.fabricado = fabricado;
    }

    public Vehiculo() {
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "idVehiculo=" + idVehiculo +
                ", matricula='" + matricula + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", fabricado=" + fabricado +
                '}';
    }
}
