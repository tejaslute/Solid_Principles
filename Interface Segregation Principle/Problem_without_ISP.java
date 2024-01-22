import java.lang.*;
import java.util.*;

interface Bank{
	public void withdrawMoney();
	public void checkbalance();
	public void getloan();
	public void accountOpen();
	
}

class Account implements Bank{
	public void accountOpen() {
		System.out.println("Account opened sucessfully ");
	}
	
	// unnecessary we have to override the checkbalance(), getloan() ,etc .
	
	public void withdrawMoney() {
		
	}
public void checkbalance() {
		
	}
public void getloan() {
	
}
}
public class InterfaceSegregationPrinciple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account a= new Account();
		a.accountOpen();
		// rest methods of account object is not of use for account class 
		
	}

}
