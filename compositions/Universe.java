package compositions;
//inner classes demo
import compositions.Universe.World.Asia.India.Mycity.Person.History;

public class Universe {
	private long stars;
	private int planets;
	//static nested class
	static class World{
		public static void main(String args[])
		{
			//calling a static method via inner static classes.
			Asia.India.Mycity.showCity();
			//create object for universe
			Universe u1=new Universe();
			u1.stars=1234567894554L;
			u1.planets=9;
		}
		//static nested class
		static class Asia{
			//static nested class
			static class India{
				//static nested class
				static class Mycity
				{
					String city="Hyderabad";
					//static nested class
					static class Person{
						private String personName;
						private String profession;
						@Override
						public String toString() {
							return "Person [personName=" + personName + ", profession=" + profession + "]";
						}
						
						class History{
											
						}
						
					}
					
					public static void showCity() {
						
						Person p1=new Person();
						Person p2=new Person();
						p1.personName="Ramesh";
						p1.profession="Doctor";
						p2.personName="Ankur";
						p2.profession="Engineer";
						System.out.println(p1);
						System.out.println(p2);
						
						
						//local inner class
						class Monument{
							private String monumentName;
							private History monumentHistory;
						}
						
						Monument m1=new Monument();
						m1.monumentName="Charminar";
						//create anonymous Mycity object to initialize the city name
						System.out.println(new Mycity().city+" has "+m1.monumentName);
					}
				}
		 }
		}
	}
	
	//member inner class to Universe
	class Milkyway{
		
		class Blackhole{
			
		}
	}

}
