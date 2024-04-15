package predicates;

import java.util.function.Predicate;

//Joining Predicates - and ,or, negate
//P1 --checks number is even
//P2 -- checks greater than 50

public class Demo3 {

	public static void main(String[] args) {
		
		
		int a[]= {5,15,20,25,30,35,40,45};
		
		Predicate<Integer> p1= i->(i%2==0);
		Predicate<Integer> p2 = i->(i>40);
		
//			for(int n:a) 
//			{
//				if(p1.and(p2).test(n)) 
//				{
//				  System.out.println(n);
//			     }
//			
//			}	
		for(int n:a) 
		{
			if(p1.or(p2).test(n)) 
			{
			  System.out.println(n);
		     }
		
		}	
		

	}

}
