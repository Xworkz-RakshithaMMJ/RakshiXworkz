package com.xworkz.Util;

import com.xworkz.museum.Museum;

public class MuseumUtil {
public static void main(String[] args) {
	Museum museum = new Museum(1,"Rising star","nearMGRoad",5,"Science Department");
    System.out.println(museum.id + " " +museum.name+" "+museum.address+""+museum.noOfFloors+" "+museum.department);
} 
}
