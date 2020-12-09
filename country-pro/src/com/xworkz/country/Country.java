package com.xworkz.country;

public class Country {

	private int noOfStates;
	private int noOfLang;
	private String capital;
	
	public Country(int noOfStates, int noOfLang, String capital) {
		this.noOfStates = noOfStates;
		this.noOfLang = noOfLang;
		this.capital = capital;
	}
	public int getNoOfStates(){
		return noOfStates;
	}
	public void setNoOfStates(int noOfStates){
		this.noOfStates=noOfStates;
	}
	public int getNoOfLang(){
		return noOfLang;
	}
	public void setNoOfLang(int noOfLang){
		this.noOfLang=noOfLang;
	}
	public String getCapital(){
		return capital;
	}
	public void setCapital(String capital){
		this.capital=capital;
	}
	
}
