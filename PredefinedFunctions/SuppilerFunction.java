package PredefinedFunctions;

import java.util.function.Supplier;

public class SuppilerFunction {
	public static void main(String[] args) {
		/*
		 * 
		 * interface Suppiler<> { public T get(); }
		 * 
		 */

//		Supplier<String> sup = () -> "Hello world";
//      System.out.println("Output : "+sup.get());

		Supplier<Integer> sup = () -> 10;
		System.out.println("Number : " + sup.get());
	}

}
