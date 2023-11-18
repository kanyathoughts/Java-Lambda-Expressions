package demo;

import java.util.function.Predicate;

public class PredicateDemo3 {

	public static void main(String[] args) {
		
		//joining predicates by "and", "or", "negate"
		
		int[] a = {5,15,30,40,45,55,65,75};
		Predicate<Integer> p1 = value -> value >20;
		Predicate<Integer> p2 = value -> (value%2==0);
		
		//and
		for (Integer value: a) {
			if (p1.and(p2).test(value)) { //if (p1.test(value) && p2.test(value)) This is normal way of checking but we can pass the parameter only once by combining predicates
				System.out.println(value);
			}
		}
		System.out.println("---------------------------");
		//or
		for (Integer value2: a) {
			if (p1.or(p2).test(value2)) {
				System.out.println(value2);
			}
		}
		
		System.out.println("-----------------------------");
		
		//negate method  negative logic of the lambda expression p1 contains if even but now negate will print only odd.
		for (Integer value3: a) {
			if (p1.negate().test(value3)) {
				System.out.println(value3);
			}
		}
	}
}
