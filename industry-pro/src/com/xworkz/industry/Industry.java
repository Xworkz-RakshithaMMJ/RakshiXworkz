package com.xworkz.industry;

public class Industry {

	public String type;
	public int noOfWorkers;
	public String area;
	
	public Industry(String type,int noOfWorkers,String area){
		this.type=type;
		this.noOfWorkers=noOfWorkers;
		this.area=area;
	}

	public String production(){
		return "producing";
	}
	
	public String getType(){
		return type;
	}
	public void setType(String type){
		this.type=type;
	}
	public int getNoOfWorkers(){
		return noOfWorkers;
	}
	public void setNoOfWorkers(int noOfWorkers){
		this.noOfWorkers=noOfWorkers;
	}
	public String getArea(){
		return area;
	}
	public void setArea(String area){
		this.area=area;
	}
}
