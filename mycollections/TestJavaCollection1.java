package mycollections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

class TestJavaCollection1{  
public static void main(String args[]) throws IOException{  
	
	ArrayList hetero=new ArrayList();
	hetero.add(122);
	hetero.add("Gemini");
	hetero.add(523.20f);
	
	//heomogenious collection
ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
list.add("Ravi");//Adding object in arraylist  
list.add("Vijay");  
list.add("Ravi");  
list.add("Ajay");  

BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
char reply='y';
while(reply=='y')
{
System.out.println("Enter your name");
String name=br.readLine();
list.add(name);
System.out.println("Wish to add more?(y/n)");
reply=br.readLine().charAt(0);
}
//Traversing list through Iterator 
Iterator itr=list.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next()+" Cohort");  

}

//enhanced for loop 
for(Object o : hetero)
{
	System.out.println(o);
}

}  
}  