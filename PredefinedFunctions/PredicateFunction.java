package PredefinedFunctions;

import java.util.function.Predicate;

public class PredicateFunction {
	public static void main(String[] args) {
		/*
		 * interface Predicate<T> { public boolean test(Integer t);
		 * 
		 */

//		Predicate<String> pr = (t) -> {
//			if (t.equalsIgnoreCase("Rohan")) {
//				return true;
//			} else {
//				return false;
//			}
//		};
//
//		System.out.println(pr.test("Rohan"));
//
//		Predicate<Integer> pr = (t) -> {
//			if (t > 10) {
//				return true;
//
//			} else {
//				return false;
//			}
//		};
//
//		System.out.println(pr.test(20));
		
		Predicate <Integer> odd = (n) -> n%2!=0;
		System.out.println(odd.test(3));

	}

}
