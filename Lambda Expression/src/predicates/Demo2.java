package predicates;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee{
	String ename;
	int salary;
	int experience;
	
	Employee(String name,int sal, int exp)
	{
		ename=name;
		salary=sal;
		experience=exp;
	}
}
public class Demo2 {

	public static void main(String[] args) {
		
		Employee emp= new Employee("John",25000,5);
		Predicate<Employee> p=e->(e.salary>20000 && e.experience>3);
		System.out.println(p.test(emp));
		
		//Array
		ArrayList<Employee> al =new ArrayList<Employee>();
		al.add(new Employee("John", 50000,5));
		al.add(new Employee("David", 30000,5));
		al.add(new Employee("Scott", 20000,5));
		al.add(new Employee("John", 10000,5));
		for (Employee e : al) {
			if(p.test(e)) {
			
			System.out.println(e.ename + " " +e.salary +" "+e.experience);
			}
		}
		
		
		

	}

}
