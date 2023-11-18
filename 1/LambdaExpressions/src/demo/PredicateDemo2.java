package demo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Employee {
	String ename;
	int salary, experience;
	
	public Employee(String name, int sal, int exp) {
		this.ename = name;
		this.salary = sal;
		this.experience = exp;
	}
	
}

public class PredicateDemo2 {

	public static void main(String[] args) {
		
		Employee e1 = new Employee("Kanya", 35000, 2); //e1 is reference variable and "new Employee("Kanya", 35000, 2)" is the real object.
		
		//Ex1: Print name when conditions matched
		Predicate<Employee> p = pr -> pr.salary > 30000 && pr.experience > 1; 
		System.out.println(p.test(e1));
		
		if (p.test(e1)) {
			System.out.println(e1.ename);
		}
		
		
		//Ex2: take multiple objects at a time and print name when condition matches
		
		List<Employee> l = new ArrayList<>();
		l.add(new Employee("Buddi", 50000, 5));
		l.add(new Employee("Chitti", 70000, 10));
		l.add(new Employee("Daddy", 40000, 30));
		
		for (Employee e:l) {
			if (p.test(e)) {
				System.out.println(e.ename);
			}
		}
		
		

	}

}
