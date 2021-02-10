package com.xworkz.xworkzapp.dao;

import java.util.Iterator;
import java.util.List;

import com.xworkz.xworkzapp.dto.HospitalDTO;
import com.xworkz.xworkzapp.dto.PatientDTO;


public class HospitalDAOImpl implements HospitalDAO{
	
	private List<HospitalDTO> hospitals;
	
	private List<PatientDTO> patients;
	
	
	public HospitalDAOImpl(List<HospitalDTO> list){
		this.hospitals=list;
		System.out.println("invoked HospitalDAOImpl");
	}
	
	public HospitalDAOImpl(){
		
	}

	@Override
	public boolean save(HospitalDTO dto) {
		System.out.println("invoked save method");
		System.out.println("invoked to dto" +dto);
		boolean added=false;
		boolean contains=this.hospitals.contains(dto);
		if(!contains){
			added=this.hospitals.add(dto);
		}
		if(added){
			System.out.println("dto is added");
		}else{
			System.out.println("dto is not added");
		}
		return added;
	}

	@Override
	public boolean updateNameById(String name, int id) {
		
		Iterator<PatientDTO> iterator = this.patients.iterator();
		while(iterator.hasNext()){
			PatientDTO dto=iterator.next();
			if(dto.getPatId()==id){
			System.out.println("Patient found");
			dto.setName(name);
		return true;
			}
			else{
				System.out.println("can not update,patient not found");
		}
		
	}
	return false;
}
	
	public boolean deleteByName(String name){
		Iterator<HospitalDTO> iterator = this.hospitals.iterator();
		while(iterator.hasNext()){
			HospitalDTO dto=iterator.next();
			if(dto.getName().equals(name)){
				iterator.remove();
				return true;
			}
		}
		return false;
	}
	
	public boolean addMultipleHospitals(List<HospitalDTO> dtos) {
		if(dtos!=null){
			boolean added=dtos.addAll(hospitals);
			System.out.println("Multiple data added");
			System.out.println(dtos);
			return true;
		}
		return false;
	}
}

