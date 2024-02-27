package com.entrenamiento.app.domain.model.car;

import java.util.UUID;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class CarRequest {
	private UUID id; 
	private String brandCode; 
	private String reference; 
	private Double price; 
	private Integer modelYear;
	private String colorCode; 
	private Double horsepower; 
	private Double cylinderCapacity;  
	private String transmissionCode;
	private String fuelTipeCode; 
	private Integer numberSeats; 
	private String tractionCode; 
	private String addressCode; 
	private String categoryCode; 
	private String imagePath; 
}
