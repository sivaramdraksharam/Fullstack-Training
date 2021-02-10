package exceptions.cricket;

public class Divdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5,b=2;
		
		String name="Sivaram";
		
		int c;
		try{
		c=a/b;
		System.out.println("Result:"+c);
		}catch(ArithmeticException ae)
		{
			System.out.println("Division by zero not allowed!");
		}
		try{
		name=null;
		System.out.println("length of name:"+name.length());
		}catch(NullPointerException ne)
		{
			System.out.println("name should not be empty!");
		}

	}

}
