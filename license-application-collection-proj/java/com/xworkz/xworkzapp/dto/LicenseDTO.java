package com.xworkz.xworkzapp.dto;

import java.util.Date;

import com.xworkz.xworkzapp.constants.BloodGroup;
import com.xworkz.xworkzapp.constants.Gender;
import com.xworkz.xworkzapp.constants.IdProof;
import com.xworkz.xworkzapp.constants.VehicleType;

public class LicenseDTO extends CommonDTO{
	
	private IdProof idproof;
	private String idProofNo;
	private VehicleType vehicleType;
	private Date startDate;
	private boolean disability;
	private boolean commercial;
	
	

	public LicenseDTO(){
		super();
	}
	
	public LicenseDTO(String name,int age,AddressDTO addressDTO,Date dob,long mobileNo,BloodGroup bloodGroup,Gender gender){
		super(name,age,addressDTO,dob,mobileNo,bloodGroup,gender);
	}
	
	@Override
	public String toString() {
		return "LicenseDTO [idproof=" + idproof + ", idProofNo=" + idProofNo + ", vehicleType=" + vehicleType
				+ ", startDate=" + startDate + ", disability=" + disability + ", commercial=" + commercial + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj==null){
			System.out.println("object is null");
			return false;
		}
		if(obj instanceof LicenseDTO){
			LicenseDTO converted = (LicenseDTO)obj;
			
			if(this.idProofNo!=null && this.idProofNo.equals(converted.getIdProofNo())){
				return true;
			}
			
		}
		return false;
	}

	public IdProof getIdproof() {
		return idproof;
	}

	public void setIdproof(IdProof idproof) {
		this.idproof = idproof;
	}

	public String getIdProofNo() {
		return idProofNo;
	}

	public void setIdProofNo(String idProofNo) {
		this.idProofNo = idProofNo;
	}

	public VehicleType getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(VehicleType vehicleType) {
		this.vehicleType = vehicleType;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public boolean isDisability() {
		return disability;
	}

	public void setDisability(boolean disability) {
		this.disability = disability;
	}

	public boolean isCommercial() {
		return commercial;
	}

	public void setCommercial(boolean commercial) {
		this.commercial = commercial;
	}

}
