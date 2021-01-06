package com.xworkz.xworkzapp;

public class Human {

	private String name;
	private int age;
	private long aadharNumber;
	
	
	public long getAadharNumber() {
		return aadharNumber;
	}


	public void setAadharNumber(long aadharNumber) {
		this.aadharNumber = aadharNumber;
	}


	public Human(){
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + "]";
	}
	
	public int hashCode(){
		return  (int)aadharNumber;
		
	}
	@Override
	public boolean equals(Object obj){
		
		if(obj instanceof Human){
			return true;
		}
		
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
