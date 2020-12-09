package com.xworkz.newspaper;

public class NewsPaper {

	private int noOfPages;
	private int price;
	
	public NewsPaper(int noOfPages, int price) {
		this.noOfPages = noOfPages;
		this.price = price;
	}
	public int getNoOfPages() {
		return noOfPages;
	}
	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
