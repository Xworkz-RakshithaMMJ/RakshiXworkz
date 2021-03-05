package com.xworkz.dao;

import com.xworkz.entity.BBCEntity;

public interface BbcDAO {

	public void create(BBCEntity entity);
	
	public BBCEntity getById(int id);
	
	public BBCEntity updateNoOfTaskAndDaysInById(int id,int noOfTasks,int daysIn);
	
	public void deleteById(int id);
}
