package com.benfit.concesionario.controlador;


import com.benfit.concesionario.modelo.Vehiculo;
import com.benfit.concesionario.servicio.VehiculoServicio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//http://locahost:8010/concesionario-app
@RequestMapping("concesionario-app")
@CrossOrigin(value = "http://localhost:4200")
public class VehiculoControlador {

    private static final Logger logger = LoggerFactory.getLogger(VehiculoControlador.class);

    @Autowired
    private VehiculoServicio vehiculoServicio;

    //http://localhost:8010/concesionario-app/vehiculos
    @GetMapping("/vehiculos")
    public List<Vehiculo> obtenerVehiculos(){
        List<Vehiculo>vehiculos = this.vehiculoServicio.ListarVehiculos();
        logger.info("Vehiculos obtenidos:");
        vehiculos.forEach((vehiculo -> logger.info(vehiculo.toString())));
        System.out.println(vehiculos);
        return vehiculos;

    }

}
