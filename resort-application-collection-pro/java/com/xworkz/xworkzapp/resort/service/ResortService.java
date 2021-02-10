package com.xworkz.xworkzapp.resort.service;

import java.util.List;

import com.xworkz.xworkzapp.resort.dto.ResortDTO;

public interface ResortService {

	boolean validateAndSave(ResortDTO dto);
	
	boolean validateAndUpdateLocationByName(String location,String name);
	
	boolean validateAndUpdateLocationByNameandRating(String location,String name,float rating);
	
	boolean validateAndDeleteByNameAndLocation(String name,String location);
	
	boolean validateAddMultipleResorts(List<ResortDTO> dtos);
	
	int validateTotalResortSize();
	
	//List<ResortDTO> getAll();
	
}
