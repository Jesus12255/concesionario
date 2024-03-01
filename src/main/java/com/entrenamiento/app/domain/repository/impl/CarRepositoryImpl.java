package com.entrenamiento.app.domain.repository.impl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.entrenamiento.app.domain.model.car.CarRequest;
import com.entrenamiento.app.domain.model.car.CarResponse;
import com.entrenamiento.app.domain.repository.CarRepository;
import com.entrenamiento.app.persistance.entity.CarEntity;
import com.entrenamiento.app.persistance.mapper.CarRequestMapper;
import com.entrenamiento.app.persistance.mapper.CarResponseMapper;
import com.entrenamiento.app.persistance.repository.CarCrudRepository;

@Repository
public class CarRepositoryImpl implements CarRepository{

	private final CarCrudRepository carCrudRepository; 
	private final CarRequestMapper carRequestMapper; 
	private final CarResponseMapper carResponseMapper;
	
	
	@Autowired
	public CarRepositoryImpl(CarCrudRepository carCrudRepository, CarRequestMapper carRequestMapper,
			CarResponseMapper carResponseMapper) {
		super();
		this.carCrudRepository = carCrudRepository;
		this.carRequestMapper = carRequestMapper;
		this.carResponseMapper = carResponseMapper;
	}

	@Override
	public Optional<List<CarResponse>> getAll() {
		List<CarEntity> carEntities = carCrudRepository.findAll();
		List<CarResponse> carResponses = carResponseMapper.toListCarResponse(carEntities);
		return Optional.ofNullable(carResponses);
	}

	@Override
	public Optional<CarResponse> getCarRequest(UUID id) {
		return carCrudRepository.findById(id).map(carResponseMapper::toCarResponse);
	}

	@Override
	public CarRequest save(CarRequest carRequest) {
		CarEntity carEntity = carRequestMapper.toCarEntity(carRequest);
		return carRequestMapper.toCarRequest(carCrudRepository.save(carEntity));
	}

	@Override
	public void delete(UUID idCar) {
		carCrudRepository.deleteById(idCar);
		
	}

}
