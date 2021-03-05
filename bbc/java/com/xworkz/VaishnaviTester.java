package com.xworkz;

import com.xworkz.dao.BbcDAO;
import com.xworkz.dao.BbcDAOImpl;
import com.xworkz.entity.BBCEntity;

public class VaishnaviTester {
public static void main(String[] args) {
	BBCEntity entity=new BbcDAOImpl().updateNoOfTaskAndDaysInById(1, 2, 2);
	System.out.println(entity);
}
}
