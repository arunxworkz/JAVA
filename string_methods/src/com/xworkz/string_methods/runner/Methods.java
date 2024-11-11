package com.xworkz.string_methods.runner;

public class Methods {

	public static void methods() {
		String object = "International Space Station";
		
		System.out.println(object.charAt(12));
		System.out.println(object.chars());
		System.out.println(object.codePointBefore(5));
		System.out.println(object.compareTo("Today is a good day"));
		System.out.println(object.concat("that's why it is called as present"));
		System.out.println(object.contains("Space"));
		System.out.println(object.contains("space"));
		System.out.println(object.endsWith("Station"));
		System.out.println(object.hashCode());
		System.out.println(object.indexOf("Space"));
		System.out.println(object.indexOf("p"));
		System.out.println(object.isEmpty());
		System.out.println(object.length());
		System.out.println(object.replace("Space", ""));
		System.out.println(object.toCharArray());
		System.out.println(object.toLowerCase());
		System.out.println(object.toUpperCase());
	}
}
