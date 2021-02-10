package com.xworkz.xworkzapp.dto;

public class AlcoholDTO {

	private String name;
	private String brandName;
	private int splitPercentage;
	
	public AlcoholDTO(){
		
	}

	public AlcoholDTO(String name, String brandName, int splitPercentage) {
		super();
		this.name = name;
		this.brandName = brandName;
		this.splitPercentage = splitPercentage;
	}
	@Override
	public boolean equals(Object obj){
		System.out.println("invoked equals from Alcohol");
		if(obj==null)
			return false;
		if(obj instanceof AlcoholDTO){
			AlcoholDTO casted = (AlcoholDTO)obj;
			if(this.brandName.equals(casted.brandName)){
				System.out.println("same brand"+this.brandName);
				return true;
			}
		}
		return false;
	}
	
	
	
	@Override
	public String toString() {
		return "AlcoholDTO [name=" + name + ", brandName=" + brandName + ", splitPercentage=" + splitPercentage + "]";
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public int getSplitPercentage() {
		return splitPercentage;
	}

	public void setSplitPercentage(int splitPercentage) {
		this.splitPercentage = splitPercentage;
	}

	
	
}
