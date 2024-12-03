package com.benfit.concesionario.servicio;

import com.benfit.concesionario.modelo.OrdenTrabajo;

import java.util.List;

public interface IOrdenTrabajoServicio {

    public List<OrdenTrabajo> listarOrdenesTrabajo();

    public OrdenTrabajo buscarOrdenPorId(Integer idOrdenTrabajo);

    public void guardarOrden(OrdenTrabajo ordenTrabajo);

    public void eliminarOrdenPorId(Integer idOrdenTrabajo);

}
