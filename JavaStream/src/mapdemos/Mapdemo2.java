package mapdemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Mapdemo2 {

	public static void main(String[] args) {
		
		
		List<Integer> numberList=Arrays.asList(3,4,5,6,7,8,9);
		
		List<Integer> result=new ArrayList();
		
		/*for(int n:numberList)
		{
			result.add(n*3);
			
		}
		System.out.println(result);*/
		
		result=numberList.stream().map(num->num*3).collect(Collectors.toList());
		System.out.println(result);
		
		

	}

}
