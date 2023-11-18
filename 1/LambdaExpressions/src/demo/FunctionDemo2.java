package demo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionDemo2 {

	public static void main(String[] args) {
		
		List<Employee> l = new ArrayList<>();
		l.add(new Employee("Buddi", 50000, 5));
		l.add(new Employee("Chitti", 30000, 10));
		l.add(new Employee("Daddy", 20000, 30));
		
		Function<Employee, Integer> f1 = n -> 
		{
			int sal = n.salary;
			if (sal == 20000)
				return sal*10/100;
			else if (sal == 30000)
				return sal*20/100;
			else if(sal>40000)
				return sal*30/100;
			else
				return sal*40/100;
		};
		
		Predicate<Integer> p1 = b -> b>5000; //here we can give bonus as argument if bonus is more than 5000 then only print employee details and bonus.
		
		for (Employee value: l) {
			int bonus = f1.apply(value);  //function
			if (p1.test(bonus)) { //predicate 
			System.out.println("Employee: " + value.ename + ", salary: " + value.salary);
			System.out.println("bonus is: " + bonus);
			}
		}

	}

}
