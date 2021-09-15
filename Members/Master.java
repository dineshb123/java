class Master
{
	static int k=20;
	static void test()
	{
		System.out.println("Test Method");
	} 
}
class MainApp
{
	public static void main(String args[])
	{
		System.out.println("K value is"+Master.k);
		Master.test();
	}
}