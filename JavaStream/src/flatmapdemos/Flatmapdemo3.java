package flatmapdemos;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student{
	int id;
	String name;
	char grade;
	
	Student(int id,String name,char grade){
		this.id=id;
		this.name=name;
		this.grade=grade;
	}

	
}

public class Flatmapdemo3 {

	public static void main(String[] args) {
		
		List<Student> studentList1=Arrays.asList(new Student(101,"Ben",'A'),
				                                 new Student(102,"Zen",'A'),
				                                 new Student(101,"Cen",'B'),
				                                 new Student(101,"Den",'C')
				
			                                 	);
		List<Student> studentList2=Arrays.asList(new Student(201,"Bell",'A'),
                                                 new Student(202,"Zell",'A'),
                                                 new Student(203,"Cell",'B'),
                                                 new Student(204,"Dell",'C')

                                                 );
	List<List<Student>> st=Arrays.asList(studentList1,studentList2);
	List<String> nameList=st.stream().flatMap(sn->sn.stream()).map(s->s.name).collect(Collectors.toList());
	System.out.println(nameList);

	}

}
