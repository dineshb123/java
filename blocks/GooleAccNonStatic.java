class GooleAccount
{
	static int count=0;

	{
		System.out.println("Account created Successfully");		//Non static block
		createProfile();
		count++;
	}

	void createProfile()
	{
		System.out.println("Profile create Successfully");
	}
}

class GooleAccNonStatic
{
	public static void main(String args[])
	{
		GooleAccount  g1=new GooleAccount();
		GooleAccount g2=new GooleAccount();
		GooleAccount g3=new GooleAccount();
		GooleAccount g4=new GooleAccount();

		System.out.println("Total Number of Accounts"+GooleAccount.count);
	}
}