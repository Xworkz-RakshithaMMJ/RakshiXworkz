package com.xworkz.mobileUtil;

import com.xworkz.mobile.Mobile;

public class MobileUtil {
public static void main(String[] args) {
	Mobile mobile = new Mobile("Oppo","A137",10000.00);
	System.out.println(mobile.getName()+" "+mobile.getModelNumber()+" "+mobile.getPrice());
}
}
