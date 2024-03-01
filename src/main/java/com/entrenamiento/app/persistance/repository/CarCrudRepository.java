package com.entrenamiento.app.persistance.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entrenamiento.app.persistance.entity.CarEntity;

public interface CarCrudRepository extends JpaRepository<CarEntity, UUID>{

}
