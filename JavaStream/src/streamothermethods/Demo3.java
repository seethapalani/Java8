package streamothermethods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo3 {

	public static void main(String[] args) {
		
		List<String> stringlist =Arrays.asList("A","1","B","2","C","3");
		
		Optional<String>red=stringlist.stream().reduce((value, combinedvalue)->{
		                        return value+combinedvalue;	
		});
		System.out.println(red.get());
				

	}

}
