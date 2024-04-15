package filterdemos;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filterdemo1 {

	public static void main(String[] args) {
		
		/*ArrayList<Integer> numberlist=new ArrayList<Integer>();
		
		numberlist.add(10);
		numberlist.add(15);
		numberlist.add(20);
		numberlist.add(16);
		numberlist.add(18);*/
		
		List<Integer> numberlist= Arrays.asList(10,15,20,25,30,35);
		
		List<Integer> evenNumbersList = new ArrayList<Integer>();
		
		//without Using Streams
		
	/*	for(int n:numberlist) {
			if(n%2==0) {
				
				 evenNumbersList.add(n);
				
                  }
           System.out.println(evenNumbersList);
	}*/
		//After filtering storing in another collection
		/*evenNumbersList=numberlist.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println(evenNumbersList);*/
		
		
		//not storing in another collection or array, just printing
		numberlist.stream().filter(n->n%2==0).forEach(s->System.out.println(s));
		
		//here out is a static variable so can access directly and printed
		numberlist.stream().filter(n->n%2==0).forEach(System.out::println);
		
		
	}
}	
