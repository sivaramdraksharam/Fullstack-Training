package javabasics;

import java.util.StringTokenizer;

public class Stringsplitting {

	public static void main(String[] args) {
		String s="Auto-generated method stub";
		/*String[] stringArray=s.split(" ");
		for(String string : stringArray)
		System.out.println(string);*/
		
		StringTokenizer st=new StringTokenizer(s);
	
		while(st.hasMoreElements())
		{
			System.out.println(st.nextToken());
		}

	}

}
