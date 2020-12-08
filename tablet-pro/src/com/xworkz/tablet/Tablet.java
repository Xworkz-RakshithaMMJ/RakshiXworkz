package com.xworkz.tablet;

public class Tablet {

	private String name;
	private String netWeight;
	private String whenToTake;
	private String useOfTab;
	private double price;
	
	public Tablet(String name,String netWeight,String whenToTake,String useOfTab,double price){
		this.name=name;
		this.netWeight=netWeight;
		this.whenToTake=whenToTake;
		this.useOfTab=useOfTab;
		this.price=price;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getNetWeight(){
		return netWeight;
	}
	public void setNetWeight(String netWeight){
		this.netWeight=netWeight;
	}
	public String getWhenToTake(){
		return whenToTake;
	}
	public void setWhenToTake(String whenToTake){
		this.whenToTake=whenToTake;
	}
	public String getUseOfTab(){
		return useOfTab;
	}
	public void setUseOfTab(String useOfTab){
		this.useOfTab=useOfTab;
	}
	public double getPrice(){
		return price;
	}
	public void setPrice(double price){
		this.price=price;
	}
}
