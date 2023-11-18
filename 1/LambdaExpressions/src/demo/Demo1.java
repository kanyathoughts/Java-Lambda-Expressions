package demo;

@FunctionalInterface
interface Cab {
	public void cab(String source, String Destination);
}

@FunctionalInterface
interface Bus {
	public String bus(String source, String Destination);
}

/*class Ola implements Cab {

	@Override
	public void cab() {
		System.out.println("Ola cab booked...");
		
	}
	
	
}*/

public class Demo1 {
	

	public static void main(String[] args) {
		/*Ola o1 = new Ola();  //You can create objects from Class
		o1.cab();
		
		Cab o2 = new Ola(); //You can create objects from parent interface also here Cab is an interface
		o2.cab(); */
		
//		Cab o3 = (source, Destination) -> System.out.println("Ola cab booked from " + source + " To " + Destination );  //directly we are implementing the abstract methods through Lambda
//		o3.cab("Hyd", "Mumbai");
		
		Bus b1 = (source, Destination) -> {
			System.out.println("Ola cab booked from " + source + " To " + Destination );
			return ("price: 5000/-");
			}; 
			b1.bus("kanigiri", "hyd");
		System.out.println(b1.bus("kanigiri", "hyd"));
		
		
		
		

	}

}
