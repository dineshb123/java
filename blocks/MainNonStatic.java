class MainNonStatic
{
	
	{
		System.out.println("Non static Block of MainNonStatic ");//Non static block
	}

	
	static
	{
		System.out.println("Static Block");
	}

	public static void main(String args[])
	{
		System.out.println("Main Method");
		MainNonStatic m1=new MainNonStatic();
		MainNonStatic m2=new MainNonStatic();


	}
}