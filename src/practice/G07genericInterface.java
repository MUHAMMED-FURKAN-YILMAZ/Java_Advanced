package practice;

// OCA trick = ayni dosya icinde birden fazla create edilen non-inner class lari JVM compile ederken
// sadece main class public olarak tanimlar. diger class lar dan herhangi biri de public olursa CTE verir

public class G07genericInterface {//main class
    //1 math islem yapan mehodu olan bir generic interface create diniz
    //2 us alma yapan bir class create edip bu classtan interface i implement edin
    //3 main methoddan obj ler creqate edip call yapin
	
	
	public static void main(String[] args) {
		
		UsAlanClass<Float> floatUs=new UsAlanClass<>();
		System.out.println("floatUs.usAl(5f, 2f) = "+floatUs.usAl(5f, 2f));
		
		
		UsAlanClass<Double> doubleUs=new UsAlanClass<>();
		System.out.println("doubleUs.usAl(5.2, 2.3) = "+doubleUs.usAl(5.2, 2.3));

		UsAlanClass<Integer> intUs=new UsAlanClass<>();
		System.out.println("intUs.usAl(3, 2) = "+intUs.usAl(3, 2));
	}
	

}

interface MathIslem <T extends Number> {// generic interface'den data type number olarak parameterini bounded'i create edildi 
	
	double usAl(T t, T u);// abstract bir parametreli generic method create ettik
	
}


class UsAlanClass <T extends Number> implements MathIslem <T> {

	@Override
	public double usAl(T t, T u) {// pow() methodu parametre olarak double alir. Bundan dolayi parametreleri double'a donusturduk
		
		return Math.pow(t.doubleValue(), u.doubleValue());
	}


	}
	

