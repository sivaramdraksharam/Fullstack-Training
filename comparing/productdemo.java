package comparing;

import java.util.ArrayList;
import java.util.Collections;
public class productdemo {

	public static void main(String[] args) {
		

		Product<String> p1=new Product();
		//create a product that accepts string
		Product<String> p2=new Product();
		//create a product that accepts life insurance products
		Product<Jeevansuvidha>licproduct=new Product<Jeevansuvidha>();
		
		
		ArrayList<Product> list=new ArrayList<Product>();
		
		Collections.sort(list,new SerialComparator());
		
		p1.setProduct("Lenovo");
		p2.setProduct("Lenovo");
		
		if(p1.compareTo(p2)==1)
		{
			System.out.println("Both products are same");
		}else
		{
			System.out.println("Products are not same");
		}
		
		System.out.println(p1.getProduct());
	}

}
