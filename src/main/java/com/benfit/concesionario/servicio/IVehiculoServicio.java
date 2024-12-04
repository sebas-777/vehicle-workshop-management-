package com.benfit.concesionario.servicio;

import com.benfit.concesionario.modelo.Vehiculo;

import java.util.List;

public interface IVehiculoServicio {

    public List<Vehiculo>ListarVehiculos();

    public Vehiculo buscarVehiculoPorId(Integer idVehiculo);

    public Vehiculo guardarVehiculo(Vehiculo vehiculo);

    public void eliminarVehiculoPorId(Integer idVehiculo);

}
