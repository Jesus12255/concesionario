package com.entrenamiento.app.domain.model.car;

import java.util.UUID;

import lombok.Getter;
import lombok.Setter;


@Getter @Setter
public class CarResponse {

	private UUID id; 
	private String brandCode; 
	private String brand;
	private String reference; 
	private Double price; 
	private Integer modelYear;
	private String colorCode; 
	private String color; 
	private Double horsepower; 
	private Double cylinderCapacity;  
	private String transmissionCode;
	private String transmission;
	private String fuelTipeCode; 
	private String fuelTipe; 
	private Integer numberSeats; 
	private String tractionCode; 
	private String traction; 
	private String addressCode; 
	private String address; 
	private String categoryCode; 
	private String category; 
	private String imagePath; 
}
