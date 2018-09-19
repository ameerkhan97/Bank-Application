package bankaccountapp;

public class Checking extends Account {
	//List properties specific to a checking account
	private int debitcardnumber;
	private int debitcardpin;
	
	//Constructor to initialize the checking account properties
	public Checking(String name, String SSN, double initdeposit) {
		super(name, SSN, initdeposit);
		accountnumber = "2" + accountnumber;
		//System.out.println("ACCOUNT NUMBER: " + this.accountnumber);
		//System.out.println("NEW CHECKING ACCOUNT");
		setdebitcard();
	}
	
	@Override
	public void setrate() {
		//System.out.println("Implement rate for Checking");
		rate = getbaserate() * .15;
	}
	
	//List any methods specific to the checking account
	private void setdebitcard() {
		debitcardnumber = (int) (Math.random() * Math.pow(10, 12));
		debitcardpin = (int) (Math.random() * Math.pow(10, 4));
		//System.out.println("CARD: " + this.debitcardnumber);
		//System.out.println("PIN: " + this.debitcardpin);
	}

	public void showinfo() {
		super.showinfo();
		System.out.println("Your Checking Account Features" + 
				"\n Debit Card Number: " + debitcardnumber + 
				"\n Debit Card Pin: " + debitcardpin);
		//System.out.println("ACCOUNT TYPE: Checking");
	}
}
