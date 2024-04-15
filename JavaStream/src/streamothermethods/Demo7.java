package streamothermethods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       List<String>L1=Arrays.asList("one","two","three","four","five");
       Optional<String>element=L1.stream().findAny();
       System.out.println(element.get());
       
       Optional<String>elements=L1.stream().findFirst();
       System.out.println(elements.get());
       
          
       
       
		
		
	}

}
