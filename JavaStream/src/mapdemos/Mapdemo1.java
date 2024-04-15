package mapdemos;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Mapdemo1 {

	public static void main(String[] args) {


		List<String> vechicles=Arrays.asList("bus","car","train","flight","bicycle");
		
		List<String> results=vechicles.stream().map(v->v.toUpperCase()).collect(Collectors.toList());
        System.out.println(results);
        vechicles.stream().map(n->n.toUpperCase()).forEachOrdered(System.out::println);
	}

}
