package com.xworkz.xworkzapp.services;

import com.xworkz.xworkzapp.constants.CosmeticShade;
import com.xworkz.xworkzapp.constants.CosmeticType;
import com.xworkz.xworkzapp.dao.CosmeticDAO;
import com.xworkz.xworkzapp.dto.CosmeticDTO;

public class CosmeticServiceImpl implements CosmeticService{
	
		private CosmeticDAO cosmeticDAO;
		
		public CosmeticServiceImpl(CosmeticDAO cosmeticDAO) {
			System.out.println("created CosmeticServiceImpl");
			this.cosmeticDAO = cosmeticDAO;
		}


		@Override
		public boolean validateAndSave(CosmeticDTO cosmeticDTO) {
			boolean validData=false;
			if(cosmeticDTO !=null) {
				System.out.println("dto is not null, will validate fields");
				String brand = cosmeticDTO.getBrand();
				if(brand != null && brand.length()>=3 && !brand.isEmpty() && !brand.contains(" ")) {
					System.out.println("brand is valid");
					validData=true;
				}
				else {
					System.out.println("brand is invalid");
					validData=false;
				}
				
			if(validData) {
				CosmeticType type=cosmeticDTO.getType();
				if(type != null) {
					System.out.println("CosmeticType is valid");
					validData=true;
				}
				else {
					System.out.println("CosmeticType is invalid");
					validData=false;
				}
			}
			
			if(validData) {
				CosmeticShade shade=cosmeticDTO.getShades();
				if(shade != null) {
					System.out.println("Cosmeticshade is valid");
					validData=true;
				}
				else {
					System.out.println("Cosmeticshade is invalid");
					validData=false;
				}
			}
				
			if(validData) {
				double price=cosmeticDTO.getPrice();
				if(price > 0) {
					System.out.println("price is valid");
					validData=true;
				}
				else {
					System.out.println("price is invalid");
					validData=false;
				}
			}
			
			if(validData) {
				double quantity=cosmeticDTO.getQuantity();
				if(quantity > 0 && quantity <=100) {
					System.out.println("quantity is valid");
					validData=true;
				}
				else {
					System.out.println("quantity is invalid");
					validData=false;
				}
			}
			
			if(validData) {
				System.out.println("data is valid, can invoke dao");
				cosmeticDAO.save(cosmeticDTO);
			}
			else {
				System.out.println("dto is null, invalid data");
			}
			}
			return false;
		}
		@Override
		public void deleteByBrand(String brand) {
			System.out.println("invoked deleteByBrand");
			if (brand != null && !brand.isEmpty() && !brand.contains(" ") && brand.length() >= 3) {
				System.out.println("brand is valid, can delete" + brand);
				this.cosmeticDAO.deleteByBrand(brand);
			} else {
				System.out.println("invalid brand");
			}

		}
		
		@Override
		public int cosmeticsSize() {
			return this.cosmeticDAO.totalSize();
		}

	}

