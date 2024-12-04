package com.benfit.concesionario.controlador;


import com.benfit.concesionario.modelo.Vehiculo;
import com.benfit.concesionario.servicio.VehiculoServicio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping(value="/vehiculos",produces="application/json")
    @ResponseBody
    public List<Vehiculo> obtenerVehiculos(){
       try{
           List<Vehiculo>vehiculos = this.vehiculoServicio.ListarVehiculos();
           logger.info("Vehiculos obtenidos desde la base de datos:");
           vehiculos.forEach((vehiculo -> logger.info(vehiculo.toString())));
           System.out.println(vehiculos);
           return vehiculos;
       }catch (Exception e){
           logger.error("Error obtenidos vehiculos:{}",e.getMessage(),e);
           throw e;
       }

    }

    //http://localhost:8010/concesionario-app/guardar
    @PostMapping(value = "/guardar",consumes="application/json")
    public Vehiculo guardarVehiculo( @RequestBody Vehiculo vehiculo){
        try{
            return vehiculoServicio.guardarVehiculo(vehiculo);
        } catch (Exception e) {
            logger.error("Error al guardar vehiculos:{}",e.getMessage(),e);
            throw e;
        }

    }

    //http://localhost:8010/concesionario-app/1
    @GetMapping("/{idVehiculo}")
    public Vehiculo buscarVehiculoPorId(@PathVariable Integer idVehiculo){
        try {
            return vehiculoServicio.buscarVehiculoPorId(idVehiculo);
        }catch (Exception e){
            logger.error("Error al buscar vehiculo con ID:{}",idVehiculo,e);
            throw e;
        }
    }

    @DeleteMapping("/{idVehiculo}")
    public void eliminarVehiculoPorId(@PathVariable Integer idVehiculo){
        try{
            vehiculoServicio.eliminarVehiculoPorId(idVehiculo);
        } catch (Exception e) {
            logger.error("Error al eliminar vehiculo con ID:{}",idVehiculo,e);
            throw new RuntimeException(e);
        }
    }



}
