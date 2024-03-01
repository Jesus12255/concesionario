package com.entrenamiento.app.controller;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entrenamiento.app.domain.model.car.CarRequest;
import com.entrenamiento.app.domain.model.car.CarResponse;
import com.entrenamiento.app.domain.services.CarService;

@RestController
@RequestMapping(path = "/car")
public class CarController {
	
	private CarService carService;
	
	@Autowired
	public CarController(CarService carService) {
		super();
		this.carService = carService;
	} 
	
	@GetMapping
	public ResponseEntity<List<CarResponse>> getAll(){
		return ResponseEntity.of(carService.getAll());
	}
	
	@GetMapping(path = "/{id}")
	public  ResponseEntity<CarResponse> getCarRequest(@PathVariable UUID id) {
		return ResponseEntity.of(carService.getCarRequest(id));
	}
	
	@PostMapping
	public ResponseEntity<CarRequest> save(@RequestBody CarRequest carRequest) {
		try {
			return ResponseEntity.status(HttpStatus.CREATED)
				.body(carService.save(carRequest));
		} catch(Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
		}
	}
}
