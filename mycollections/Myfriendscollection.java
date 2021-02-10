package mycollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;
import java.util.Set;
import java.util.Vector;
import java.util.stream.Collectors;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;


public class Myfriendscollection {

	public static void main(String[] args) {
		//create a collection to add friends' names
		List<String> friends=new ArrayList<String>();
		
		Random r=new Random();
		
		float randomNumber=r.nextFloat();
		System.out.println("Random number:"+randomNumber);
		float price=56.00f;
		
		DecimalFormat df=new DecimalFormat("##.00");
	
		System.out.println("Price"+df.format(price));
		
		
		Date today=new Date();
		
		LocalDate ld=LocalDate.now();
		
		LocalDateTime ldt=ld.atTime(1,50,9);
		
		System.out.println("today is"+ldt);
		
		//add elements to collection
		friends.add("Rasheed");
		friends.add("Arun kumar");
		friends.add("Raja sekhar");
		friends.add("Rasheed");
		//Vector class has synchronized methods and this class implements List interface
		Vector<Customer> customerList=new Vector<Customer>();
		
		Set<String> products=new HashSet<String>();
		
		//fifo list
		Queue<Integer> intQ =new PriorityQueue();
		
		//study Dequeue
		
		
		intQ.add(34);
		intQ.add(1);
		intQ.add(88);
		intQ.add(55);
		
		System.out.println("Queue:"+intQ);
		intQ.remove();
		System.out.println("After removal, Queue:"+intQ);
		intQ.remove();
		System.out.println("After removal, Queue:"+intQ);
		intQ.add(99);
		System.out.println("After adding,Q:"+intQ);
		
		
		//set will not allow duplicates
		products.add("Gemini");
		products.add("Lipton");
		products.add("Gemini");
		products.add("Three roses");
		
		System.out.println(products);
		
		Customer c1=new Customer();
		//set properties or attributes
		c1.setCustomerID(11);
		c1.setCustomerName("Javed corner");
		c1.setCustomerPhone("+918636547891");
		
		Customer c2=new Customer();
		//set properties or attributes
		c2.setCustomerID(11);
		c2.setCustomerName("Javed corner");
		c2.setCustomerPhone("+918636547891");
		
		//add customer objects to collection
		customerList.addElement(c1);
		
		customerList.addElement(c2);
		
		if(c1.compareTo(c2)==1)
		{
			System.out.println("Both customer data is same");
		}else
		{
			System.out.println("Not same");
		}
		
		//create Iterator to dispaly list of friends
		System.out.println("List of friends");
		//external iterator
		Iterator<String> itr=friends.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	
		System.out.println("Customer list");
		//internal iterator
		
		customerList.forEach((c)->System.out.println(c));
		System.out.println("Friends list");
		
		System.out.println(customerList.stream().filter((c)-> c.getCustomerID()>2).collect(Collectors.toList()));
		
		System.out.println(customerList);
		//use Collections class and its static method sort()
		Collections.sort(friends);
		friends.forEach((f)->System.out.println(f));
	}
	
	

}
