package flatmapdemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Flatmapdemo2 {

	public static void main(String[] args) {
	
		
		List<String>l1=Arrays.asList("Amala","David","Kamal");
		List<String>l2=Arrays.asList("mala","Daniel","Tom");
		List<String>l3=Arrays.asList("bala","Ken","Jerry");
		
		List<List<String>>Players=Arrays.asList(l1,l2,l3);
		
		//before java 8 without Stream
		
		/*for(List<String> team:Players) {
			for(String n:team) {
				System.out.println(n);
			}
		}*/
		
		//Using Streams flatMap()
		
		List<String> pnames=Players.stream().flatMap(p->p.stream()).collect(Collectors.toList());
		System.out.println(pnames);
		

	}

}
