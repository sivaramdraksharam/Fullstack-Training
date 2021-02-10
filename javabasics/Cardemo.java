package javabasics;
@FunctionalInterface
 interface ShowCar
{
	public void show();
}
@FunctionalInterface
interface SpecificCar
{
	//declare abstract method
	public void show(Object c);
}

public class Cardemo {

	//method definition
	public static void main(String[] args) {
		// create car
		Car mycar=new Car();
		
		Car yourcar=new Car("Xing","AP20Z1234","Santro");
		
		Car somecar=new Car("Zen","AP20Z1994","Maruti",Fuel.DEISEL);
		
		Car.showCardetails(yourcar);
		Car.showCardetails(mycar);
		//define lambda without params
		ShowCar sc=()->{System.out.println(yourcar);};
		//call method
		sc.show();
		
		//define lambda with single param
		SpecificCar sc1=(car)->{System.out.println(car);};
		//pass single argument
		sc1.show(somecar);
		//calling method
		Car.showCardetails(yourcar);
		
		
		
		
	}

}
