package filterdemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filterdemo3 {

	public static void main(String[] args) {
		
		List<String> words=Arrays.asList("Apple","Boys","Cat",null,"Dog",null,null);
		
		List<String> result=new ArrayList<String>();
		result =words.stream().filter(str->str!=null).collect(Collectors.toList());
		
		System.out.println(result);

	}

}
