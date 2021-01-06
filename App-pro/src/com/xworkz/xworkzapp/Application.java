package com.xworkz.xworkzapp;

public abstract class Application {

	public abstract void install();
	
	public void unInstall(){
		System.out.println("Uninstalling a App");
	}
	
}
