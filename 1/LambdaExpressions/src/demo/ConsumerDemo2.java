package demo;

import java.util.function.Consumer;

public class ConsumerDemo2 {

	
	//Consumer chaining
	public static void main(String[] args) {
		
		Consumer<String> c1 = n -> System.out.println(n + " " + "is white.");
		Consumer<String> c2 = n -> System.out.println(n + " " + "has four legs.");
		Consumer<String> c3 = n -> System.out.println(n + " " + "is eating grass.");
		
		/*c1.accept("cow");
		c2.accept("cow");
		c3.accept("cow");*/
		
		//Same argument we are passing in all 3 consumers so we can perform one after another by chaining.
		
		c1.andThen(c2).andThen(c3).accept("Cow"); //In a single line you can give first c1 and then c2 and then c3 will execute.
		
		//or we can create another consumer and we can chain other consumers
		
		Consumer<String> c4 = c1.andThen(c2).andThen(c3);
		c4.accept("Cow");

	}

}
