package com.xworkz.xworkzapp.resort.dao;

import java.util.Iterator;
import java.util.List;

import com.xworkz.xworkzapp.resort.dao.ResortDAO;
import com.xworkz.xworkzapp.resort.dto.ResortDTO;
import com.xworkz.xworkzapp.resort.service.ResortService;

public class ResortDAOImpl implements ResortDAO{
	
	/*private ResortDAO resortDao;
	String specialChar = "^[^<>'\"/;%]*$";*/
	
	List<ResortDTO> resortList;
	
	public ResortDAOImpl(List<ResortDTO> resortDTOs){
		System.out.println("invoked ResortDAOImpl");
		this.resortList = resortDTOs;
	}

	@Override
	public boolean save(ResortDTO dto) {
		boolean added = false;
		if(dto !=null){
			System.out.println("invoked save method of dao");
			if(!this.resortList.contains(dto)){
				added=this.resortList.add(dto);
			}
			if(added){
				System.out.println("dto is added");
				return true;
				
			}else{
				System.out.println("dto is not added");
				return false;
			}
		}
		return added;
		
	}

	@Override
	public boolean updateLocationByName(String location, String name) {
		System.out.println("invoked updateLocationByName");
		for (ResortDTO resortDTO :resortList) {
			String resortName=resortDTO.getName();
			if(resortName!=null && resortName.equals(name)){
				System.out.println("Resort name found can update location");
				resortDTO.setLocation(location);
				System.out.println("updated location" +resortDTO);
				return true;
			}else{
				System.out.println("resort not found");
			}
		}
		System.out.println("no elements in list");
		return false;
	}

	@Override
	public boolean updateLocationByNameandRating(String location, String name, float rating) {
		System.out.println("invoked updateLocationByNameandRating");
		for(ResortDTO resortDTO : resortList){
			String resortName=resortDTO.getName();
			float resortRating=resortDTO.getRating();
			if(resortName!=null && resortName.equals(name) && resortRating==rating){
				System.out.println("Resort name and Rating found,Can update the location");
				resortDTO.setLocation(location);
				System.out.println("Updated location" +resortDTO);
				return true;
			}else{
				System.out.println("Name and ratin not found");
			}
		}
		System.out.println("list has no elements");
		return false;
	}

	@Override
	public boolean deleteByNameAndLocation(String name, String location) {
		System.out.println("invoked deleteByNameAndLocation");
		Iterator<ResortDTO> iterator=this.resortList.iterator();
		while(iterator.hasNext()){
			ResortDTO dto=iterator.next();
			if(dto.getName().equals(name) && dto.getLocation().equals(location)){
				System.out.println("Name and location found,Can delete");
				iterator.remove();
				System.out.println("Name and location deleted" +dto);
				return true;
			}else{
				System.out.println("Name and location is not matching");
			}
		}
		return false;
	}

	@Override
	public boolean addMultipleResorts(List<ResortDTO> dtos) {
		if(dtos!=null){
			boolean added=dtos.addAll(resortList);
			System.out.println("Multiple data added");
			System.out.println(dtos);
			return true;
		}
		return false;
	}

	@Override
	public int totalResortSize() {
		return this.resortList.size();
	}

	@Override
	public List<ResortDTO> getAll() {
		return this.resortList;
	}

}
