package com.xworkz;

import com.xworkz.dao.BbcDAO;
import com.xworkz.dao.BbcDAOImpl;
import com.xworkz.entity.BBCEntity;

public class RakshithaTester {
public static void main(String[] args) {
	BbcDAO dao = new BbcDAOImpl();
	BBCEntity entity=dao.getById(1);
	System.out.println(entity.getName());
	//System.out.println(entity);
	System.out.println("Successfully get the matched id");
}
}
