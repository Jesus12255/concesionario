package com.entrenamiento.app.persistance.entity;

import java.util.UUID;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "car")
public class CarEntity {
	
	@Id
	@Column(name = "car_id")
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id; 
	
	@Column(name = "brand_code")
	private String brandCode; 
	
	private String reference; 
	
	private Double price; 
	
	@Column(name = "model_year")
	private Integer modelYear;
	
	@Column(name = "color_code")
	private String colorCode; 
	
	private Double horsepower; 
	
	@Column(name = "cylinder_capacity")
	private Double cylinderCapacity;  
	
	@Column(name = "transmission_code")
	private String transmissionCode;
	
	@Column(name = "fuel_tipe_code")
	private String fuelTipeCode; 
	
	@Column(name = "number_seats")
	private Integer numberSeats; 
	
	@Column(name = "traction_code")
	private String tractionCode; 
	
	@Column(name = "address_code")
	private String addressCode; 
	
	@Column(name = "category_code")
	private String categoryCode; 

	@Column(name = "image_path")
	private String imagePath; 
}
