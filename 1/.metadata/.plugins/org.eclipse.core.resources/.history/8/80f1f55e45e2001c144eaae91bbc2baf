package demo;

import java.util.function.Function;

//Function chaining concept
//1.andThen()
//2.compose()
public class FunctionDemo3 {

	public static void main(String[] args) {
		
		Function<Integer, Integer> f1 = n -> n*2; 
		Function<Integer, Integer> f2 = n -> n*n*n;
		
		System.out.println(f1.andThen(f2).apply(2));  //first it will go to f1 and calculate 2*2= 4 and come to f2 4*4*4 = 64
		
		System.out.println(f1.compose(f2).apply(2)); //first it will go to f2 and calculate 2*2*2= 8 and come to f1 8*2 = 16 (Opposite of andThen() method)
		

	}

}
