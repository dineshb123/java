class Block
{
	static int p=20;

	static 
	{
		System.out.println("Static block of class");
	}}

	class Block3
	{
		public static void main(String[] args) 
		{
			System.out.println("main Method");
			System.out.println("P value is"+Block.p);

		}
		static
		{
			System.out.println("Static Block of main class");
		}
	}