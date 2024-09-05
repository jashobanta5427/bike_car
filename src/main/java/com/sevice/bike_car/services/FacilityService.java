package com.sevice.bike_car.services;

import java.util.List;
import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;
import org.springframework.stereotype.Service;

import com.sevice.bike_car.models.Facility;

@Service
public class FacilityService extends CommonService{

	public Facility addFacility(Facility facility) {
		facility.setSerId(generateSequence("Facility_Seq").toString());
		return mongoTemplate.save(facility);
	}

	public List<Facility> getAllFacilities() {
		return mongoTemplate.findAll(Facility.class);
	}

	public Facility updateFacility(Facility facility) {

		return mongoTemplate.save(facility);
	}

	public String deleteFacility(String id) {
		mongoTemplate.findAndRemove(query(where("serId").is(id)), Facility.class);
		return "Successfully Deleted Facility: "+ id;
	}
}
