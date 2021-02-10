package abstractclasses;

public class Bankingdemo {

	public static void main(String[] args) {
		
		//subclass type object cr
		Account sa1=new SavingsAccount();
		Account ca1=new CurrentAccount();
		
		//the subclass object to be created will be decided at runtime
		Account myaccount=Account.getAccount();
		
		sa1.depositAmount();

	}

}
