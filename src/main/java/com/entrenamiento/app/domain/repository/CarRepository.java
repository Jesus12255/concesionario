package com.entrenamiento.app.domain.repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.entrenamiento.app.domain.model.car.CarRequest;
import com.entrenamiento.app.domain.model.car.CarResponse;

public interface CarRepository {
	
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
	void delete(UUID idCar);
}
