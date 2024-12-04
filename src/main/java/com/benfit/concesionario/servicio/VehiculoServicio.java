package com.benfit.concesionario.servicio;

import com.benfit.concesionario.modelo.Vehiculo;
import com.benfit.concesionario.repositorio.VehiculoRepositorio;
import jakarta.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@Transactional
public class VehiculoServicio implements IVehiculoServicio {

    private final static Logger logger = LoggerFactory.getLogger(VehiculoServicio.class);

    @Autowired
    private VehiculoRepositorio vehiculoRepositorio;

    @Override
    @Transactional
    public List<Vehiculo> ListarVehiculos() {
        try{
            return vehiculoRepositorio.findAll();
        } catch (Exception e) {
            logger.error("Error al listar vehiculos{}",e.getMessage(),e);
            throw e;
        }


    }

    @Override
    public Vehiculo buscarVehiculoPorId(Integer idVehiculo) {
        Vehiculo vehiculo = vehiculoRepositorio.findById(idVehiculo).orElse(null);
        return vehiculo;
    }

    @Override
    public Vehiculo guardarVehiculo(Vehiculo vehiculo) {
        return vehiculoRepositorio.save(vehiculo);

    }

    @Override
    public void eliminarVehiculoPorId(Integer idVehiculo) {
        this.vehiculoRepositorio.deleteById(idVehiculo);

    }
}
