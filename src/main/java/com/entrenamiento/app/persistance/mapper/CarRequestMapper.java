package com.entrenamiento.app.persistance.mapper;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

import com.entrenamiento.app.domain.model.car.CarRequest;
import com.entrenamiento.app.persistance.entity.CarEntity;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface CarRequestMapper {
	
	CarRequest toCarRequest(CarEntity carEntity);

	@InheritInverseConfiguration
	CarEntity tCarEntity(CarRequest carRequest);
	
	List<CarEntity> toListCarEntity(List<CarRequest> carRequests);
}
