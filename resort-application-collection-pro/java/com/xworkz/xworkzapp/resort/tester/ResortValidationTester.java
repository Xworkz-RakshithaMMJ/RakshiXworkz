package com.xworkz.xworkzapp.resort.tester;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.xworkzapp.resort.dao.ResortDAO;
import com.xworkz.xworkzapp.resort.dao.ResortDAOImpl;
import com.xworkz.xworkzapp.resort.dto.ResortDTO;
import com.xworkz.xworkzapp.resort.service.ResortService;
import com.xworkz.xworkzapp.resort.service.ResortServiceImpl;

public class ResortValidationTester {

	public static void main(String[] args) {
		List<ResortDTO> list = new ArrayList<ResortDTO>();

		ResortDAO dao = new ResortDAOImpl(list);
		ResortService resortService = new ResortServiceImpl(dao);

		ResortDTO dto = new ResortDTO("Ramanagar", "Shillandara", "KiranRaj", 15);
		dto.setPricePerHead(2000);
		dto.setNoOfEmployees(10);
		dto.setOffers(false);
		dto.setPhoneNo(7829731400l);
		dto.setPoolExist(false);
		dto.setRating(4);
		// dao.save(dto);

		resortService.validateAndSave(dto);

		ResortDTO dto2 = new ResortDTO("Dandeli", "KaliAdventure", "Raj", 10);
		dto2.setPricePerHead(2000);
		dto2.setNoOfEmployees(10);
		dto2.setOffers(false);
		dto2.setPhoneNo(7829731400l);
		dto2.setPoolExist(false);
		dto2.setRating(4);

		resortService.validateAndSave(dto2);

		System.out.println(resortService.validateTotalResortSize());

		resortService.validateAddMultipleResorts(list);

		resortService.validateAndUpdateLocationByName("Coorg", "KaliAdventure");

		resortService.validateAndUpdateLocationByNameandRating("Madikeri", "Shillandara", 4);
		resortService.validateAndDeleteByNameAndLocation("Shillandara", "Madikeri");

		System.out.println(resortService.validateTotalResortSize());

		System.out.println();

	}

}

