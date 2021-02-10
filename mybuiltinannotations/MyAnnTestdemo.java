package mybuiltinannotations;

import java.lang.reflect.Method;

public class MyAnnTestdemo {

	public static void main(String[] args)throws Exception {
	
		MyAnnTest mat=new MyAnnTest();
		
		Method m=mat.getClass().getMethod("myTestMethod");
		
		MySampleAnn msa=m.getAnnotation(MySampleAnn.class);
		
		System.out.println("Name: "+msa.name());
		System.out.println("Description: "+msa.desc());
		
		mat.myTestMethod();
	}

}
