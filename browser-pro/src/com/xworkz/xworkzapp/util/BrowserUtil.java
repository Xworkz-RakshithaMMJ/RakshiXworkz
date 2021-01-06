package com.xworkz.xworkzapp.util;

import com.xworkz.xworkzapp.browser.Browser;
import com.xworkz.xworkzapp.browser.Chrome;

public class BrowserUtil {
public static void main(String[] args) {
	//up casting
	Browser browser = new Chrome();
	//down casting
	Chrome chrome = (Chrome)browser;
	browser.typeOfSearch="about google";
	browser.history="songs";
	browser.browse();
	System.out.println(browser.typeOfSearch+" "+browser.history);
}
}
