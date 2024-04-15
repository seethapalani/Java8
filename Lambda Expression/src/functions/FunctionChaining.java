package functions;

import java.util.function.Function;

/*Function Chaining 
 * 
 * andThen()
 * compose()//reverse process 
 * */
public class FunctionChaining {

	public static void main(String[] args) {
		
		Function<Integer,Integer> f1=n->n*2;
		
		Function<Integer,Integer> f2=n->n*n*n;
		
		System.out.println(f1.andThen(f2).apply(2));//2*2 -4 then f2 4*4*4 //64
		
		System.out.println(f1.compose(f2).apply(2));//2*2*2 - 8 compose f1 8*8 //16
		

	}

}
