class Method2
{
	public static void main(String args[])//Internal method
	{
		createAccount();//Call Extrenal method inside Interanal method
		createAccount();

	}
	static void createAccount()
	{
		System.out.println("Account created Successfully");
		createProfile();//class External method by External method
	}
	static void createProfile()
	{
		System.out.println("Profilr create Sucessfully");
	}
}