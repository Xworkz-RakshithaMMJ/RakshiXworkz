package com.xworkz.xworkzapp.dao;

import com.xworkz.xworkzapp.dto.HospitalDTO;

public interface HospitalDAO {

	boolean save(HospitalDTO dto);
	
	boolean updateNameById(String name,int id);
}
