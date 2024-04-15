package streamothermethods;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Demo5 {

	public static void main(String[] args) {
	
		List<Integer> l1=Arrays.asList(2,4,1,3,7,5,9);
		List<Integer> l2=l1.stream().sorted().collect(Collectors.toList());
		System.out.println(l2);
		
		List<Integer> rev=l1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(rev);
		
		List<String> names=Arrays.asList("smith","revathi","raj","kavin");
		List<String>n=names.stream().sorted().collect(Collectors.toList());
		System.out.println(n);
		
		List<String>nm =names.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(nm);

	}

}
