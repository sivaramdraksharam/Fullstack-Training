package abstractclasses;

import java.util.Scanner;
//create abstract class 
public abstract class Account {
	public static  Account a;
	private String accountNo;
	private String accountType;
	private float balanceAmount;
	
	public abstract void depositAmount();
	public  abstract  void withDraw();
	
	//static method that returns Account type
	public static Account getAccount()
	{
		
		System.out.println("Type 1.Savigns \n2.Current\n choose 1 or 2:");
		Scanner sc=new Scanner(System.in);
		int reply=sc.nextInt();
		if(reply==1)
		{
				a=new SavingsAccount();
		}
		else if(reply==2)
		{
			a=new CurrentAccount();
		}
		return a;
			
	}
	
	
	public void showAccount()
	{
		System.out.println("Account No:"+accountNo);
		System.out.println("Balance in Rs."+balanceAmount);
		
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public float getBalanceAmount() {
		return balanceAmount;
	}
	public void setBalanceAmount(float balanceAmount) {
		this.balanceAmount = balanceAmount;
	}
	
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", balanceAmount=" + balanceAmount + "]";
	}
	
	

}
