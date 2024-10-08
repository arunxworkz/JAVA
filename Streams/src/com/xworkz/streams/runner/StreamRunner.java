package com.xworkz.streams.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamRunner {

	public static void main(String[] args) {
		
		Collection<Integer> collection = new ArrayList<Integer>();
		collection.add(1100);
		collection.add(2100);
		collection.add(3000);
		collection.add(10);
		
		for(Integer i: collection) {
			System.out.println(i);
		}
		
		System.out.println("After sorting");
		
		List<Integer> li= collection.stream().sorted().collect(Collectors.toList());
		for(Integer i: li) {
			System.out.println(i);
		}
		
		int sum = collection.stream().collect(Collectors.summingInt(Integer::intValue));
		System.out.println("The sum is: "+sum);
		
		System.out.println("-------------------------------------------------------");
		
		Collection<Long> longCollection = new ArrayList<Long>();
		longCollection.add(123456L);
		longCollection.add(457896321L);
		longCollection.add(235647951L);
		longCollection.add(1213689L);
		longCollection.add(121L);
		/*Stream<Long> stream = longCollection.stream();
		System.out.println("Before sorting");
		System.out.println(stream.sorted().collect(Collectors.toList()));*/
		
		
		System.out.println("Usig lambda expression: Asscending order");
		System.out.println(longCollection.
				stream().sorted() // This sorted() will automatically   
				.collect(Collectors.toList())
				);
		System.out.println("In Decending oredr");
		System.out.println(longCollection.stream()
				.sorted((a, b)->b.compareTo(a)).collect(Collectors.toList()));
		/*System.out.println(
			    longCollection.stream()
			                  .sorted((a, b) -> b.compareTo(a))  // Lambda expression for reverse sorting
			                  .collect(Collectors.toList())
			);*/
		
		System.out.println("-------------------------------------------------------");
		
		Collection<String> stringCollection = new ArrayList<>();
		stringCollection.add("Jawaharlal Nehru");
		stringCollection.add("Gulzarilal Nanda");
		stringCollection.add("Lal Bahadur Shastri");
		stringCollection.add("Indira Gandhi");
		stringCollection.add("Morarji Desai");
		stringCollection.add("Charan Singh");
		stringCollection.add("Rajiv Gandhi");
		stringCollection.add("Vishwanath Pratap Singh");
		stringCollection.add("Chandra Shekhar");
		stringCollection.add("P. V. Narasimha Rao");
		stringCollection.add("H. D. Deve Gowda");
		stringCollection.add("Atal Bihari Vajpayee");
		stringCollection.add("Inder Kumar Gujral");
		stringCollection.add("Manmohan Singh");
		stringCollection.add("Narendra Modi");
		
		System.out.println("Before sorting: "+stringCollection.stream()
		.collect(Collectors.toList()));//Returns a Collector that accumulates the input elements into anew List
		
		System.out.println("After sorting: "+
				stringCollection.stream()
				.sorted()
				.collect(Collectors.toList())
		);
		
		System.out.println("---------------------------------------------------------------------");
		
		System.out.println("Upper caes: "+
				stringCollection.stream().
				map(String::toUpperCase)
				.sorted().collect(Collectors.toList())
				);
		
		System.out.println("---------------------------------------------------------------------");
		
		/*Collection<String> statesCollection = new List<String>(); 
		 * This can nor be done as list is an interface*/
		
		Collection<String> statesCollection = new LinkedList<>();
		
		statesCollection.add("Karnataka");
		statesCollection.add("Tamilnadu");
		statesCollection.add("Kerala");
		statesCollection.add("Andrapradesh");
		statesCollection.add("Madypradesh");
		statesCollection.add("Maharastra");
		statesCollection.add("Delhi");
		statesCollection.add("Uttarakhand");
		statesCollection.add("Himachalpradesh");
		statesCollection.add("Uttarpradesh");
		statesCollection.add("Jammu Kashmir");
		statesCollection.add("Gugurath");
		statesCollection.add("Goa");
		statesCollection.add("Chattisgarh");
		statesCollection.add("Bihar");
		statesCollection.add("Assam");
		statesCollection.add("Arunachalpradesh");
		statesCollection.add("Manipur");
		statesCollection.add("Megalaya");
		statesCollection.add("Mizoram");
		statesCollection.add("Tripura");
		statesCollection.add("Telanagana");
		statesCollection.add("Punjab");
		statesCollection.add("West Bengl");
		statesCollection.add("Sikkim");
		statesCollection.add("Rajasthan");
		statesCollection.add("Odisha");
		statesCollection.add("Nagalanad");
		statesCollection.add("Jharkhand");
		
		System.out.println("Number of States: "+statesCollection.stream().count());
		System.out.println(statesCollection.stream().sorted().collect(Collectors.toList()));
		
		List<String> li1 = statesCollection.
				stream().sorted((a, b)->b.compareTo(a))
				.collect(Collectors.toList());
		for(String ref: li1) {
			System.out.println(ref);
		}
		



	}

}
