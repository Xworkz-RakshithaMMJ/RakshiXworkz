package com.xworkz.xworkzapp.tester;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.xworkz.xworkzapp.constants.*;
import com.xworkz.xworkzapp.dao.*;
import com.xworkz.xworkzapp.dto.*;
import com.xworkz.xworkzapp.services.*;

public class ValidationTester {

	public static void main(String[] args) {

		//CosmeticDAO dao=new CosmeticDAOImpl();
		
		CosmeticDTO cosmeticDTO=new CosmeticDTO();
		cosmeticDTO.setType(CosmeticType.CONSEALER);
		cosmeticDTO.setPrice(1000);
		cosmeticDTO.setShades(CosmeticShade.BLACK);
		cosmeticDTO.setQuantity(50);
		cosmeticDTO.setBrand("MAC");
		//dao.save(null);
		
		List<CosmeticDTO> list=new LinkedList<CosmeticDTO>();
		
		CosmeticDAO dao=new CosmeticDAOImpl(list);
		// Loose Coupling vs Tight Coupling
		//String com="Xworkz";
		CosmeticService service=new CosmeticServiceImpl(dao);
		
		service.validateAndSave(cosmeticDTO);
		
		
		CosmeticDTO cosmeticDTO2=new CosmeticDTO("Sugr", CosmeticShade.RED, CosmeticType.PRIMER, 1000, 2);
		
		service.validateAndSave(cosmeticDTO2);
		System.out.println(service.cosmeticsSize());

		service.deleteByBrand("Sugr");
		
		System.out.println(service.cosmeticsSize());
		
	}

}