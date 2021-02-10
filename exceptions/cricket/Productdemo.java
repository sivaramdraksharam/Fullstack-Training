package exceptions.cricket;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;

public class Productdemo {

	public static void main(String[] args) throws IOException{
		//create an array of products
		Product plist[]=new Product[3];
		
		char reply='y';
		byte counter=0;
		//input stream object
		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		 
		while(reply=='y') 
		{
			Product p=new Product();
			System.out.println("Enter Product ID:");
			p.setProductId(Integer.parseInt(br.readLine()));
		
			
			System.out.println("Enter Name:");
			p.setProductName(br.readLine());
			
			System.out.println("Enter price:");
			p.setProductPrice(Float.parseFloat(br.readLine()));
			plist[counter]=p;
			counter++;
			//System.out.println(plist[counter]);
			System.out.println("Wish to add more?(y/n)");
			reply=br.readLine().charAt(0);
			
		}
		
		System.out.println("Wish to save records in to file?(y/n)");
		reply=br.readLine().charAt(0);
		
		if(reply=='y')
		{
			//ouput operation
			File prodfile=new File("products.dat");
			
			//create outputstream object
			FileOutputStream fos=new FileOutputStream(prodfile);
			
			//create object output stream object
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			//writes an object into a flat file
			oos.writeObject(plist);
			
			System.out.println("products.dat file is created successfully");
			
			
			
		}
		
		//enhanced for loop
		for(Product p : plist)
		{
			System.out.println(p);
		}

	}

}
