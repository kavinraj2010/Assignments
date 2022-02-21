package week3.day1;
//method overriding example

public class AxisBank extends BankInfo {
public void deposit() {
	System.out.println("Your Deposit Amount is:172060");
}
public void saving() {
	System.out.println("Your Deposit Amount is:172060");
}

public static void main(String[] args) {
	AxisBank val=new AxisBank();
	val.deposit();
	val.saving();
	val.fixed();
}
}
