package com.xworkz.xworkzapp.tester;

import java.util.List;

import com.xworkz.xworkzapp.constants.CosmeticShade;
import com.xworkz.xworkzapp.constants.CosmeticType;
import com.xworkz.xworkzapp.dao.CosmeticDAO;
import com.xworkz.xworkzapp.dao.CosmeticDAOImpl;
import com.xworkz.xworkzapp.dto.CosmeticDTO;

public class CosmeticTester {

	public static void main(String[] args) {
		
		CosmeticDTO cosmeticDTO = new CosmeticDTO();
		cosmeticDTO.setBrand("Maybelline");
		cosmeticDTO.setType(CosmeticType.EYELINER);
		cosmeticDTO.setQuantity(1);
		cosmeticDTO.setShades(CosmeticShade.BLACK);
		cosmeticDTO.setPrice(200.00);
		
		CosmeticDAO dao = new CosmeticDAOImpl();
		dao.save(cosmeticDTO);
		
		CosmeticDTO cosmeticDTO1 = new CosmeticDTO("Lakme", CosmeticShade.RED,CosmeticType.LIPSTICK,200,1);
		dao.save(cosmeticDTO1);
		
		CosmeticDTO cosmeticDTO2 = new CosmeticDTO("Lakme", CosmeticShade.RED,CosmeticType.LIPSTICK,200,1);
		dao.save(cosmeticDTO2);
	
	
	CosmeticDTO cosmeticDTO3=new CosmeticDTO("Nyka",CosmeticShade.BLACK,CosmeticType.FOUNDATION,300,1);
	dao.save(cosmeticDTO3);
	
	
	boolean updated=dao.updatePriceAndQuantityByBrand(50000.00, 40, "Nyka");
	System.out.println("updated "+ updated);
	System.out.println(cosmeticDTO3);
	
	boolean updated1=dao.updatePriceByBrandandType(600000, "Lakme", CosmeticType.FOUNDATION);
	System.out.println("updated "+ updated1);
	System.out.println(cosmeticDTO2);
	
	List<CosmeticDTO> get1=dao.getAll();
	System.out.println("getting all the elements"+get1);
	
	
	int total1=dao.TotalSize();
	System.out.println("total size"+total1);
	
	boolean update2=dao.updaateTypeByBrand("Maybelline", CosmeticType.PRIMER);
	System.out.println("updated "+ update2);
	System.out.println(cosmeticDTO);
	
	boolean delete=dao.deleteByBrand("Nyka");
	System.out.println("deleted"+ delete);
	int total2=dao.TotalSize();
	System.out.println("total size"+total2);
	
	
	dao.deleteAll();
	
	List<CosmeticDTO> get=dao.getAll();
	System.out.println(get);
	
	int total=dao.TotalSize();
	System.out.println("total size"+total);
	
}

}

