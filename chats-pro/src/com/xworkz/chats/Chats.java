package com.xworkz.chats;

public class Chats {
	private String typeOfChat;
	private double price;
	
	public Chats(String typeOfChat,double price){
		this.typeOfChat=typeOfChat;
		this.price=price;
	}
	public String getTypeOfChat(){
		return typeOfChat;
	}
	public void setTypeOfChat(String typeOfChat){
		this.typeOfChat=typeOfChat;
	}
	public double getPrice(){
		return price;
	}
	public void setPrice(double price){
		this.price=price;
	}
	
}
