package com.xworkz.xworkzapp.resort.tester;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.xworkz.xworkzapp.resort.dto.BeachDTO;
import com.xworkz.xworkzapp.resort.sort.BeachNoOfResortsComparator;

public class BeachTester {

	public static void main(String[] args) {
		BeachDTO dto=new BeachDTO("Om", 23, 2);
		BeachDTO dto2=new BeachDTO("Malpe", 4, 12);
		BeachDTO dto3=new BeachDTO("Juhu", 45, 6);
		
		List<BeachDTO> dtos=new ArrayList<BeachDTO>();
		dtos.add(dto);
		dtos.add(dto2);
		dtos.add(dto3);
		
		for (BeachDTO beachDTO : dtos) {
			System.out.println(beachDTO);
		}
		
		System.out.println();
		
		System.out.println("sorting based on name");
		Collections.sort(dtos);
		for (BeachDTO beachDTO : dtos) {
			System.out.println(beachDTO);
		}
		System.out.println();
		
		System.out.println("sorting based on noOfResorts");
		BeachNoOfResortsComparator comparator = new BeachNofOfResortsComparator();
		
		Collections.sort(dtos,comparator);
		
		for (BeachDTO beachDTO : dtos) {
			System.out.println(beachDTO);
		}
		
		

	}

}
}
