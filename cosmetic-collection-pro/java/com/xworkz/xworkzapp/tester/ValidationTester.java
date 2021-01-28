package com.xworkz.xworkzapp.tester;

import com.xworkz.xworkzapp.constants.CosmeticShade;
import com.xworkz.xworkzapp.constants.CosmeticType;
import com.xworkz.xworkzapp.dto.CosmeticDTO;
import com.xworkz.xworkzapp.services.CosmeticService;
import com.xworkz.xworkzapp.services.CosmeticServiceImpl;

public class ValidationTester {

	public static void main(String[] args) {
		
		CosmeticDTO cosmeticDTO=new CosmeticDTO();
		cosmeticDTO.setType(CosmeticType.CONSEALER);
		cosmeticDTO.setPrice(1000);
		cosmeticDTO.setShades(CosmeticShade.RED);
		cosmeticDTO.setBrand("MAC");
		cosmeticDTO.setQuantity(-1);
		
		CosmeticService service=new CosmeticServiceImpl();
		service.validateAndSave(cosmeticDTO);
		
		}
	
}

