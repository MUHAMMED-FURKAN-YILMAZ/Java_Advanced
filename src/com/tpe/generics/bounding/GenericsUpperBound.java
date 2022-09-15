package com.tpe.generics.bounding;

// ustten sinirlama

// Class'dan obje olusturabilmek icin Number'i extend eden wrapper tiplerden vermem gerekir
public class GenericsUpperBound <T extends Number> {

	
	private T[] numberArray;
	
	
	public GenericsUpperBound(T [] pnumberArray) {
		this.numberArray=pnumberArray;
	}
	
	
	public double getAverage() {
		double sum=0;
		
		for (T t : numberArray) {
			sum+=t.doubleValue();
		}
		
		double avg=sum/numberArray.length;
		return avg;
	}
	
	
	public static void main(String[] args) {

		Integer [] intArr= {2,5,6,34};
		
		GenericsUpperBound<Integer> gub1= new GenericsUpperBound<>(intArr);
		System.out.println(gub1.getAverage());
		
		
		
		Double [] doubleArr= {2.5,5.54,6.34,34.34};
		
		GenericsUpperBound<Double> gub2= new GenericsUpperBound<>(doubleArr);
		System.out.println(gub2.getAverage());
		
		
		// Compile Time Error
//		String [] strArray= {"Java","Kolay","Bir","Dil","midir?"};
//		GenericUpperBound<String> gub3 = new GenericUpperBound<>(strArray);
		
		
	}

}
