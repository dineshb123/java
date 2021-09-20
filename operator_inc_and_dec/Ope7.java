class Ope7
{
	public static void main(String args[])
	{
		int a=3;
		int b=2;
		int c=4;
		c=b++ + a-- + b--;
		if(b++>2)

		{
			c++;
			a++;
		}
		else
		{
			a--;
		}
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

	}
}