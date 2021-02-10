package com.xworkz.xworkzapp.dao;

import java.util.List;

import com.xworkz.xworkzapp.constants.VehicleType;
import com.xworkz.xworkzapp.dto.LicenseDTO;

public class LicenseDAOImpl implements LicenseDAO{

	private List<LicenseDTO> database;
	
	public void save(LicenseDTO dto){
		System.out.println("invoked save in license dao impl");
		System.out.println("dto to save" +dto);
		boolean saved = this.database.add(dto);
		if(saved)
			System.out.println("dto is saved");
			else
			System.out.println("dto is not saved");
	}

	@Override
	public LicenseDTO findByIdProofNo(String idProofNo){
		System.out.println("invoked ");
		System.out.println("invoked findByProofNo:"+idProofNo);
		for(LicenseDTO licenseDTO :this.database){
			String idProof = licenseDTO.getIdProofNo();
			if(idProof.equals(idProofNo)){
			System.out.println("license found");
			return licenseDTO;
		}
	
	}
	return null;
		
}

@Override
public boolean updatevehiclTypeByIdProofNo(String idProof, VehicleType type) {
	
	System.out.println("invoked updateVehicleTypeByProofNo");
	System.out.println("idProof:" +idProof);
	System.out.println("type" +type);
	LicenseDTO dtoFromDB = this.findByIdProofNo(idProof);
	if(dtoFromDB !=null){
		System.out.println("can update,license is found");
		dtoFromDB.setVehicleType(type);
		return true;
	}else{
		System.out.println("cannot update,license not found");
	}
	return false;
	
	
}

@Override
public boolean deleteByProofNo(String idproof) {
	System.out.println("invoked deleteByProofNo");
	return false;
}

}


