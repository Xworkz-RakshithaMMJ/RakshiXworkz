package com.xworkz.xworkzapp.tester;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.xworkz.xworkzapp.constants.BloodGroup;
import com.xworkz.xworkzapp.constants.Gender;
import com.xworkz.xworkzapp.constants.IdProof;
import com.xworkz.xworkzapp.constants.VehicleType;
import com.xworkz.xworkzapp.dao.LicenseDAO;
import com.xworkz.xworkzapp.dao.LicenseDAOImpl;
import com.xworkz.xworkzapp.dto.AddressDTO;
import com.xworkz.xworkzapp.dto.LicenseDTO;

public class LicenseTester {

	public static void main(String[] args) {
		
		AddressDTO addressDTO = new AddressDTO(3254,"NA",583134,"Kotturu","ka","NA"); 
		Date dob = new Date();
		SimpleDateFormat format =new SimpleDateFormat("dd/mm/yyyy");
		try{
			dob=format.parse("1/12/1998");
		}catch(ParseException e){
			e.printStackTrace();
		}
		
		LicenseDTO dto = new LicenseDTO("Rakshitha",22,addressDTO,dob,7795571395L,BloodGroup.A_POSITIVE,Gender.FEMALE);
		dto.setIdproof(IdProof.AADHAR);
		dto.setIdProofNo("6567 6376 5467");
		dto.setDisability(false);
		dto.setStartDate(new Date());
		dto.setVehicleType(VehicleType.TWO_WHEELER);
		
		LicenseDAO dao = new LicenseDAOImpl();
		dao.save(dto);
		
		LicenseDTO dtofound=dao.findByIdProofNo("6567 6376 5467");
		System.out.println(dtofound);
		
		boolean updated=dao.updatevehiclTypeByIdProofNo("6567 6376 5467", VehicleType.LMV);
		System.out.println(updated);
		
		LicenseDTO dtoafterUpdate = dao.findByIdProofNo("6567 6376 5467");
		System.out.println(dtoafterUpdate);
	
	}
}
