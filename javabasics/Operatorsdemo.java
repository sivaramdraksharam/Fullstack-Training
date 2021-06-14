package operators;

import java.io.ByteArrayInputStream;

public class Operatorsdemo {

	public static void main(String[] args) {
		//storing ASCII value in byte varaible
		byte b='b';
		//assigning character constant to byte varaiable
		byte y='y';
		//
		byte t='t';
		byte e='E';
		
		//byte type Array
		byte byteArray[]=new byte[4];
		
		byteArray[0]=b;
		byteArray[1]=y;
		byteArray[2]=t;
		byteArray[3]=e;
		//display byteArray
		for(byte bvar : byteArray)
		System.out.println((char)bvar);
		
		ByteArrayInputStream bais=new ByteArrayInputStream(byteArray);
		
		int bvar=bais.read();
		
		System.out.println(""+bvar);
		
		
		

	}

}
