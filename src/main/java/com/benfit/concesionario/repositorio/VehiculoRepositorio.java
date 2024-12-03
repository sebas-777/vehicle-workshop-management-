package com.benfit.concesionario.repositorio;

import com.benfit.concesionario.modelo.Vehiculo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehiculoRepositorio extends JpaRepository<Vehiculo,Integer> {
}
