package bankaccountapp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {
		
		//Checking chkacc1 = new Checking("Tom Wilson", "321456879", 1500);
		//Savings savacc1 = new Savings("Rich Love", "456657897", 2500);
		//savacc1.showinfo();
		//chkacc1.showinfo();
		
		//Read a CSV file then create new accounts based on that data
		
		List<Account> accounts = new LinkedList<Account>();
		String file = "/Users/Ameer/Documents/Bank Application/NewBankAccounts.csv";
		List<String[]> newcustomers = utilities.CSV.read(file);
		
		for (String[] customers : newcustomers) {
			//System.out.println("\nNEW ACCOUNT:\n");
			String name = customers[0];
			String SSN = customers[1];
			String accounttype = customers[2];
			double initdeposit = Double.parseDouble(customers[3]);
			//System.out.println(name + " " + SSN + " " + accounttype + " $" + initdeposit);
			
			//System.out.println("NAME: " + customers[0]);
			//System.out.println("SOCIAL SECURITY NUMBER: " + customers[1]);
			//System.out.println("ACCOUNT TYPE: " + customers[2]);
			//System.out.println("INITIAL DEPOSIT: " + customers[3]);
			
			if (accounttype.equals("Savings")) {
				//System.out.println("OPEN A SAVINGS ACCOUNT");
				accounts.add(new Savings(name, SSN, initdeposit));
			} else if (accounttype.equals("Checking")) {
				//System.out.println("OPEN A CHECKING ACCOUNT");
				accounts.add(new Checking(name, SSN, initdeposit));
			} else {
				System.out.println("ERROR READING ACCOUNT TYPE");
			}	
		}
		
		for (Account account : accounts) {
			System.out.println("\n***************");
			account.showinfo();
			//accounts.get((int) Math.random() * accounts.size()).deposit(10000);
			//accounts.get((int) Math.random() * accounts.size()).withdraw(5000);
		}
	}
	
}
