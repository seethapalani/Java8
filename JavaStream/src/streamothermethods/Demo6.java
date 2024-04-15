package streamothermethods;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Demo6 {

	public static void main(String[] args) {
		
		Set<String> fruits= new HashSet<String>();
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Pear");
		fruits.add("Orange");
		fruits.add("Guavas");
		
		boolean result=fruits.stream().anyMatch(f->f.startsWith("A"));
		System.out.println(result);
		
		boolean r= fruits.stream().allMatch(f->f.contains("Guavas"));
		System.out.println(r);
		
		boolean rs=fruits.stream().noneMatch(f->{return f.contains("B");});
		System.out.println(rs);

	}

}
