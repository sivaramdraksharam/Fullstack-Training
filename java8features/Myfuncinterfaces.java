package java8features;
import java.util.function.BiFunction;

/*
 * An Interface that contains exactly one abstract method is known as functional interface.
 *  It can have any number of default, static methods but can contain only one abstract method. 
 *  It can also declare methods of object class.

Functional Interface is also known as Single Abstract Method Interfaces or SAM Interfaces.

 */

public class Myfuncinterfaces {

	public static void main(String[] args) {
		// BiFunction to add 2 numbers 
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b; 
  
        // Implement add using apply() 
        System.out.println("Sum = " + add.apply(2, 3)); 
  
        // BiFunction to multiply 2 numbers 
        BiFunction<Integer, Integer, Integer> multiply = (a, b) -> a * b; 
  
        // Implement add using apply() 
        System.out.println("Product = " + multiply.apply(2, 3)); 
	}

}
