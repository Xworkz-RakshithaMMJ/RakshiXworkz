package com.xworkz.xworkzapp.dto;

import com.xworkz.xworkzapp.constants.CosmeticShade;
import com.xworkz.xworkzapp.constants.CosmeticType;

public class CosmeticDTO {

	private String brand;
	private CosmeticShade shades;
	private CosmeticType type;
	private double price;
	private int quantity;
	
	public CosmeticDTO(){
		
	}
	public CosmeticDTO(String brand, CosmeticShade shades, CosmeticType type, double price, int quantity) {
		super();
		this.brand = brand;
		this.shades = shades;
		this.type = type;
		this.price = price;
		this.quantity = quantity;
	}
	
	@Override
	public String toString() {
		return "CosmeticDTO [brand=" + brand + ", shades=" + shades + ", type=" + type + ", price=" + price
				+ ", quantity=" + quantity + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj==null){
			return false;
		}
		if(obj instanceof CosmeticDTO){
			CosmeticDTO converted=(CosmeticDTO)obj;
			
			if(this.brand!=null && this.type!=null){
				if(this.brand.equals(converted.getBrand()) && this.type.equals(converted.getType())){
					System.out.println("brand and type is matching"+converted.brand);
				return true;
			}
		}
	}
		return false;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public CosmeticShade getShades() {
		return shades;
	}
	public void setShades(CosmeticShade shades) {
		this.shades = shades;
	}
	public CosmeticType getType() {
		return type;
	}
	public void setType(CosmeticType type) {
		this.type = type;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	
}
