package abstractclasses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class SavingsAccount extends Account{
	
	SavingsAccount(){
		super.setAccountType("Savings");
		
	}

	@Override
	public void depositAmount(){
		System.out.println("Enter account number:");
		//input stream
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		SavingsAccount sa=new SavingsAccount();
		try {
			sa.setAccountNo(br.readLine());
		
		System.out.println("Enter account Balance in Rs:");
		sa.setBalanceAmount(Float.parseFloat((br.readLine())));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void withDraw() {
		// TODO Auto-generated method stub
		
	}

}
