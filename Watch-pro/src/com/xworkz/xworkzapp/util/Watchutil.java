package com.xworkz.xworkzapp.util;

import com.xworkz.xworkzapp.watch.DaneilWalligton;
import com.xworkz.xworkzapp.watch.Watch;

public class Watchutil {

	public static void main(String[] args) {
		//up casting
		Watch watch = new DaneilWalligton();
		//down casting
		//DaneilWalligton daneilwalligton = new Watch();
		watch.modelNo="DW354";
		watch.price=10000.00;
		watch.displayTime();
		System.out.println(watch.modelNo + " "+watch.price);
	}
}
