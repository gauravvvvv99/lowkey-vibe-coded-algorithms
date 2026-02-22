abstract class ATM
{
	static String name="Gaurav";
	public abstract void withdrawSavings(double amount);
	public abstract void withdrawCurrent(double amount);
	public abstract double checkSavingsBalance();
	public abstract double checkCurrentBalance();
	public abstract void depositSavings(double amount);
}
class HDFC extends ATM
{
	// ATM a=null;
	 private double savings_balance=43000d;
	 private double current_balance=20000d;
	//  public double getSavingsBalance()
	// {
	// 	return savings_balance;
	// }
	// public double getCurrentBalance()
	// {
	// 	return current_balance;
	// }
	@Override
	public double checkSavingsBalance()
	{
		return savings_balance;
	}
	@Override
	public double checkCurrentBalance()
	{
		return current_balance;
	}
	@Override
	public void withdrawSavings(double amount)
	{
		java.util.Scanner sc=new java.util.Scanner(System.in);
		// ATM a=null;
		if(amount<savings_balance)
		{
			savings_balance=savings_balance-amount;
			System.out.println("You have successfully withdrawl "+amount);
			System.out.println("Do you want to display your Updated Balance[Y/N]");
						char c101=sc.next().charAt(0);
						switch(c101)
						{
						case 'Y':
							// a=new HDFC();
							System.out.println("Your balance is "+savings_balance);
							break;
						case 'N':
							System.out.println("taking back you to main menu");
						}
		}
		else 
			System.out.println("You don't have sufficient amount to withraw");
	}
	@Override
	public void withdrawCurrent(double amount)
	{
		java.util.Scanner sc=new java.util.Scanner(System.in);
		// ATM a=null;
		if(amount<current_balance)
		{
			current_balance=current_balance-amount;
			System.out.println("You have successfully withdrawl "+amount);
			System.out.println("Do you want to display your Updated Balance[Y/N]");
						char c10=sc.next().charAt(0);
						switch(c10)
						{
						case 'Y':
							// a=new HDFC();
							System.out.println("Your balance is "+current_balance);
							break;
						case 'N':
							System.out.println("taking you back to main menu");
						}
		}
		else 
			System.out.println("You don't have sufficient amount to withraw");
	}
	@Override
	public void depositSavings(double amount)
	{
		savings_balance=amount+savings_balance;
		System.out.println("You have successfully deposited "+amount);
	}
}
class ICICI extends ATM
{
	private static double savings_balance=60000;
	private static double current_balance=30000;
	public double getSavingsBalance(double a)
	{
		return savings_balance;

	}
	public double getCurrentBalance(double a)
	{
		return current_balance;
	}
	@Override
	public void withdrawSavings(double amount)
	{
		java.util.Scanner sc=new java.util.Scanner(System.in);
		ATM a=null;
		if(amount<savings_balance)
		{
			savings_balance=savings_balance-amount;
			System.out.println("You have successfully withdrawl "+amount);
			System.out.println("Do you want to display your Updated Balance[Y/N]");
						char c101=sc.next().charAt(0);
						switch(c101)
						{
						case 'Y':
							a=new ICICI();
							System.out.println("Your balance is "+a.checkSavingsBalance());
							break;
						case 'N':
							System.out.println("taking back you to main menu");
						}
		}
		else 
			System.out.println("You don't have sufficient amount to withraw");
	}
	@Override
	public void withdrawCurrent(double amount)
	{
		java.util.Scanner sc=new java.util.Scanner(System.in);
		ATM a=null;
		if(amount<current_balance)
		{
			current_balance=current_balance-amount;
			System.out.println("You have successfully withdrawl "+amount);
			System.out.println("Do you want to display your Updated Balance[Y/N]");
						char c101=sc.next().charAt(0);
						switch(c101)
						{
						case 'Y':
							a=new ICICI();
							System.out.println("Your balance is "+a.checkCurrentBalance());
							break;
						case 'N':
							System.out.println("taking back you to main menu");
						}
		}
		else 
			System.out.println("You don't have sufficient amount to withraw");
	}

	@Override
	public double checkSavingsBalance()
	{
		return savings_balance;
	}
	@Override
	public double checkCurrentBalance()
	{
		return current_balance;
	}
	@Override
	public void depositSavings(double amount)
	{
		savings_balance=amount+savings_balance;
		System.out.println("You have successfully deposited "+amount);
	}
}
class SBI extends ATM
{
	private static double savings_balance=100000;
	private static double current_balance=69000;

	public double getSavingsBalance(double a)
	{
		return savings_balance;

	}
	public double getCurrentBalance(double a)
	{
		return current_balance;

	}
	@Override
	public double checkSavingsBalance()
	{
		return savings_balance;
	}
	@Override
	public double checkCurrentBalance()
	{
		return current_balance;
	}
	@Override
	public void withdrawSavings(double amount)
	{
		java.util.Scanner sc=new java.util.Scanner(System.in);
		ATM a=null;
		if(amount<savings_balance)
		{
			savings_balance=savings_balance-amount;
			System.out.println("You have successfully withdrawl "+amount);
			System.out.println("Do you want to display your Updated Balance[Y/N]");
						char c101=sc.next().charAt(0);
						switch(c101)
						{
						case 'Y':
							a=new SBI();
							System.out.println("Your balance is "+a.checkSavingsBalance());
							break;
						case 'N':
							System.out.println("taking back you to main menu");
						}
		}
		else 
			System.out.println("You don't have sufficient amount to withraw");
	}
	@Override
	public void withdrawCurrent(double amount)
	{
		java.util.Scanner sc=new java.util.Scanner(System.in);
		ATM a=null;
		if(amount<current_balance)
		{
			current_balance=current_balance-amount;
			System.out.println("You have successfully withdrawl "+amount);
			System.out.println("Do you want to display your Updated Balance[Y/N]");
						char c101=sc.next().charAt(0);
						switch(c101)
						{
						case 'Y':
							a=new SBI();
							System.out.println("Your balance is "+a.checkCurrentBalance());
							break;
						case 'N':
							System.out.println("taking back you to main menu");
						}
		}
		else 
			System.out.println("You don't have sufficient amount to withraw");
	}
	@Override
	public void depositSavings(double amount)
	{
		savings_balance=amount+savings_balance;
		System.out.println("You have successfully deposited "+amount);
	}
}
class ATMMain
{
	public static void main(String[] args)
 {
 	ATM a=null;
	java.util.Scanner sc=new java.util.Scanner(System.in);
	int y=1;
	a=new HDFC();
	while(y==1)
	{
	System.out.println("================");
	System.out.println(a.name+",Welcome to ATM Bank Serivce.");
	System.out.println("1.HDFC");
	System.out.println("2.ICICI");
	System.out.println("3.SBI");
	System.out.println("4.Exit");
	System.out.println("Please select your option.");
	int choice=sc.nextInt();
	switch(choice)
	{
	case 1:
			System.out.println("===============");
		System.out.println("Welcome to HDFC ATM application");
		int i=1;
		// a=new HDFC();
		while(i==1)
		{
		System.out.println("================");
		System.out.println("1.Withdraw");
		System.out.println("2.Check Balance");
		System.out.println("3.Deposit");
		System.out.println("4.Exit");
		System.out.println("Select your option");
		int choice1=sc.nextInt();
		switch(choice1)
		{
		case 1:
			System.out.println("Enter your 4-digit pin");
			int pin=sc.nextInt();
			int count=0;
			int pin0=pin;
			while(pin!=0)
			{
				count++;
				pin=pin/10;
			}
			if(count==4)
			{
				if(pin0==1234)
				{
					System.out.println("1.Savings");
					System.out.println("2.Current");
					int ch=sc.nextInt();
					switch(ch)
					{
					case 1:
						System.out.println("Enter the amount to withdraw");
						double amount=sc.nextDouble();
						// a=new HDFC();
						a.withdrawSavings(amount);
						break;
					case 2:
						System.out.println("Enter the amount to withdraw");
						double amount_c=sc.nextInt();
						// a=new HDFC();
						a.withdrawCurrent(amount_c);
					}
			}
			else 
				System.out.println("UH-OH!,Invalid Pin");
			}
			else 
				System.out.println("UH-OH!,Invalid Pin");
			break;
		case 2:
			// a=new HDFC();
			System.out.println("1.Savings");
			System.out.println("2.Current");
			int cho=sc.nextInt();
			switch(cho)
			{
			case 1:
			System.out.println("Enter your 4-digit pin");
			int pin_check=sc.nextInt();
			int counta0=0;
			int pin_num0=pin_check;
			while(pin_check!=0)
			{
				counta0++;
				pin_check=pin_check/10;
			}
			if(counta0==4)
			{
				if(pin_num0==1234)
			System.out.println("Your balance is "+a.checkSavingsBalance());
		else 
		System.out.println("UH-OH!,Invalid Pin");
	}
		else 
			System.out.println("UH-OH!,Invalid Pin");
			break;
		case 2:
			System.out.println("Enter your 4-digit pin");
			int pin_check1=sc.nextInt();
			int counta1=0;
			int pin_num01=pin_check1;
			while(pin_check1!=0)
			{
				counta1 ++;
				pin_check1=pin_check1/10;
			}
			if(counta1==4)
				{
				if(pin_num01==1234)
			System.out.println("Your balance is "+a.checkCurrentBalance());
		else 
			System.out.println("UH-OH!,Invalid Pin");
	}
		else 
			System.out.println("UH-OH!,Invalid Pin");
		}
		break;
		case 3:
			System.out.println("Enter your account number");
			long account=sc.nextLong();
			int count1=0;
			long account0=account;
			while(account!=0)
			{
				count1++;
				account=account/10;
			}
			if(count1==12)
			{
				if(account0==123456789012l)
				{
				System.out.println("Enter your 4-digit pin");
				int pin1=sc.nextInt();
				int count2=0;
				int pin2=pin1;
				while(pin1!=0)
				{
					count2++;
					pin1=pin1/10;
				}
				if(count2==4)
				{
					if(pin2==1234)
				{
					System.out.println("Enter the amount to deposit");
					double deposit=sc.nextDouble();
					if(deposit>=100 && deposit<=1000000)
					{
					// a=new HDFC();
					a.depositSavings(deposit);
					System.out.println("your updated balance is: "+a.checkSavingsBalance());
				}
				else 
					System.out.println("invalid input received.");
			}
			else 
				System.out.println("UH-OH!,Invalid Pin");
			}
			else 
				System.out.println("UH-OH!,Invalid Pin");
		}
		else 
			System.out.println("account number not matched");
		
		}
		else 
			System.out.println("Invalid Account Number");
		break;
	case 4:
		i=0;
		System.out.println("taking you back to the main menu.");
		}
	}
		break;
		case 2:
			
			System.out.println("===============");
		System.out.println("Welcome to ICICI ATM application");
		int j=1;
		a=new ICICI();
		while(j==1)
		{
			System.out.println("==============");
		System.out.println("1.Withdraw");
		System.out.println("2.Check Balance");
		System.out.println("3.Deposit");
		System.out.println("4.Exit");
		System.out.println("Select your option");
		int choice2=sc.nextInt();
		switch(choice2)
		{
		case 1:
			System.out.println("Enter your 4-digit pin");
			int pin_num=sc.nextInt();
			int count4=0;
			int pin4=pin_num;
			while(pin_num!=0)
			{
				count4++;
				pin_num=pin_num/10;
			}
			if(count4==4)
			{
				if(pin4==1234)
				{
					System.out.println("1.Savings");
					System.out.println("2.Current");
					int ch=sc.nextInt();
					switch(ch)
					{
					case 1:
						System.out.println("Enter the amount to withdraw");
						double amount_w=sc.nextDouble();
						// a=new ICICI();
						a.withdrawSavings(amount_w);
						break;
					case 2:
						System.out.println("Enter the amount to withdraw");
						double amount_d=sc.nextInt();
						// a=new ICICI();
						a.withdrawCurrent(amount_d);
					}
			}
			else 
				System.out.println("UH-OH!,Invalid Pin");
			}
			else 
				System.out.println("UH-OH!,Invalid Pin");
			break;
		case 2:
			// a=new ICICI();
			System.out.println("1.Savings");
			System.out.println("2.Current");
			int cho=sc.nextInt();
			switch(cho)
			{
			case 1:
			System.out.println("Enter your 4-digit pin");
			int pin_check12=sc.nextInt();
			int counta9=0;
			int pin_num01=pin_check12;
			while(pin_check12!=0)
			{
				counta9++;
				pin_check12=pin_check12/10;
			}
			if(counta9==4)
			{
				if(pin_num01==1234)
			System.out.println("Your balance is "+a.checkSavingsBalance());
		else 
		System.out.println("UH-OH!,Invalid Pin");
	}
		else 
			System.out.println("UH-OH!,Invalid Pin");
			break;
		case 2:
			System.out.println("Enter your 4-digit pin");
			int pin_check13=sc.nextInt();
			int counta16=0;
			int pin_num013=pin_check13;
			while(pin_check13!=0)
			{
				counta16 ++;
				pin_check13=pin_check13/10;
			}
			if(counta16==4)
				{
				if(pin_num013==1234)
			System.out.println("Your balance is "+a.checkCurrentBalance());
		else 
			System.out.println("UH-OH!,Invalid Pin");
	}
		else 
			System.out.println("UH-OH!,Invalid Pin");
		}
		break;
		case 3:
			System.out.println("Enter your account number");
			long account_num=sc.nextLong();
			int count5=0;
			long account8=account_num;
			while(account_num!=0)
			{
				count5++;
				account_num=account_num/10;
			}
			if(count5==12)
			{
				if(account8==123456789012l)
				{
				System.out.println("Enter your 4-digit pin");
				int pin7=sc.nextInt();
				int count6=0;
				int pin_num1=pin7;
				while(pin7!=0)
				{
					count6++;
					pin7=pin7/10;
				}
				if(count6==4)
				{
					if(pin_num1==1234)
				{
					System.out.println("Enter the amount to deposit");
					double deposit1=sc.nextDouble();
					if(deposit1>=100 && deposit1<=1000000)
					{
					// a=new ICICI();
					a.depositSavings(deposit1);
					System.out.println("your updated balance is: "+a.checkSavingsBalance());
				}
				else 
					System.out.println("UH-OH!,invalid input received");
			}
			else 
				System.out.println("UH-OH!,Invalid Pin");
			}
			else 
				System.out.println("UH-OH!,Invalid Pin");
		}
		else 
			System.out.println("account number not matched");
		
		}
		else 
			System.out.println("invalid account number");
		break;
	case 4:
		j=0;
		System.out.println("taking you back to main menu.");
		}
	}
	break;
case 3:
		System.out.println("Welcome to SBI ATM application");
		int q=1;
		a=new SBI();
		while(q==1)
		{
			System.out.println("===============");
		System.out.println("1.Withdraw");
		System.out.println("2.Check Balance");
		System.out.println("3.Deposit");
		System.out.println("4.Exit");
		System.out.println("Select your option");
		int choice_a=sc.nextInt();
		switch(choice_a)
		{
		case 1:
			System.out.println("Enter your 4-digit pin");
			int pin_num1=sc.nextInt();
			int count_10=0;
			int pin_1=pin_num1;
			while(pin_num1!=0)
			{
				count_10++;
				pin_num1=pin_num1/10;
			}
			if(count_10==4)
			{
				if(pin_1==1234)
				{
					System.out.println("1.Savings");
					System.out.println("2.Current");
					int ch=sc.nextInt();
					switch(ch)
					{
					case 1:
						System.out.println("Enter the amount to withdraw");
						double amount_w1=sc.nextDouble();
						// a=new SBI();
						a.withdrawSavings(amount_w1);
						break;
					case 2:
						System.out.println("Enter the amount to withdraw");
						double amount_d1=sc.nextInt();
						// a=new SBI();
						a.withdrawCurrent(amount_d1);
					}
			}
			else 
				System.out.println("UH-OH!,Invalid Pin");
			}
			else 
				System.out.println("UH-OH!,Invalid Pin");
			break;
		case 2:
			// a=new SBI();
			System.out.println("1.Savings");
			System.out.println("2.Current");
			int cho=sc.nextInt();
			switch(cho)
			{
			case 1:
			System.out.println("Enter your 4-digit pin");
			int pin_check12=sc.nextInt();
			int counta9=0;
			int pin_num01=pin_check12;
			while(pin_check12!=0)
			{
				counta9++;
				pin_check12=pin_check12/10;
			}
			if(counta9==4)
			{
				if(pin_num01==1234)
			System.out.println("Your balance is "+a.checkSavingsBalance());
		else 
		System.out.println("UH-OH!,Invalid Pin");
	}
		else 
			System.out.println("UH-OH!,Invalid Pin");
			break;
		case 2:
			System.out.println("Enter your 4-digit pin");
			int pin_check13=sc.nextInt();
			int counta16=0;
			int pin_num013=pin_check13;
			while(pin_check13!=0)
			{
				counta16 ++;
				pin_check13=pin_check13/10;
			}
			if(counta16==4)
				{
				if(pin_num013==1234)
			System.out.println("Your balance is "+a.checkCurrentBalance());
		else 
			System.out.println("UH-OH!,Invalid Pin");
	}
		else 
			System.out.println("UH-OH!,Invalid Pin");
		}
		break;	
		case 3:
			System.out.println("Enter your account number");
			long account_num2=sc.nextLong();
			int count_11=0;
			long account9=account_num2;
			while(account_num2!=0)
			{
				count_11++;
				account_num2=account_num2/10;
			}
			if(count_11==12)
			{
				if(account9==123456789012l)
				{
				System.out.println("Enter your 4-digit pin");
				int pin_num0=sc.nextInt();
				int count_99=0;
				int pin_num66=pin_num0;
				while(pin_num0!=0)
				{
					count_99++;
					pin_num0=pin_num0/10;
				}
				if(count_99==4)
				{
					if(pin_num66==1234)
				{
					System.out.println("Enter the amount to deposit");
					double deposit9=sc.nextDouble();
					if(deposit9>=100 && deposit9<=1000000)
					{
					// a=new SBI();
					a.depositSavings(deposit9);
					System.out.println("your updated balance is: "+a.checkSavingsBalance());
				}
				else 
					System.out.println("invalid input received.");
			}
			else 
				System.out.println("UH-OH!,Invalid Pin");
			}
			else 
				System.out.println("UH-OH!,Invalid Pin");
		}
		else 
			System.out.println("account number not matched");
		
		}
		else 
			System.out.println("invalid account number");
		break;
	case 4:
		q=0;
		System.out.println("taking you back to main menu.");
		}
	}
	break;
case 4:
	y=0;
	System.out.println("thank you!");
}
	}
	}
}