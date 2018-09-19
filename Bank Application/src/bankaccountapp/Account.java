package bankaccountapp;

public abstract class Account implements IBaseRate {
	//List common properties for savings and checking account
	private String name;
	private String SSN;
	private double balance;
	protected String accountnumber;
	protected double rate;
	private static int index = 10000;
	
	//Constructor to set base properties and initialize the account
	public Account(String name, String SSN, double initdeposit) {
		this.name = name;
		this.SSN = SSN;
		balance = initdeposit;
		//System.out.println("NAME: " + name + " SSN: " + SSN + " BALANCE: $" + balance);
		
		//Set account number
		index++;
		this.accountnumber = setaccountnumber();
		
		setrate();
	}
	
	public abstract void setrate();
	
	private String setaccountnumber() {
		String lasttwoSSN = SSN.substring(SSN.length() - 2, SSN.length());
		int uniqueid = index;
		int randomnumber = (int) (Math.random() * Math.pow(10, 3));
		return lasttwoSSN + uniqueid + randomnumber;
	}
	
	public void compund() {
		double totalinterest = balance * (rate/100);
		balance = balance + totalinterest;
		System.out.println("Total Interest: $" + totalinterest);
		printbalance();
	}
	
	//List common methods such as deposit, withdraw, transfer and show info
	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("Depositing: $" + amount);
		printbalance();
	}
	
	public void withdraw(double amount) {
		balance = balance - amount;
		System.out.println("Withdrawing: $" + amount);
		printbalance();
	}
	
	public void transfer(String location, double amount) {
		balance = balance - amount;
		System.out.println("Transfering: $" + amount + " to " + location);
		printbalance();
	}
	
	public void printbalance() {
		System.out.println("Your balance is now $" + balance);
	}
	
	public void showinfo() {
		System.out.println("NAME: " + name + 
				"\nACCOUNT NUMBER: " + accountnumber + 
				"\nBALANCE: " + balance + 
				"\nRATE: " + rate + "%");
	}
	
}
