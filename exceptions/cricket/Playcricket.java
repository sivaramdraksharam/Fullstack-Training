 package exceptions.cricket;
 //exception handling demo
class Bowler
{
	public void bowl() {
		System.out.println("Bowling..but no ball");
	}
	public void bowl(String ball)
	{
		System.out.println("Bowling.."+ball);
	}
}
class Batsman
{	public String msg;
	boolean moodIsGood;
	public void hitTheBall() throws Missedball {
		
		if(moodIsGood)
		{
			System.out.println("hitting...6");
			msg="hitting";
		}else
		{
			System.out.println("missing...");
			msg="missing";
			throw new Missedball();
		}
		
	}
}
class Missedball extends Exception
{
	Missedball(){
		System.out.println("missed ball");
	}
}

public class Playcricket {

	public static void main(String[] args){
		
		Batsman bm=new Batsman();
		//bm.moodIsGood=true;
		Bowler bowler=new Bowler();

		try
		{
		bowler.bowl("cork ball");
		bm.hitTheBall();
		}catch(Missedball m) {
			System.out.println("caught by keeper");
		}finally {
			System.out.println("able to find the ball");
		}

	}

}
