package com.xworkz.malldto.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.sun.xml.internal.bind.v2.runtime.reflect.ListIterator;
import com.xworkz.malldto.internal.Location;
import com.xworkz.malldto.internal.MallDTO;

public class MAllDTORunner {

	static Location location;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<MallDTO> collection = new ArrayList<>(); 
		collection.add(new MallDTO(1, "Orion Mall", location.DRRAJKUMARROAD, "Githa Shanka", 820000));
		collection.add(new MallDTO(2, "Mantri Square Mall", location.SAMPIGEROAD, "Sunil Mantri", 100000));
		collection.add(new MallDTO(3, "Lulu Mall Bengaluru", location.DRRAJKUMARROAD, "D K Shivkumar", 200000));
		collection.add(new MallDTO(4, "UB City", location.UBCITY, "Vital Malya", 80000));
		collection.add(new MallDTO(5, "GT World Mall - Bengaluru", location.MAGADIMAINROAD, "Gangamma Thimmaiah", 250000));
		collection.add(new MallDTO(6, "Phoenix Marketcity", location.WHITEFIELD, "Atul Ruia", 90000));
		collection.add(new MallDTO(7, "Bangalore Central", location.ARKEREROARD, "Sunil Sheety", 400000));
		collection.add(new MallDTO(8, "Esteem Mall", location.OLDMADRASROAD, "Joseph", 150000));
		collection.add(new MallDTO(9, "Gopalan Signature Mall", location.OLDMADRASROAD, "Gopal", 300000));
		collection.add(new MallDTO(10, "Park Square Mall", location.WHITEFIELDMAINROAD, "Chinnaswamy", 90000));
		
		collection.stream().forEach(ref->System.out.println(ref));
		
		System.out.println("====================================================================================================");
		
		collection.stream().sorted((ref1, ref2)->ref2.compareTo(ref1)).forEach(ref->System.out.println(ref));
		
		System.out.println("====================================================================================================");
		
		collection.stream().sorted((ref1, ref2)->ref2.getName().compareTo(ref1.getName())).forEach(ref->System.out.println(ref));
		
		System.out.println("====================================================================================================");

		Iterator itr = collection.iterator();
		
		System.out.println("Iterator: Forward traversal");
		while(itr.hasNext())
			System.out.println(itr.next()+ " ");
		
		System.out.println("====================================================================================================");
		
		ListIterator<MallDTO> li ;
		
		/*System.out.println("ListIterator: Forward traversal:");
		while(li.hasNext()) {
			System.out.println(li.next()+" ");*/
			
		System.out.println("====================================================================================================");
		
		//System.out.println("ListIterator: Backward traversal:");
		//while(li.)
		
		collection.stream().sorted().filter(ref->ref.getLandDimension()<100000).forEach(ref->System.out.println(ref.getLandDimension() +" "+ ref.getName()));
		
		collection.forEach(ref->System.out.println(ref.getName()));
		
		collection.stream().sorted((ref1, ref2)->ref1.compareTo(ref2)).forEach(ref->System.out.println(ref.getLandDimension()));
		
		
		
		}
}


