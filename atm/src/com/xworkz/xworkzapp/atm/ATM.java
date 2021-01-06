package com.xworkz.xworkzapp.atm;

public class ATM {

	private String bankName;
	private String address;
	private int cvv;
	
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	
	@Override
	public String toString() {
		return "ATM  [bankname=" + bankName + ", address=" + address + "]";
	}
	@Override
	public int hashCode(){
		return  (int)cvv;
		
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
		if(this.bankName == obj){
			return true;
		}
		return false;
		
	}
	

	

	
	
}
