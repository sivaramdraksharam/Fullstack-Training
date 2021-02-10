package java8features;

import java.util.Calendar;

@FunctionalInterface
interface Anounce
{
	void broadCast();
}
@FunctionalInterface
interface BookingCounter
{
	Ticket getTicket(String ticketClass);
}
class Ticket
{
	Ticket(String ticketClass){
		System.out.println(ticketClass);
	}
}
public class Mymethodrefs {
	//define static method
	public static void greetMembers()
	{
		System.out.println("Welcome to the session");
	}
	//define non-static method
	public void introduction()
	{
		System.out.println("Today's objectives...");
	}
	//define psvm
	public static void main(String[] args) {
		
		
		//1.reference to a static method
		Anounce greeting=Mymethodrefs::greetMembers;
		
		greeting.broadCast();
		
		//2.reference to a non-static method
		
		//create instance of the class
		Mymethodrefs instance=new Mymethodrefs();
		
		Anounce introduce=instance::introduction;
		
		introduce.broadCast();
		
		//3.reference to constructor
		BookingCounter counter=Ticket::new;
		
		counter.getTicket("First class");
		

		
	}

}
