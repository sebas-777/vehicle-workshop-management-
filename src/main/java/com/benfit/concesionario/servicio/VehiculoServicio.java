package com.benfit.concesionario.servicio;

import com.benfit.concesionario.modelo.Vehiculo;
import com.benfit.concesionario.repositorio.VehiculoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class VehiculoServicio implements IVehiculoServicio {

    @Autowired
    private VehiculoRepositorio vehiculoRepositorio;

    @Override
    public List<Vehiculo> ListarVehiculos() {
        this.vehiculoRepositorio.findAll();
        return List.of();
    }

    @Override
    public Vehiculo buscarVehiculoPorId(Integer idVehiculo) {
        Vehiculo vehiculo = this.vehiculoRepositorio.findById(idVehiculo).orElse(null);
        return vehiculo;
    }

    @Override
    public void guardarVehiculo(Vehiculo vehiculo) {
        this.vehiculoRepositorio.save(vehiculo);

    }

    @Override
    public void eliminarVehiculoPorId(Integer idVehiculo) {
        this.vehiculoRepositorio.deleteById(idVehiculo);

    }
}
