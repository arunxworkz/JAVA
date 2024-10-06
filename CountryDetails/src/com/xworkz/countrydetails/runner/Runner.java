package com.xworkz.countrydetails.runner;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

import com.xworkz.countrydetails.countries.Codes;
import com.xworkz.countrydetails.countries.Continents;
import com.xworkz.countrydetails.countries.CountiesDTO;
import com.xworkz.countrydetails.countries.CountriesDTO;

public class Runner {
	private static final boolean CountriesDTO = false;

	public static void main(String[] arr) {
		
		/*int size = 195;
		int[] arr1 = new int[size];*/
		
		CountriesDTO countriesDTO1 = new CountriesDTO("India", 14000000L, "Murmu", Codes.CODE_12, Continents.ASIA);
		CountriesDTO countriesDTO2 = new CountriesDTO("Afganisthan", 1530154L, "Emir of Afghanistan", Codes.CODE_8, Continents.ANTARTICA);
		CountriesDTO countriesDTO3 = new CountriesDTO("Algeria", 4562703L, "Abdelmadjid Tebboune", Codes.CODE_12, Continents.NORTHAFRICA);
		CountriesDTO countriesDTO4 = new CountriesDTO("American Samoa", 5000000L, "Joe Biden", Codes.CODE_16, Continents.EUROPE);
		CountriesDTO countriesDTO5 = new CountriesDTO("Andorra", 79824L, "Xavier Espot Zamora", Codes.CODE_20, Continents.EUROPE);
		CountriesDTO countriesDTO6 = new CountriesDTO("Angola", 3560000000L, "Jo�o Louren�o", Codes.CODE_24, Continents.ANTARTICA);
		CountriesDTO countriesDTO7 = new CountriesDTO("Anguila", 15094L, "Ellis Webster", Codes.CODE_660, Continents.NORTHAMERICA);
		CountriesDTO countriesDTO8 = new CountriesDTO("Argentina", 462000000L, "Javier Milei", Codes.CODE_32, Continents.SOUTHAMERICA);
		CountriesDTO countriesDTO9 = new CountriesDTO("Australia", 260000000L, "Anthony Norman Albanese", Codes.CODE_36, Continents.AUSTRALIA);
		CountriesDTO countriesDTO10 = new CountriesDTO("Austria", 90000000L, "Alexander Van der Bellen", Codes.CODE_40, Continents.EUROPE);
		/*CountriesDTO countiesDTO11 = new CountriesDTO();
		CountriesDTO countriesDTO12 = new CountriesDTO();
		CountriesDTO countriesDTO13 = new CountriesDTO();
		CountriesDTO countriesDTO14 = new CountriesDTO();
		CountriesDTO countriesDTO15 = new CountriesDTO();
		CountriesDTO countriesDTO16 = new CountriesDTO();
		CountriesDTO countriesDTO17 = new CountriesDTO();
		CountriesDTO countriesDTO18 = new CountriesDTO();
		CountriesDTO countriesDTO19 = new CountriesDTO();
		CountriesDTO countriesDTO20 = new CountriesDTO();
		CountriesDTO countriesDTO21 = new CountriesDTO();*/
		CountriesDTO countriesDTO11 = new CountriesDTO("Azerbaijan", 10139177L, "Ilham Aliyev", Codes.CODE_31, Continents.ASIA);
		CountriesDTO countriesDTO12 = new CountriesDTO("Bahamas", 393248L, "Philip Davis", Codes.CODE_44 ,Continents.NORTHAMERICA);
		CountriesDTO countriesDTO13 = new CountriesDTO("Bahrain", 1701575L, "Hamad bin Isa Al Khalifa", Codes.CODE_48,  Continents.ASIA);
		CountriesDTO countriesDTO14 = new CountriesDTO("Bangladesh", 165158616L, "Mohammad Shahabuddin", Codes.CODE_50, Continents.ASIA);
		CountriesDTO countriesDTO15 = new CountriesDTO("Barbados", 287371L, "Sandra Mason",Codes.CODE_52,Continents.NORTHAMERICA);
		CountriesDTO countriesDTO16 = new CountriesDTO("Belarus", 9408400L, "Alexander Lukashenko", Codes.CODE_112, Continents.EUROPE);
		CountriesDTO countriesDTO17 = new CountriesDTO("Belgium", 11589623L, "Philippe of Belgium",Codes.CODE_56, Continents.EUROPE);
		CountriesDTO countriesDTO18 = new CountriesDTO("Belize", 419199L, "John Briceño", Codes.CODE_84, Continents.NORTHAMERICA);
		CountriesDTO countriesDTO19 = new CountriesDTO("Benin", 12721718L, "Patrice Talon", Codes.CODE_204, Continents.AFRICA);
		CountriesDTO countriesDTO20 = new CountriesDTO("Bhutan", 777486L, "Jigme Khesar Namgyel Wangchuck",Codes.CODE_64, Continents.ASIA);
		CountriesDTO countriesDTO21 = new CountriesDTO("Bolivia", 11832084L, "Luis Arce", Codes.CODE_68,  Continents.SOUTHAMERICA);
		CountriesDTO countriesDTO22 = new CountriesDTO("Bosnia and Herzegovina", 3280819L, "Denis Bećirović", Codes.CODE_70, Continents.EUROPE);
		CountriesDTO countriesDTO23 = new CountriesDTO("Botswana", 2351627L, "Mokgweetsi Masisi",Codes.CODE_72,  Continents.AFRICA);
		CountriesDTO countriesDTO24 = new CountriesDTO("Brazil", 214326223L, "Luiz Inácio Lula da Silva",Codes.CODE_76,  Continents.SOUTHAMERICA);
		CountriesDTO countriesDTO25 = new CountriesDTO("Brunei", 445431L, "Hassanal Bolkiah", Codes.CODE_96, Continents.ASIA);
		CountriesDTO countriesDTO26 = new CountriesDTO("Bulgaria", 6927288L, "Rumen Radev", Codes.CODE_100,  Continents.EUROPE);
		CountriesDTO countriesDTO27 = new CountriesDTO("Burkina Faso", 21929000L, "Ibrahim Traoré", Codes.CODE_854, Continents.AFRICA);
		CountriesDTO countriesDTO28 = new CountriesDTO("Burundi", 12592000L, "Évariste Ndayishimiye", Codes.CODE_108, Continents.AFRICA);
		CountriesDTO countriesDTO29 = new CountriesDTO("Cabo Verde", 555987L, "José Maria Neves",Codes.CODE_116, Continents.AFRICA);
		CountriesDTO countriesDTO30 = new CountriesDTO("Cambodia", 17118000L, "Hun Sen", Codes.CODE_120, Continents.ASIA);
		CountriesDTO countriesDTO31 = new CountriesDTO("Cameroon", 27745000L, "Paul Biya", Codes.CODE_124,  Continents.AFRICA);
		CountriesDTO countriesDTO32 = new CountriesDTO("Canada", 38008005L,"Mary Simon", Codes.CODE_132,  Continents.NORTHAMERICA);
		CountriesDTO countriesDTO33 = new CountriesDTO("Central African Republic",  4829767L,"Faustin-Archange Touadéra", Codes.CODE_136, Continents.AFRICA);
		CountriesDTO countriesDTO34 = new CountriesDTO("Chad", 17351672L, "Mahamat Déby Itno", Codes.CODE_140, Continents.AFRICA);
		CountriesDTO countriesDTO35 = new CountriesDTO("Chile", 19116201L, "Gabriel Boric", Codes.CODE_148,  Continents.SOUTHAMERICA);
		CountriesDTO countriesDTO36 = new CountriesDTO("China", 1411778724L, "Xi Jinping", Codes.CODE_152, Continents.ASIA);
		CountriesDTO countriesDTO37 = new CountriesDTO("Colombia", 51874000L, "Gustavo Petro",Codes.CODE_156,  Continents.SOUTHAMERICA);
		CountriesDTO countriesDTO38 = new CountriesDTO("Comoros", 869595L, "Azali Assoumani", Codes.CODE_162,  Continents.AFRICA);
		CountriesDTO countriesDTO39 = new CountriesDTO("Congo - Brazzaville", 5615000L, "Denis Sassou Nguesso",Codes.CODE_166,  Continents.AFRICA);
		CountriesDTO countriesDTO40 = new CountriesDTO("Congo - Kinshasa", 92378000L, "Félix Tshisekedi", Codes.CODE_170, Continents.AFRICA);
		CountriesDTO countriesDTO41 = new CountriesDTO("Costa Rica", 5058007L, "Rodrigo Chaves Robles",Codes.CODE_180 , Continents.NORTHAMERICA);
		CountriesDTO countriesDTO42 = new CountriesDTO("Croatia", 3885736L, "Zoran Milanović", Codes.CODE_178, Continents.EUROPE);
		CountriesDTO countriesDTO43 = new CountriesDTO("Cuba", 11209628L, "Miguel Díaz-Canel",Codes.CODE_184, Continents.NORTHAMERICA);
		CountriesDTO countriesDTO44 = new CountriesDTO("Cyprus", 1193200L, "Nikos Christodoulides",Codes.CODE_188, Continents.EUROPE);
		CountriesDTO countriesDTO45 = new CountriesDTO("Czech Republic", 10578820L, "Petr Pavel", Codes.CODE_384, Continents.EUROPE);
		CountriesDTO countriesDTO46 = new CountriesDTO("Denmark", 5896000L, "Mette Frederiksen", Codes.CODE_191,  Continents.EUROPE);
		CountriesDTO countriesDTO47 = new CountriesDTO("Djibouti", 1078373L, "Ismaïl Omar Guelleh", Codes.CODE_192, Continents.AFRICA);
		CountriesDTO countriesDTO48 = new CountriesDTO("Dominica", 71991L, "Roosevelt Skerrit", Codes.CODE_203, Continents.NORTHAMERICA);
		CountriesDTO countriesDTO49 = new CountriesDTO("Dominican Republic", 10907400L,  "Luis Abinader", Codes.CODE_200,Continents.NORTHAMERICA);
		CountriesDTO countriesDTO50 = new CountriesDTO("Ecuador", 18258748L, "Daniel Noboa",Codes.CODE_108, Continents.SOUTHAMERICA);
		CountriesDTO countriesDTO51 = new CountriesDTO("East Timor", 1300000L, "Jos� Manuel Ramos-Horta", Codes.CODE_626, Continents.ASIA);
		CountriesDTO countriesDTO52 = new CountriesDTO("Ecuador", 180000000L, "Daniel Noboa", Codes.CODE_218, Continents.SOUTHAMERICA);
		
		CountriesDTO[] countriesDTO = {countriesDTO1, countriesDTO2, countriesDTO3, 
				countriesDTO4, countriesDTO5, countriesDTO6, countriesDTO7, countriesDTO8, countriesDTO9, countriesDTO10,
				countriesDTO11, countriesDTO12, countriesDTO13, countriesDTO14, countriesDTO15, countriesDTO16, countriesDTO17, 
				countriesDTO18, countriesDTO19, countriesDTO20, countriesDTO21, countriesDTO22, countriesDTO23, countriesDTO24, 
				countriesDTO25, countriesDTO26, countriesDTO27, countriesDTO28, countriesDTO29, countriesDTO30, countriesDTO31, 
				countriesDTO32, countriesDTO33, countriesDTO34, countriesDTO35, countriesDTO36, countriesDTO37, countriesDTO38, 
				countriesDTO39, countriesDTO40, countriesDTO41, countriesDTO42, countriesDTO43, countriesDTO44, countriesDTO45, 
				countriesDTO46, countriesDTO47, countriesDTO48, countriesDTO49, countriesDTO50};
		
		
		
		
		
		
		
		Collection<CountriesDTO> collection = new LinkedList<>();
		
		Iterator<CountriesDTO> iterator = collection.iterator();
		while(iterator.hasNext()) {
			CountriesDTO countriesDTO53 = iterator.next();
			System.out.println(countriesDTO53);
		}
		
		System.out.println("-------------------------------------------------------------------------------------------");
		
		/*CountiesDTO countiesDTO = new CountiesDTO("India", 14000000L, "Murmu", Codes.CODE_12, Continents.ASIA);
		System.out.println(countriesDTO);*/
		//collection.add(countriesDTO1);
		//collection.add(countriesDTO2);
		
		collection.addAll(Arrays.asList(countriesDTO));
		
		/*for(int i = 0;i < arr1.length; i++) {
			collection.add(i);
		}*/
		
		for(CountriesDTO dto: collection) {
			if(dto.getPopulation()>250000000) {
				System.out.println(dto);	
			}	
		}	
		System.out.println("-------------------------------------------------------------------------------------------------------");
		for(CountriesDTO dto: collection) {
			System.out.println(dto.getPresidentName());
		}
		System.out.println("---------------------------------------------------------------------------------------------------------------");
		for(CountriesDTO dto: collection) {
			if(dto.getCode().getValue() < Codes.CODE_50.getValue()) {
				System.out.println(dto);
			}
		}
		System.out.println("-----------------------------------------------------------------------------------------------------------------");
		for(CountriesDTO dto: collection) {
			if(dto.getName().startsWith("A") && dto.getCode().getValue() < Codes.CODE_50.getValue()) {
				System.out.println(dto);
			}
		}
		System.out.println("------------------------------------------------------------------------------------------------------------------");
		for(CountriesDTO dto: collection) {
			if(dto.getName().contains("i")) {
				System.out.println(dto);
			}
		}
		System.out.println("-------------------------------------------------------------------------------------------------------------------");
		for(CountriesDTO dto: collection){
			if(!dto.getName().contains("i")) {
				System.out.println(dto);
			}
		}
	}
}
