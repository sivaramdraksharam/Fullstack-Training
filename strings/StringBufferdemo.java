package strings;
class ShowcharsThread extends Thread
{ char chararray[];
//constructor
ShowcharsThread(char chararray[])
{
	this.chararray=chararray;
}
	public void run()
	{
		
			
		try {
			for(int i=0;i<chararray.length;i++)
			{
			if(Thread.currentThread().getName().equals("st1"))
			{
							System.out.print(chararray[i]+"*");
							Thread.currentThread().sleep(600);
			}
			else
			{
				System.out.println(chararray[i]+"*");
			Thread.currentThread().sleep(1000);
			}
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
public class StringBufferdemo {

	public static void main(String[] args) {
		// create StringBuffer object
		StringBuffer sb=new StringBuffer("Extravaganza");
		
		System.out.println(sb);
		sb.append(" means-complex to understand");
		char chararray[]=sb.toString().toCharArray();
		
		ShowcharsThread st1=new ShowcharsThread(chararray);
		char revarray[]=sb.reverse().toString().toCharArray();
		ShowcharsThread st2=new ShowcharsThread(revarray);
		st1.start();
		st2.start();
		
	}

}
