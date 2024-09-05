package com.sevice.bike_car.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document("MetaData")
@Data
public class SequenceNumber {

	@Id
	private String id;
	
	private String seqName;
	private Long seqNum;
}
