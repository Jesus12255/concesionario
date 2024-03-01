package com.entrenamiento.app.domain.services.impl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;

import com.entrenamiento.app.domain.model.car.CarRequest;
import com.entrenamiento.app.domain.model.car.CarResponse;
import com.entrenamiento.app.domain.repository.CarRepository;
import com.entrenamiento.app.domain.services.CarService;

public class CarServiceImpl implements CarService{
	
	private CarRepository carRepository; 
	
	
	@Autowired
	public CarServiceImpl(CarRepository carRepository) {
		super();
		this.carRepository = carRepository;
	}

	
	@Override
	public Optional<List<CarResponse>> getAll() {
		return carRepository.getAll();
	}

	@Override
	public Optional<CarResponse> getCarRequest(UUID id) {
		return carRepository.getCarRequest(id);
	}

	@Override
	public CarRequest save(CarRequest carRequest) {
		return carRepository.save(carRequest);
	}

	@Override
	public boolean delete(UUID idCar) {
		try {
			carRepository.delete(idCar);
			return true;
		} catch (Exception e) {
			return false; 
		}
	}

}
