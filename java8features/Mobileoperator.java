package java8features;


public interface Mobileoperator {
	
	public abstract void showOperator();
	public abstract void support4G();
	public default void support5G() {
		System.out.println("yet to be supported!");
	}
	public static void operatorGuidelines()
	{
		System.out.println("rule1: the customer should have adhar id");
	}

	
	

}
