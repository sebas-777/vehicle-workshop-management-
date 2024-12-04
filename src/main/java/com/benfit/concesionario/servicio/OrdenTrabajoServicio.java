package com.benfit.concesionario.servicio;

import com.benfit.concesionario.modelo.OrdenTrabajo;
import com.benfit.concesionario.repositorio.OrdenTrabajoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class OrdenTrabajoServicio implements IOrdenTrabajoServicio {

    @Autowired
    private OrdenTrabajoRepositorio ordenTrabajoRepositorio;


    @Override
    public List<OrdenTrabajo> listarOrdenesTrabajo() {

       return this.ordenTrabajoRepositorio.findAll();

    }

    @Override
    public OrdenTrabajo buscarOrdenPorId(Integer idOrdenTrabajo) {
        OrdenTrabajo ordenTrabajo = this.ordenTrabajoRepositorio.findById(idOrdenTrabajo).orElse(null);
        return ordenTrabajo;
    }

    @Override
    public void guardarOrden(OrdenTrabajo ordenTrabajo) {
        this.ordenTrabajoRepositorio.save(ordenTrabajo);
    }

    @Override
    public void eliminarOrdenPorId(Integer idOrdenTrabajo) {
        this.ordenTrabajoRepositorio.deleteById(idOrdenTrabajo);

    }
}
