package com.xworkz.HospitalUtil;

import com.xworkz.Hospital.Hospital;

public class HospitalUtil {
public static void main(String[] args) {
	Hospital hos = new Hospital();
	
	System.out.println(Hospital.name);
	System.out.println(Hospital.address);
	hos.toCure();

}
}
