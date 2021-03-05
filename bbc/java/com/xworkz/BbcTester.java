package com.xworkz;
import com.xworkz.dao.BbcDAO;
import com.xworkz.dao.BbcDAOImpl;
import com.xworkz.entity.BBCEntity;

public class BbcTester {

	public static void main(String[] args) {
		BBCEntity entity = new BBCEntity();
		entity.setId(1);
		entity.setName("Shamanth");
		entity.setGender("Male");
		entity.setNoOfSeason(8);
		entity.setTypeOfContestant("Tiktoker");
		entity.setNoOfTasks(2); 
		entity.setDaysIn(1);
		
		BbcDAO dao = new BbcDAOImpl();
		dao.create(entity);
		System.out.println("created successfully");
	}
}
