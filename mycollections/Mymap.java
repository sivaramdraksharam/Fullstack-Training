package mycollections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Mymap {

	public static void main(String[] args) {
		// THashmap implements Map
		
		Map<String,String> userlog=new HashMap<String,String>();
		
		
		userlog.put("Arun", "A002@222");
		userlog.put("Rasheed", "R3@333");
		userlog.put("Sivaram", "Siva@S231");
		
		String s1="Rasheed",s2="Rasheed";
		System.out.println("id for s1"+s1.hashCode()+"id for s2"+s2.hashCode());
		if(s1==s2)
		{
			System.out.println("references same");
		}else if(s1.equals(s2))
		{
			System.out.println("Both strings are same");
		}
		
		
		//conversion from Map to Set
		Set<Entry<String, String>> s=userlog.entrySet();
		
		System.out.println(s);
		
		//study: LinkedHashMap and ConcurrentHashMap
		//what is hashing, differences between arrays and collections in java
		//how to override equals() and hashCode() from java.lang.Object
		
		System.out.println(userlog);
		
		
		

	}

}
