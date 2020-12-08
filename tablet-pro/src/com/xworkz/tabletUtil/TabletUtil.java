package com.xworkz.tabletUtil;

import com.xworkz.tablet.Tablet;

public class TabletUtil {
public static void main(String[] args) {
	Tablet tab = new Tablet("crocin","500mg","AfterMeal","Pain relief",50.0);
	System.out.println(tab.getName()+" "+tab.getNetWeight()+" "+tab.getWhenToTake()+" "+tab.getUseOfTab()+" "+tab.getPrice());
}
}
