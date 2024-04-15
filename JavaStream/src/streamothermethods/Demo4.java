package streamothermethods;

import java.util.Arrays;
import java.util.List;

public class Demo4 {

	public static void main(String[] args) {
		List<String> stringlist=Arrays.asList("A","B","C","1","2","3");
		Object arr[]=stringlist.stream().toArray();
		//System.out.println(arr.length);

	}

}
