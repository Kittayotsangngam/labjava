import java.util.Scanner;

public class lab501 {

	public static void main(String[] args) {
	
		Account account = new Account(1122, 20000);

		account.setAnnualInterestRate(4.5);

		Scanner in = new Scanner(System.in);

		System.out.println("\n          Account Statement");
		System.out.println("------------------------------------------");
		System.out.println("Account ID: " + account.getId());
		System.out.println("Date created: " + account.getDateCreated());
		System.out.printf("Balance: $%.2f\n", account.getBalance());
		System.out.printf("Monthly interest: $%.2f\n", account.getMonthlyInterest());
		int mode = Integer.MIN_VALUE;   
		while(mode!=0 && mode!=1)
		{
			System.out.printf("Select Mode \n");
			System.out.printf("0 For Deposit \n");
			System.out.printf("1 For Withdraw \n");
			mode = in.nextInt();
		}
		System.out.printf("Enter your Money: ");
		int inputmoney  = in.nextInt();
		if(mode ==0)
		{
			account.deposit(inputmoney);
		}
		else if(mode==1)
		{
		    if(account.getBalance()>=inputmoney)
			{
			account.withdraw(inputmoney);
			}
			else
			{
				System.out.println("Can't Withdraw");
			}
	    }
		System.out.println("\n          Account Statement");
		System.out.println("------------------------------------------");
		System.out.println("Account ID: " + account.getId());
		System.out.println("Date created: " + account.getDateCreated());
		System.out.printf("Balance: $%.2f\n", account.getBalance());
		System.out.printf("Monthly interest: $%.2f\n", account.getMonthlyInterest());
		
			in.close();
	}
}