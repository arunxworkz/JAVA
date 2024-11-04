package com.xworkz.militry.runner;

import java.util.HashSet;
import java.util.Set;

import com.xworkz.militry.dto.MilitaryDTO;

public class Runner {

	public static void main(String[] args) {
		
		Set<MilitaryDTO> militaryDTO = new HashSet();
		
		MilitaryDTO militaryDTO1 = new MilitaryDTO(1, "Sig Sauer MCX", 	"United States/Germany", 2015);
		MilitaryDTO militaryDTO2 = new MilitaryDTO(2, "Kalashnikov AK-12", "Russia", 2018);
		MilitaryDTO militaryDTO3 = new MilitaryDTO(3, "Desert Tech MDR", "United States", 2017);
		MilitaryDTO militaryDTO4 = new MilitaryDTO(4, "FN EVOLYS", "Belgium", 2021);
		MilitaryDTO militaryDTO5 = new MilitaryDTO(5, "Beretta ARX 200", "Italy", 2015);
		MilitaryDTO militaryDTO6 = new MilitaryDTO(6, "CZ BREN 2", "Czech Republic", 2016);
		MilitaryDTO militaryDTO7 = new MilitaryDTO(7, "Q Honey Badger", "United States", 2018);
		MilitaryDTO militaryDTO8 = new MilitaryDTO(8, "IWI Tavor 7", "Israel", 2018);
		MilitaryDTO militaryDTO9 = new MilitaryDTO(9, "Haenel MK 556", "Germany", 2016);
		MilitaryDTO militaryDTO10 = new MilitaryDTO(10, "FB MSBS GROT", "Poland", 2017);
		
		militaryDTO.add(militaryDTO1);
		militaryDTO.add(militaryDTO2);
		militaryDTO.add(militaryDTO3);
		militaryDTO.add(militaryDTO4);
		militaryDTO.add(militaryDTO5);
		militaryDTO.add(militaryDTO6);
		militaryDTO.add(militaryDTO7);
		militaryDTO.add(militaryDTO8);
		militaryDTO.add(militaryDTO9);
		militaryDTO.add(militaryDTO10);
			
		System.out.print(militaryDTO);
		
		System.out.println("-----------------------------------------------------");
		
		militaryDTO.stream().filter(ref->ref.getManfDate() > 2015).forEach(ref->System.out.println(ref));
		
		System.out.println("-----------------------------------------------------");
		
		militaryDTO.stream().filter(ref->ref.getManfDate() < 2020).forEach(ref->System.out.println(ref));
		
		System.out.println("-----------------------------------------------------");
		
		militaryDTO.stream()
        .sorted((ref1, ref2) -> Integer.compare(ref2.getId(), ref1.getId())) // Sort by id in descending order
        .forEach(System.out::println);

	}

}
