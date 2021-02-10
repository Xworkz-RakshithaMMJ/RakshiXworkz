package com.xworkz.xworkzapp.resort.tester;

import java.util.LinkedList;
import java.util.List;

import com.xworkz.xworkzapp.resort.dao.ResortDAO;
import com.xworkz.xworkzapp.resort.dao.ResortDAOImpl;
import com.xworkz.xworkzapp.resort.dto.ResortDTO;

public class ResortTester {
public static void main(String[] args) {
	List<ResortDTO> list = new LinkedList<ResortDTO>();
	
	ResortDAO dao = new ResortDAOImpl(list);
	
	ResortDTO dto = new ResortDTO("Sakaleshpur","Farmers son", "Pradeep",15);
	dto.setPricePerHead(2000);
	dto.setNoOfEmployees(10);
	dto.setOffers(false);
	dto.setPhoneNo(7798871394l);
	dto.setPoolExist(false);
	dto.setRating(4);
	dao.save(dto);
	
	ResortDTO dto1 = new ResortDTO("uttaraKannada","Kaliadventure", "Surya",25);
	dto.setPricePerHead(2000);
	dto.setNoOfEmployees(10);
	dto.setOffers(false);
	dto.setPhoneNo(7798871394l);
	dto.setPoolExist(false);
	dto.setRating(4);
	dao.save(dto1);
	
	System.out.println(dao.totalResortSize());
	
	dao.updateLocationByName("Dandeli", "KaliAdventure");
	
	dao.updateLocationByNameandRating("Farmers son","Sakaleshpur", 4);
	
	dao.deleteByNameAndLocation("Farmers son", "sakaleshpur");
	
	dao.addMultipleResorts(list);
}
}
