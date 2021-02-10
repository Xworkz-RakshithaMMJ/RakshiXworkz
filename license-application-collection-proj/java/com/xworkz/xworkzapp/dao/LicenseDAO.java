package com.xworkz.xworkzapp.dao;

import com.xworkz.xworkzapp.constants.VehicleType;
import com.xworkz.xworkzapp.dto.LicenseDTO;

public interface LicenseDAO {

	void save(LicenseDTO dto);
	
	LicenseDTO findByIdProofNo(String idProofNo);
	
	boolean updatevehiclTypeByIdProofNo(String idProof,VehicleType type);
	
	boolean deleteByProofNo(String idproof);

}