package strings;
//String class objects reside in a pool of String objects in heap
//static import
import static java.lang.System.out;
public class Stringmethods {

	public static void main(String[] args) {
		//create String class object
		String companyName="Cognizant";
		System.out.println("companyName id:"+companyName.hashCode());
		companyName.concat("Technology solutions");
		System.out.println(companyName);
		System.out.println("after adding a string, companyName id:"+companyName.hashCode());
		System.out.println(companyName);
		
		companyName=companyName+" Technologies...";
		System.out.println("New String object:"+companyName);
		System.out.println("after adding a string, companyName id:"+companyName.hashCode());
		
		String greet="Hello";
		String greet1="Hello";
		System.out.println("greet and greet1 are same because java is dynamic, it observes the data to be stored..it already exists, will not create a new one");
		System.out.println(greet.hashCode()+"="+greet1.hashCode());
		greet1="Hai";
		
		System.out.println(greet1+" master");
		System.out.println("I am "+"angry".toUpperCase());
		
		System.out.println("also, I am "+"LAZY".toLowerCase());
		
		//StringBuilder class
		StringBuilder companyAdmin=new StringBuilder("Vice President");
		
	    System.out.println("Character of President starts at "+companyAdmin.indexOf("President"));
		
		
		out.println("Character at position 5 in string President is:"+companyAdmin.substring(5)+"is "+companyAdmin.substring(5).charAt(0));
		
		String wordsIncompanyAdmin[]=companyAdmin.toString().split(" ");
		
		//display each word 
		//enhanced for loop
		for(String word : wordsIncompanyAdmin)
		{
			char chararray[]=word.toCharArray();
			//display each character vertically
			for(char ch : chararray)
			System.out.println(ch);
			
		}
		
		out.println("The length of companyAdmin is"+companyAdmin.length());
		
		out.println("Last index is: "+companyAdmin.lastIndexOf("i"));
		out.println("Capacity is:"+companyAdmin.capacity());
		
		out.println("Hash code of companyAdmin:"+companyAdmin.hashCode());
		companyAdmin.append(" : Mr. Ajay Munjal");
		out.println("After adding a String, companyAdmin:"+companyAdmin);
		out.println(companyAdmin.hashCode()+" Hashcode is same as before as StringBuilder is used");
		
		//inserting a character in StringBuilder object - mutable object
		companyAdmin.insert(4, '*');
		
		System.out.println(companyAdmin);
	
		
	}

}
