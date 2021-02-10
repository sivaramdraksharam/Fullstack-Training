package streamoperations;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Set;
import java.util.Map;
import java.text.DecimalFormat;

public class JavaStreamExample {
	public static void main(String[] args) {  
        List<Product> productsList = new ArrayList<Product>();  
        //Adding Products  
        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",28000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f));  
        
    
        // This is more compact approach for filtering data  
   productsList.stream().filter(product -> product.getPrice()== 30000)
   .forEach(product -> System.out.println(product.getName()));    
     // This is more compact approach for filtering data  
        Float totalPrice = productsList.stream()  
                    .map(product->product.getPrice())  
                    .reduce(0.0f,(sum, price)->sum+price);   // accumulating price  
        System.out.println("We can purchase all laptops for Rs."+totalPrice);
        
        // More precise code   
        float totalPrice2 = productsList.stream()  
                .map(product->product.getPrice())  
                .reduce(0.0f,Float::sum);   // accumulating price, by referring method of Float class  
        System.out.println("Sum using method reference:Rs."+totalPrice2);  
        
     // Using Collectors's method to sum the prices.  
        double totalPrice3 = productsList.stream()  
                        .collect(Collectors.summingDouble(product->product.getPrice()));  
        System.out.println("sum using Collectors static method summingDouble is:"+totalPrice3);  
        
        // max() method to get max Product price   
        Product productA = productsList.stream()  
                        .max((product1, product2)->   
                        product1.getPrice() > product2.getPrice() ? 1: -1).get();  
          DecimalFormat df=new DecimalFormat("##.00");
        System.out.println(productA.getName()+"Rs."+df.format(productA.getPrice()));  
        // min() method to get min Product price  
        Product productB = productsList.stream()  
                .max((product1, product2)->   
                product1.getPrice() < product2.getPrice() ? 1: -1).get();  
        System.out.println(productB.getPrice());  
        
     // count number of products based on the filter  
        long count = productsList.stream()  
                    .filter(product->product.getPrice()<30000)  
                    .count();  
        System.out.println(count);  
        
     // Converting product List into Set  
        Set<Float> productPriceList = productsList.stream().filter(product->
        product.getPrice() < 30000)   // filter product on the base of price  
            .map(product->product.getPrice())  
            .collect(Collectors.toSet());   // collect it as Set(remove duplicate elements)  
        System.out.println(productPriceList);  
        
     // Converting Product List into a Map  
        Map<Integer,String> productPriceMap = productsList.stream()
        		.collect(Collectors.toMap(p->p.getId(), p->p.getName()));  
              
        System.out.println(productPriceMap);
        
       List<Float> productPriceList2 = productsList.stream().filter(p -> p.getPrice() > 30000) // filtering data  
                            .map(Product::getPrice)         // fetching price by referring getPrice method  
                            .collect(Collectors.toList());  // collecting as list  
        System.out.println(productPriceList2);  
        
        

	}  
	

}
