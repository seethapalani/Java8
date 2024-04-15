package filterdemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filterdemo2 {

	public static void main(String[] args) {
		List<String> names=Arrays.asList("Amala","Bala","Cindrella","Daniella","Elsa");
		
		List<String> longnames=new ArrayList<String>();
		longnames=names.stream().filter(str->str.length()>3 && str.length()<8).collect(Collectors.toList());
        System.out.println(longnames);
	}

}
