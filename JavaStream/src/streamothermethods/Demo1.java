package streamothermethods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//distinct() //limit()
//count
public class Demo1 {

	public static void main(String[] args) {
		
		
		List<String> vehicle=Arrays.asList("bus","bike","Train","bike","Car","Train");
		//distinct()
		vehicle.stream().distinct().collect(Collectors.toList()).forEach(v->System.out.println(v));
		
		
		//count()
		long c=vehicle.stream().distinct().count();
		System.out.println(c);
		
		
		//limit()
		vehicle.stream().limit(3).collect(Collectors.toList()).forEach(s->System.out.println(s));
		

	}

}
