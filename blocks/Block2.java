class Block2
{
	static int k=2;
	static int p=20;

	static
	{
		k=40;
		p=25;
		System.out.println(p+k);
	}

	static
	{
		k=30;
		System.out.println(k+p);
	}
	public static void main(String args[])
	{
		System.out.println("main method");
	}
}