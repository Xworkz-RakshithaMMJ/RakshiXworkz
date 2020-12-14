package com.xworkz.xworkzapp.headphones;

public class HeadPhones {

	private String color;
	private double price;
	private static String brandName="Sony";
	
	public HeadPhones(int price){
		this.price=price;
		System.out.println("arg is:" +this.price);
	}
	
	private int maxVol=10;
	private int minVol=0;
	private boolean connected;
	private int currentVol;
	
		public void onOrOff(){
			if (isConnected()==false)
			{
				this.connected=true;
			}
			else if(isConnected()==true)
			{
				this.connected=false;
			}
		}
		
		public void increaseVolume(){
			System.out.println("inside increaseVolume()");
			if(connected == true){
				if(this.currentVol <this.maxVol){
					this.currentVol=this.currentVol+1;
					System.out.println("Current volume is:" +this.currentVol);
				}
				else{
					System.out.println("max vol is reached");
				}
			}
			else{
				System.out.println("manga max vol reached");
			}
				
		}
public void decreaseVolume(){
			
			if(connected ==true)
			{
				if(this.currentVol > this.minVol){
					this.currentVol = this.currentVol -1;
					System.out.println("current volume is :" +this.currentVol);
				}
				else
				{
					System.out.println("min vol reached");
				}
			}else
			{
			System.out.println("dadda min vol reached");
			}
		}
		public boolean isConnected() {
			return false;
		}

		public void setConnected(boolean connected) {
			this.connected = connected;
		}
		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}
		
}
