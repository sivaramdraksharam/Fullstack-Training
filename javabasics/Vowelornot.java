package javabasics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Vowelornot {

	public static void main(String[] args) throws IOException {
		// create input stream object to accept input
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		char character;
		System.out.println("Enter a character");
		character=br.readLine().toLowerCase().charAt(0);
		//increases readability
	switch(character)
		{
		case 'a' : System.out.println("It's Vowel");break;
		
		case 'e' : System.out.println("It's Vowel");break;
		case 'i' : System.out.println("It's Vowel");break;
		case 'o' : System.out.println("It's Vowel");break;
		case 'u' : System.out.println("It's Vowel");break;
		
		default  : System.out.println("Not a vowel!!!");
		
				
		}
		/*if(character=='a' || character=='e' ||  character=='i' || character=='o' || character=='u'  )
		{
				System.out.println("It's vowel");
		}else
		{
			System.out.println("Not a vowel!!!");
		}*/
		

	}

}
