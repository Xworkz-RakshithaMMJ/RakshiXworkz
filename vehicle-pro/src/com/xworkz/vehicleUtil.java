package com.xworkz;

import com.xworkz.vehicle.Vehicle;

public class vehicleUtil {
public static void main(String[] args) {
	Vehicle vehicle = new Vehicle("Wego","Scooty","Two wheeler",50000.0);
	System.out.println(vehicle.getName()+" "+vehicle.getTypeOfVehicle()+" "+vehicle.getNoOfWheels()+" "+vehicle.getPrice());
}
}
