package predicates;

import java.util.function.Predicate;

public class Demo1 {

	public static void main(String[] args) {
		
		Predicate<Integer> p=i->(i>10);
		System.out.println(p.test(20));
		
		Predicate<String> pr=s->(s.length()>4);
		System.out.println(pr.test("you"));
		
		String names[]= {"Amala","bala","carly","daniel","em"};
		
		for(String s:names) {
			if(pr.test(s))
			{
				System.out.println(s);
			}
		}

	}

}
