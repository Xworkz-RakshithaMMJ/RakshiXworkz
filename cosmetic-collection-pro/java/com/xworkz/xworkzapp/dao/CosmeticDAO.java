package com.xworkz.xworkzapp.dao;

import java.util.List;

import com.xworkz.xworkzapp.constants.CosmeticType;
import com.xworkz.xworkzapp.dto.CosmeticDTO;

public interface CosmeticDAO {
	
	boolean save(CosmeticDTO dto);
	
	boolean updatePriceAndQuantityByBrand(double price,int quantity,String brand);
	
	boolean updaateTypeByBrand(String brand,CosmeticType type);
	
	boolean deleteByBrand(String brand);
	
	void deleteAll();
	
	List<CosmeticDTO> getAll();
	
	int TotalSize();

	CosmeticDTO findbyQuantityAndBrand(int quantity, String brand);

	boolean updatePriceByBrandandType(double price, String brand, CosmeticType type);
	
}
