package com.xworkz.xworkzapp.services;

import com.xworkz.xworkzapp.constants.CosmeticShade;
import com.xworkz.xworkzapp.constants.CosmeticType;
import com.xworkz.xworkzapp.dto.CosmeticDTO;

public class CosmeticServiceImpl implements CosmeticService{

		public CosmeticServiceImpl() {
			// TODO Auto-generated constructor stub
			System.out.println("created CosmeticServiceImpl");
		}

		@Override
		public boolean validateAndSave(CosmeticDTO cosmeticDTO) {
			boolean validData=false;
			if(cosmeticDTO !=null) {
				System.out.println("dto is not null, will validate fields");
				String brand = cosmeticDTO.getBrand();
				if(brand != null && brand.length()>=3 && !brand.isEmpty() && !brand.equals(" ")) {
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
			}
			else {
				System.out.println("dto is null, invalid data");
			}
			}
			return false;
		}

		
	}

