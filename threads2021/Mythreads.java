package threads2021;

//creating thread by extending java.lang.Thread class
class Mythread extends Thread
{
	//constructor
	public Mythread()
	{
		setName("Mythread");
	}
	@Override
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
	}
}
//creating thread class by implementing java.lang.Runnable interface
class Myruannablethread implements Runnable
{
	
	Myruannablethread()
	{
		Thread.currentThread().setName("Myrunnablethread");
	}
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		
	}
	
}
public class Mythreads {
	
	public static void main(String ... args ) {
		//creating thread by extending Thread class
		Mythread mt1=new Mythread();
		//System.out.println("current thread is:"+mt1.toString());
		mt1.start();
		Myruannablethread mt2=new Myruannablethread();
		//System.out.println("current thread is:"+mt2.toString());
		mt2.run();
		
		
	}

}
