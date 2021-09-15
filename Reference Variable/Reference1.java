class Demo
{
	int k=10;
	void test()
	{
		System.out.println("Test Method");
	}
}
class Reference1
{
	public static void main(String args[])
	{
		Demo d1=new Demo();
		System.out.println("K value is"+d1.k);
		d1.test();
		Demo d2=new Demo();
		System.out.println("K value is"+d2.k);
		d2.test();
		System.out.println(d1);
		System.out.println(d2);
}
}