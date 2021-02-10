package com.xworkz.xworkzapp.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.xworkz.xworkzapp.constants.CosmeticType;
import com.xworkz.xworkzapp.dto.CosmeticDTO;

public class CosmeticDAOImpl implements CosmeticDAO{
	
	private List<CosmeticDTO> cosmetics;
	
	public CosmeticDAOImpl(List<CosmeticDTO> list){
		this.cosmetics=new ArrayList<CosmeticDTO>();
	}

	@Override
	public boolean save(CosmeticDTO dto) {
		
		System.out.println("invoked save method");
		System.out.println("invoked to dto:" +dto);
		boolean added=false;
		boolean contains=this.cosmetics.contains(dto);
		if(!contains){
			added=this.cosmetics.add(dto);
			
		}
		if(added){
			System.out.println("Cosmetics added");
		}else{
			System.out.println("Cosmetics not added");
		}
		return added;
	}

	@Override
	public CosmeticDTO findbyQuantityAndBrand(int quantity, String brand) {
		// TODO Auto-generated method stub
		System.out.println("invoked findByquantityandbrad");
		for (CosmeticDTO cosmeticDTO : this.cosmetics) {
			String brandFromDTO = cosmeticDTO.getBrand();
			int quantityFromDTO=cosmeticDTO.getQuantity();
			if ( brandFromDTO.equals(brand) && quantityFromDTO==(quantity)) {
				System.out.println("cosmetic found");
				return cosmeticDTO;
			}
		}
		return null;
	}
	
	public CosmeticDTO findbyTypeAndBrand(CosmeticType type, String brand) {
		// TODO Auto-generated method stub
		System.out.println("invoked findByquantityandbrad");
		for (CosmeticDTO cosmeticDTO : this.cosmetics) {
			String brandFromDTO = cosmeticDTO.getBrand();
			CosmeticType cosmeticFromDTO=cosmeticDTO.getType();
			if ( brandFromDTO.equals(brand) && cosmeticFromDTO.equals(type)) {
				System.out.println("cosmetic found");
				return cosmeticDTO;
			}
		}
		return null;
	}
	
	@Override
	public boolean updatePriceAndQuantityByBrand(double price,int quantity, String brand) {
		// TODO Auto-generated method stub
		/*System.out.println("invoked updatePriceAndQuantityByBrand ");
		System.out.println("Quantity: "+quantity);
		System.out.println("Brand: "+brand);
		CosmeticDTO dtoFromCosmetic = this.findbyQuantityAndBrand(quantity, brand);
		if (dtoFromCosmetic != null) {
			System.out.println("can update , cosmetic is found");
			dtoFromCosmetic.setPrice(price);
			return true;
		} else {
			System.out.println("cannot update , cosmetic not found");
		}
		return false;
	}*/
		
		Iterator<CosmeticDTO> iterator = this.cosmetics.iterator();
		while(iterator.hasNext()){
			CosmeticDTO dto=iterator.next();
			if(dto.getBrand().equals(brand)&& dto.getQuantity()==(quantity)){
				System.out.println("cosmetic found");
				dto.setPrice(price);
				return true;
			}
			else{
				System.out.println("cannot update ,cosmetic not found");
			}
		}
		return false;
	}
	@Override
	public boolean updatePriceByBrandandType(double price, String brand, CosmeticType type) {
		// TODO Auto-generated method stub
		/*System.out.println("invoked updatePriceAndQuantityByBrand ");
		System.out.println("type: "+type);
		System.out.println("Brand: "+brand);
		CosmeticDTO dtoFromCosmetic = this.findbyTypeAndBrand(type, brand);
		if (dtoFromCosmetic != null) {
			System.out.println("can update , cosmetic is found");
			dtoFromCosmetic.setPrice(price);
			return true;
		} else {
			System.out.println("cannot update , cosmetic not found");
		}
		return false;
	}*/
		Iterator<CosmeticDTO> iterator = this.cosmetics.iterator();
		while(iterator.hasNext()){
			CosmeticDTO dto=iterator.next();
			if(dto.getBrand().equals(brand)&& dto.getType().equals(type)){
				System.out.println("cosmetic found");
				dto.setPrice(price);
				return true;
			}
			else{
				System.out.println("cannot update ,cosmetic not found");
			}
		}
		return false;
	}
	
	
	@Override
	public boolean deleteByBrand(String brand) {
		Iterator<CosmeticDTO> iterator = this.cosmetics.iterator();
		while(iterator.hasNext()){
			CosmeticDTO dto=iterator.next();
			if(dto.getBrand().equals(brand)){
				iterator.remove();
				return true;
			}
		}
		return false;
	}
		// TODO Auto-generated method stub
		/*for (CosmeticDTO cosDTO : this.cosmetics) {
			String brandFromDTO = cosDTO.getBrand();
			if ( brandFromDTO.equals(brand) ) {	
			this.cosmetics.remove(cosDTO);
			System.out.println("deleted");
			return true;
			
			}
		}
		return false;
	}*/
	
	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		//cosmetics.removeAll(cosmetics);
		this.cosmetics.clear();
		
	}

	 @Override 
	  public List<CosmeticDTO> getAll() {
			/*
			 * for (CosmeticDTO cosmeticDTO : this.cosmetics) {
			 * System.out.println(cosmeticDTO.getBrand()+" "+cosmeticDTO.getPrice()+" "
			 * +cosmeticDTO.getQuantity()+" "+cosmeticDTO.getCosmeticShade()+" "+cosmeticDTO
			 * .getCosmeticType()); }
			 */
		return this.cosmetics; 
	 
	  }
	 
	@Override
	public int totalSize() {
		return this.cosmetics.size();
	}

	@Override
	public boolean updaateTypeByBrand(String brand, CosmeticType type) {
		// TODO Auto-generated method stub
		Iterator<CosmeticDTO> iterator = this.cosmetics.iterator();
		while(iterator.hasNext()){
			CosmeticDTO dto=iterator.next();
			if(dto.getBrand().equals(brand)){
				System.out.println("cosmetic found");
				dto.setType(type);
				return true;
			}
		}
		return false;

	}

}
	