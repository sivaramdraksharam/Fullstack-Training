package java8features;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

@FunctionalInterface
interface Numeric
{
	public abstract  void show();
}
@FunctionalInterface
interface Add
{
	public abstract float add(float x, float y);
}
@FunctionalInterface
interface Nickname
{
	public abstract String setNickname(String nickName);
}

public class Mylambdas{
	
	public static void main(String args[])
	{
		//Lambda without parameters
		 Numeric lucky=()->{ System.out.println("Number can be an integer or real");};
		 
		 System.out.println(lucky);
		 //Lambda with single parameter
		 Nickname mynickname=(a)->(a);
		 
		 System.out.println(mynickname.setNickname("Laddu"));
		 
		 //Lambda with two parameters
		 Add sum=(a,b)->(a+b);
		 
		 System.out.println(sum.add(5,2));
		 
		 //Lambda with datatype spec - here return keyword can be removed
		 Add sumfloats=(float x, float y)->{ return (x+y);};
		 System.out.println(sum.add(5.2f, 3.7f));
		 
		 //Using lambda with a collection
		 List<String> list=new ArrayList<String>();  
	        list.add("anupam");  
	        list.add("meghana");  
	        list.add("irfan");  
	        list.add("jai");  
	          
	        //sorting collection
	        
	        //extrenal iterator
	     /*   Iterator<String> itr=list.iterator();
	        
	        while(itr.hasNext())
	        {
	        	System.out.println(itr.next());
	        }*/
	          
	        //internal iteraror
	        list.forEach((n)->System.out.println(n));  
	    
		 
		 
	}

}
