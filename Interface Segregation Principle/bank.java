import java.lang.*;
import java.util.*;

interface Account_Section{
	
	public void accountOpen();
	
}
interface Loan_Section{

	public void getloan();

	
}

class Account implements Account_Section{
	public void accountOpen() {
		System.out.println("Account opened sucessfully ");
	}
	
	
	
}
class Loan implements Loan_Section{
	public void getloan() {
		System.out.println("Loan get  sucessfully ");
	}
	
	
	
}
public class InterfaceSegregationPrinciple {

	Loan l;
	Account a;
	
	public void openAccount() {
		a.accountOpen();
	}
	
	public void loan() {
		l.getloan();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InterfaceSegregationPrinciple i=new InterfaceSegregationPrinciple();
		i.openAccount();
		i.loan();
		// rest methods of account object is not of use for account class 
		
	}

}
