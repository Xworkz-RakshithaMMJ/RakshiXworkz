package com.xworkz.xworkzapp.satellite;

public class Satellite {

	private String name;
	private int modelNum;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getModelNum() {
		return modelNum;
	}
	public void setModelNum(int modelNum) {
		this.modelNum = modelNum;
	}
	
	@Override
	public String toString() {
		return "Satellite  [name=" + name + "]";
	}
	
	@Override
	public int hashCode(){
		return  (int)modelNum;
		
	}
	@Override
	public boolean equals(Object obj){
		if(this == obj){
			return true;
		}
		if(obj == null){
			System.out.println("Object is null");
		}
		if(this.hashCode() == obj.hashCode()){
			return true;	
		}
		if(this.name == obj){
			return true;
		}
		return false;
		
	}
	


}
