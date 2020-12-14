package com.xworkz.xworkzapp.util;

import com.xworkz.xworkzapp.headphones.HeadPhones;

public class HeadPhonesUtil {
public static void main(String[] args) {
	HeadPhones headphones = new HeadPhones(1000);
	System.out.println(headphones.isConnected());
	System.out.println(headphones.getPrice());
	headphones.onOrOff();
	headphones.increaseVolume();
	headphones.increaseVolume();
	headphones.increaseVolume();
	headphones.increaseVolume();
	headphones.decreaseVolume();
	headphones.decreaseVolume();
	headphones.decreaseVolume();
	headphones.decreaseVolume();
	headphones.decreaseVolume();
}
}
