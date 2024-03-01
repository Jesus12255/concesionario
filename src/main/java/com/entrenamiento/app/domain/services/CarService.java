package com.entrenamiento.app.domain.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.entrenamiento.app.domain.model.car.CarRequest;
import com.entrenamiento.app.domain.model.car.CarResponse;
import com.entrenamiento.app.domain.repository.CarRepository;

@Service
public interface CarService {
	
	
	/**
	 * Devuelve una lista de todos los coches
	 * @return Optional con lista de coches
	 * */
	Optional<List<CarResponse>> getAll();
	
	/**
	 * Devuelve coche dado su id
	 * @param id Id del coche
	 * @return Optional de coche encontrado
	 * */
	Optional<CarResponse> getCarRequest(UUID id); 
	
	/**
	 * Guarda un nuevo coche 
	 * @param carRequest Nuevo registro de coche a guardar
	 * @return coche guardado 
	 * */
	CarRequest save(CarRequest carRequest);
	
	/**
	 * Elimina el registro de un coche dado su id
	 * @param idCar Id del coche a eliminar
	 * */
	boolean delete(UUID idCar);
}
