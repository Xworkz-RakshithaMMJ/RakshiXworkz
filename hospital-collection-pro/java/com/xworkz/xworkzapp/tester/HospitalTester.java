package com.xworkz.xworkzapp.tester;

import com.xworkz.xworkzapp.constants.Specialization;
import com.xworkz.xworkzapp.dao.HospitalDAO;
import com.xworkz.xworkzapp.dao.HospitalDAOImpl;
import com.xworkz.xworkzapp.dto.HospitalDTO;
import com.xworkz.xworkzapp.dto.PatientDTO;

public class HospitalTester {

	public static void main(String[] args) {
	
		HospitalDTO hospitaldto = new HospitalDTO("BKS", "Ballari",Specialization.ENT);
		
		HospitalDTO hospitaldto1 = new HospitalDTO("Narayana Hrudayalaya", "Bengaluru",Specialization.HEART_SURGERY);
		
		PatientDTO patientdto = new PatientDTO(1,"Raksh","Kottur", 23);
		PatientDTO patientdto1 = new PatientDTO(2,"Rajee","Banglore", 26);

		
		HospitalDAO hospitaldao = new HospitalDAOImpl();
		hospitaldao.save(hospitaldto);
		hospitaldao.save(hospitaldto1);
		
		hospitaldao.updateNameById("Geetha", 2);
		
			
}
}
