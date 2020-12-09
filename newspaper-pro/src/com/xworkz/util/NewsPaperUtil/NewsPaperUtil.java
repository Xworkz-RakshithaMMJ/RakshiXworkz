package com.xworkz.util.NewsPaperUtil;

import com.xworkz.newspaper.NewsPaper;

public class NewsPaperUtil {
public static void main(String[] args) {
	NewsPaper newspaper = new NewsPaper(13,5);
	/*newspaper.setNoOfPages(14);
	newspaper.setNoOfPages(6);
	newspaper.noOfPages=15;
	newspaper.price=5;
	System.out.println(newspaper.noOfPages+" "+newspaper.price);*/
	System.out.println(newspaper.getNoOfPages()+" "+newspaper.getPrice());
}
}
