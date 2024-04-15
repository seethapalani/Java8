package consumers;

import java.util.function.Consumer;

public class ConsumerChaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<String> c1=s->System.out.println(s+" "+"is White");
		
		Consumer<String> c2=s->System.out.println(s+" "+"has four Legs");
		
		Consumer<String> c3=s->System.out.println(s+" "+"is eating grass");
		
		c1.andThen(c2).andThen(c3).accept("Cow");
		

	}

}
