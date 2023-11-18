package demo;

import java.util.function.Function;

public class FunctionDemo1 {

	public static void main(String[] args) {
		
		Function<Integer, Integer> f = value -> value*value;
		System.out.println(f.apply(5)); //25
		System.out.println(f.apply(25)); //625
		System.out.println(f.apply(35)); //1225
		
		
		Function<String, Integer> f2 = value -> value.length();
		System.out.println(f2.apply("kanya")); //5

	}

}
