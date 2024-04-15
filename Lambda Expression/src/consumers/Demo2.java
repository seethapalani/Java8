package consumers;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee
{
	String ename;
	int salary;
	String gender;
	Employee(String ename,int salary,String gender ){
		this.ename=ename;
		this.salary=salary;
		this.gender=gender;
	}
	}

public class Demo2 {

	public static void main(String[] args) {
		
		ArrayList<Employee> emplist=new ArrayList<Employee>();
		emplist.add(new Employee("Amala",40000,"Female"));
		emplist.add(new Employee("Bala",55000,"Female"));
		emplist.add(new Employee("Chinna",60000,"male"));
		emplist.add(new Employee("Dilfi",70000,"Female"));
		
		//Function
		Function<Employee,Integer> f=emp->(emp.salary*10)/100;
		
		//Predicate
		Predicate<Integer> p=b->b>=5000;
		
		//Consumer
		Consumer<Employee> c=emp->{
		                           System.out.println(emp.ename+" "+emp.gender+" "+emp.salary);
		                           
		                           };
		                           
		for(Employee e:emplist) 
		{
			int bonus=f.apply(e); // Invoked Function default method
			if(p.test(bonus)) //Invoked Predicate default method
			{
				c.accept(e); //Invoked Consumer default method
				System.out.println(bonus);
			}
		}                           
	

	}

}
