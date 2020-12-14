package com.xworkz.xworkzapp.speaker;

public class Speaker {
	
	private String color;
	private double price;
	private static String brandName="Noise";
	private int batteryBackupForHours;
	
	public Speaker(double price,int batteryBackupForHours){
		this.price=price;
		this.batteryBackupForHours=batteryBackupForHours;
		System.out.println("arg 1 is:"+this.price);
		System.out.println("arg 2 is"+this.batteryBackupForHours);
		
	}
	
	private int maxVol =6;
	private int minVol =0;
	private boolean connected;
	private int currentVol;
	
		public void onOrOff()
		{
			if(isConnected()==  false)
			{
				this.connected=true;
			}
			else if(isConnected() == true)
			{
				this.connected=false;
			}
		}
			
		public void increaseVolume(){
			System.out.println("inside increaseVolume()");
			if(connected ==true)
			{	
			
				if(this.currentVol < this.maxVol){
					
					this.currentVol = this.currentVol +1;
					System.out.println("current volume is :" +this.currentVol);
				}
				else
				{
					System.out.println("max vol reached");
				}
			
			}
			else
			{
			System.out.println("dadda max vol reached");
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

		public int getBatteryBackupForHours() {
			return batteryBackupForHours;
		}

		public void setBatteryBackupForHours(int batteryBackupForHours) {
			this.batteryBackupForHours = batteryBackupForHours;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}
		
		
}
