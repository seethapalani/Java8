package streamothermethods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo8 {

	public static void main(String[] args) {
		List<String> animalsList=Arrays.asList("Cat","Dog","Elephant");
		List<String> birdsList=Arrays.asList("Parrot","Crow","Peacock","Owl");
		
		Stream<String> s1=animalsList.stream();
		Stream<String> s2=birdsList.stream();
		
		List<String> s3=Stream.concat(s1, s2).collect(Collectors.toList());
		
		for(String s:s3) {
			System.out.println(s);
		}

	}

}
