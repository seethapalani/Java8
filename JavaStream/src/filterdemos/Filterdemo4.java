package filterdemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Product
{
	int id;
	String name;
	double price;
	
	public Product(int id,String name,double price) {
		
		this.id=id;
		this.name=name;
		this.price=price;
		
	}



}
public class Filterdemo4 {

	public static void main(String[] args) {
		
		List<Product> productList=new ArrayList<Product>();
		productList.add(new Product(1,"Apple",80000));
		productList.add(new Product(2,"HP",30000));
		productList.add(new Product(3,"Lenova",40000));
		productList.add(new Product(4,"Sony",40000));
		productList.add(new Product(5,"Dell",50000));
		
		productList.stream().filter(p->p.price>35000).forEach(pr->System.out.println(pr.price));
		
		
		

	}

}
