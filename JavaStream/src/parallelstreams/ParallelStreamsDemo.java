package parallelstreams;

import java.util.Arrays;
import java.util.List;

class Student{
	String name;
	int Score;
	
	Student(String name,int Score){
		this.name=name;
		this.Score=Score;
	}
	
	public String getName() {
		return this.name;
	}
	public int getScore() {
		return this.Score;
	}
}

public class ParallelStreamsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student> s=Arrays.asList(new Student("Bala",100),
		new Student("Amala",80),
		new Student("Fala",75),
		new Student("Mala",100),
		new Student("Paru",90)
		);
		//Using Stream Sequential method
		s.stream().filter(ss->ss.getScore()>=80).limit(3).forEach(stu->System.out.println(stu.getName()+" "+stu.getScore()));

		//Using Parallel Stream
		s.parallelStream().filter(ss->ss.getScore()>=80).limit(3).forEach(stu->System.out.println(stu.getName()+" "+stu.getScore()));
	
	    //Convert sequential to Parallel stream()
		s.stream().parallel().filter(ss->ss.getScore()>=80).limit(3).forEach(stu->System.out.println(stu.getName()+" "+stu.getScore()));
	}

}
