class Member1
{
	public static void main(String args[])
	{
		System.out.println("P Value is"+new Demo().p);
		new Demo().display();

	}
}
class Demo
{
	int p=10;
	void display()
	{
		System.out.println("Display Method");
	}
}