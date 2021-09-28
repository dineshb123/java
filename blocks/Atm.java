import java.util.Scanner;
class Atm
{
	static double accountBalance=5000;
	static int pin=0;
	 static Scanner sc1=new Scanner(System.in);
	static
	{
		System.out.println("Please select language");
		System.out.println("1.English");
		System.out.println("2.Hindi");
		System.out.println("3.Marathi");

		int language=sc1.nextInt();
		if(language==1)
		{
			System.out.println("Thanks for selcting english language");
		}
		else if(language==2)
		{
			System.out.println("Hindi ke liye shukriya");
		}
		else if(language==3)
		{
					System.out.println("Marathi Bhasha Niwadlyabaddal Sathi Dhanywad");

		}
		else
		{
			System.exit(0);//Stop the flow of program acc to user
		}
	}

	static
	{
		System.out.println("Enter pin no");
		pin=sc1.nextInt();
	}

	public static void main(String args[])
	{
		if(pin==4567)
		{
			System.out.println("Select mod of operation");
			System.out.println("1:Withdrwa");
			System.out.println("2:Check Balance");

			int choice=sc1.nextInt();
			if(choice==1)
			{
				System.out.println("Enter amount");
				double amt=sc1.nextInt();
				withdraw(amt);
			}
			else if(choice==2)
			{
				checkBalance();
			}
			else
			{
				System.out.println("Invalid Choice");
			}
		}
		else
		{
			System.out.println("Invalid pin");
		}
	}

	static void withdraw(double amt)
	{
		if(amt<=accountBalance)
		{
			accountBalance-=amt;
			System.out.println(amt+"Rs Debited from your account");
		}
		else
		{
			System.out.println("Insufficient Balance");
		}
	}
	static void checkBalance()
	{
		System.out.println("Accounr Balance is"+accountBalance);
	}


}


	
