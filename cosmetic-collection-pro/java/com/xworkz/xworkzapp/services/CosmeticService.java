package com.xworkz.xworkzapp.services;

import com.xworkz.xworkzapp.dto.CosmeticDTO;

public interface CosmeticService {

	public boolean validateAndSave(CosmeticDTO cosmeticDTO);
	
	public void deleteByBrand(String brand);
	
	public int cosmeticsSize();
}
