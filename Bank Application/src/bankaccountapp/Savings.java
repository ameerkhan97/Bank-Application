package bankaccountapp;

public class Savings extends Account {
	//List properties specific to the savings account
	private int safetydepositid;
	private int safetydepositkey;
	
	//Constructor to initialize the settings for the savings properties
	public Savings(String name, String SSN, double initdeposit) {
		super(name, SSN, initdeposit);
		accountnumber = "1" + accountnumber;
		//System.out.println("ACCOUNT NUMBER: " + this.accountnumber);
		//System.out.println("NEW SAVINGS ACCOUNT");
		setsafetydepositbox();
	}
	
	@Override
	public void setrate() {
		//System.out.println("Implement rate for Savings");
		rate = getbaserate() - .25;
	}
	
	//List any methods specific to the savings account
	private void setsafetydepositbox() {
		safetydepositid = (int) (Math.random() * Math.pow(10, 3));
		//System.out.println(safetydepositid);
		safetydepositkey = (int) (Math.random() * Math.pow(10, 4));
	}
	
	public void showinfo() {
		super.showinfo();
		System.out.println("Your Savings Account Features" + 
				"\n Safety Deposit Box ID: " + safetydepositid + 
				"\n Safety Deposit Box Key: " + safetydepositkey);
		//System.out.println("ACCOUNT TYPE: Savings");
	}
}
