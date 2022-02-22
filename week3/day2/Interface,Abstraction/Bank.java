package week3.day2;

public class Bank extends SBI implements CIBIL,PNB {
	//SBI
	@Override
	public void bankBalance() {
		System.out.println("Your Bank Balance is: 47580");
	}
	
	//SBI
	@Override
	public void maximumLoanAmount() {
		System.out.println("Your maximum Balance is:180000");
	}
	
	//CIBIL
	public void cibilScore() {
		System.out.println("Your CIBIL Score is:8.7");
	}
	
	//PNB
	public void creditScore() {
		System.out.println("Your Credit Score is:7.9");
	}

	//PNB
	public void minimumBalance() {
		System.out.println("Your Minimum Balance is:14000");
	}
	
	//main Method
	public static void main(String[] args) {
		//using single object
		Bank get=new Bank();
		get.bankBalance();
		get.cibilScore();
		get.creditScore();
		get.ITLoan();
		get.maximumLoanAmount();
		get.minimumBalance();
	}	
}

	//If creating a multiple object 
		/*SBI get=new Bank();
			get.ITLoan();
			get.maximumLoanAmount();
			get.bankBalance();
			
		PNB get1=new Bank();
			get1.creditScore();
			get1.maximumLoanAmount();
			get1.minimumBalance();
			
		CIBIL get2=new Bank();
			get2.cibilScore();
		*/
