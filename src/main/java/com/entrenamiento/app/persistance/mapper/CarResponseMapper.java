package com.entrenamiento.app.persistance.mapper;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.Mappings;

import com.entrenamiento.app.domain.model.car.CarResponse;
import com.entrenamiento.app.persistance.entity.CarEntity;


/**
 * convierte un carEntity a un carResponse
 * y viceversa 
 * */
@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface CarResponseMapper {
	/**
	 * source: objeto de origen 
	 * target: objeto de destino
	 * */

	CarResponse toCarResponse(CarEntity carEntity);
	
	@InheritInverseConfiguration
	CarEntity toCarEntity(CarResponse carResponse);
	
	List<CarResponse> toListCarResponse(List<CarEntity> carEntities); 
	
}
