package com.xworkz.util;

import com.xworkz.church.Church;

public class ChurchUtil {
public static void main(String[] args) {
	Church church = new Church("kerala","St.MAry's",45);
	/*church.setName("st.Joseph");
	church.setAddress("Goa");
	church.setNoOfFathersAndSisters(1);*/
	System.out.println(church.getName()+" "+church.getAddress()+" "+church.getNoOfFathersAndSisters());
}
}
