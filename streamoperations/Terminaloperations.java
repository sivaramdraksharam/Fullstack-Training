package streamoperations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.function.ToDoubleFunction;
import java.util.stream.Collectors;
class Expenditure
{
	 Double expense;
	String description;
	public Expenditure(Double expense, String description) {
		super();
		this.expense = expense;
		this.description = description;
	}
	
	
}
public class Terminaloperations {
	
// public static void main method
	public static void main(String args[] )
	{
	//create a list of friends- an array list of strings-generic type is String	
	List<String> friendsList=new ArrayList<String>();
	
	
	//add some friends names to the collection
	friendsList.add("Zaved");
	friendsList.add("Arun");
	friendsList.add("Rasheed");
	friendsList.add("Arun");
	friendsList.add("Puja");
	
	//Create Random class object to generate random integers
	Random randomRanking=new Random();
	
	//create a map 
	HashMap<String, Integer> mapofFriendsRanks =new HashMap<String,Integer>();
	
	//for each element in the collection, assign a rank randomly
	for(int i=0;i<friendsList.size();i++)
	{
		mapofFriendsRanks.put(friendsList.get(i),randomRanking.nextInt(10));
	}
	//print the map
	System.out.println(mapofFriendsRanks);
	
	//terminal operation 1- for each
	friendsList.stream().forEach(friendName->System.out.println(friendName));
	System.out.println("Friends list in natural order:");
	//terminal operation 2 - for each ordered
	friendsList.stream().forEachOrdered(System.out::println);
	
	//terminal operation 3 - toArray
	Object[] friendsArray=friendsList.stream().toArray();
	
	//FRIENDS NAMES IN BLOCK LETTERS
	System.out.println("Names in BLOCK LETTERS");
	for(Object friend :  friendsArray)
	{
		System.out.println(friend.toString().toUpperCase());
	}
	
	
	HashMap tourExpenses=new HashMap<String,Integer>();
	//add keys and values to the collection using put method
	for(int i=0; i<friendsArray.length;i++)
	tourExpenses.put(friendsArray[i], randomRanking.nextInt(2000));
	
	ArrayList<String> keyList = new ArrayList<String>(tourExpenses.keySet());
    ArrayList<Expenditure> expList = new ArrayList<Expenditure>();
    Expenditure exp1=new Expenditure(500.00,"From Vijayawada to Tirupati");
    Expenditure exp2=new Expenditure(6500.00,"TPT to kanipakam");
    expList.add(exp1);
    expList.add(exp2);
    
    Set friendsset=tourExpenses.entrySet();
    
    System.out.println("set of friends:"+friendsset);

    System.out.println("contents of the list holding keys the map ::"+keyList);
    System.out.println("contents of the list holding values of the map::"+expList);

    //terminal operation 4 - reduce
    System.out.println(expList.stream().reduce((sum, exp)->exp));
   //map the first element or any element- stream starts from the first element
   

	//perform stream of computations
   	double friendsallexp=expList.stream().collect(Collectors.summingDouble(exp->exp.expense)); 
   	System.out.printf("All expenses total in double:%5.2f",friendsallexp);
   	
   	//display minimum expense
 //   System.out.println("minimum expense:Rs."+expList.stream().min((expense1, expense2)-> expense2 < expense1 ? 1: -1).get());
   	
  //display maximum expense
  //  System.out.println("maximum expense:Rs."+expList.stream().max((expense1, expense2)-> expense1 > expense2 ? 1: -1).get());
   	
	

	}
	
	
	
	

}
