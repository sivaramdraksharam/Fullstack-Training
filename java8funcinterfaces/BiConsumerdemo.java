package java8funcinterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerdemo {

	public static void main(String[] args) {
		// Create the first list 
        List<Integer> lista = new ArrayList<Integer>(); 
        lista.add(2); 
        lista.add(1); 
        lista.add(2); 
  
        // Create the second list 
        List<Integer> listb = new ArrayList<Integer>(); 
        listb.add(2); 
        listb.add(1); 
        listb.add(3); 
  
        // BiConsumer to compare both lists 
        BiConsumer<List<Integer>, List<Integer> > 
            equals = (list1, list2) -> 
        { 
            if (list1.size() != list2.size()) { 
                System.out.println("False"); 
            } 
            else { 
                for (int i = 0; i < list1.size(); i++) 
                    if (list1.get(i) != list2.get(i)) { 
                        System.out.println("False"); 
                        return; 
                    } 
                System.out.println("True"); 
            } 
        }; 
        equals.accept(lista, listb); 
    } 
} 
