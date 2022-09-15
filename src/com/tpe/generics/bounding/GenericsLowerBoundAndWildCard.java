package com.tpe.generics.bounding;

import java.util.ArrayList;
import java.util.List;

public class GenericsLowerBoundAndWildCard {

	public static void main(String[] args) {

		
		List<Object> ol=new ArrayList<>();
		printelements(ol);
		
		List<Number> nl = new ArrayList<>();
		printelements(nl);

		// Compile Time Error
//		List<Double> dl = new ArrayList<>();
//		printelements(dl);
		
		printelements2(new ArrayList<String>());
		
		List<String> strList=new ArrayList<>();
//		printObj(strList); Compile Time Error
		
		List<Object> objList= new ArrayList<>();
		printObj(objList);

	}
	
	
	// ? -> integer'in superi olan siniflari temsil etmektedir
	public static void printelements(List<? super Integer> list) {
		for (int i = 1; i < 10; i++) {
			list.add(i);
		}
	}
	
	
	// unbound bir liste parametre aliyor
	public static void printelements2(List<?> listOfUnknown ) {
		
		// listOfUnknown.add("Java");// Compile Time Error -> listeleme yapar get().. 
									 // ama add() yapmaz type belli degil cunku
		listOfUnknown.add(null);// -> sadece null ekleyebilirsin. "istisna". 
		
		for (Object object : listOfUnknown) {
			System.out.println(object);
		}
		
	}
	
	
	public static void printObj(List<Object> listOfObject) {
		
		listOfObject.add("Java");
		
		for (Object object : listOfObject) {
			System.out.println(object);
		}
		
	}
	

}
