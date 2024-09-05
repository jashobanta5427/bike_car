package com.sevice.bike_car.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document("Facilities")
@Data
public class Facility {

	@Id
	private String id;
	
	private String serId;
	private String serName;
	private Double price;
	private String serCategory;
	
}
