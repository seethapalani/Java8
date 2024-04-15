package mapdemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
	 int id;
	 String name;
	 double salary;
	 
	 
	 public Employee(int id,String name, double salary){
		 
		 this.id=id;
		 this.name=name;
		 this.salary=salary;
	 }
	
}
public class Mapdemo3 {

	public static void main(String[] args) {
		
		List<Employee> employeelist= Arrays.asList(
				new Employee(101,"Amala",20000),
				new Employee(102,"Bala",70000),
				new Employee(103,"Cindrella",50000),
				new Employee(104,"Daniela",40000),
				new Employee(105,"Elza",60000)
				);
	
		List<Double> empSalList=employeelist.stream().filter(e->e.salary>30000)
		                     .map(e->e.salary)
		                     .collect(Collectors.toList());
		                   //  .forEach(s->System.out.println(s));

	}

}
