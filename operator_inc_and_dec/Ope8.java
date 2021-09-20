class Ope8
{
	public static void main(String args[])
	{
		int x=4;
		int y=3;
		if(x++ <5)
		{
			if(y++ >3)
			{
			x++;
			}
		
			else
			{
				x--;
			}
		}
	System.out.println(x);//4
	System.out.println(y);//4
	}

}