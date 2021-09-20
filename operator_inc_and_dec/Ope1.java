class Ope1
{
	public static void main(String args[])
	{
		int x=2;
		int y=3;
		y=++x+x+++--x;
		if(--x<5)
		{
			y++;
			x++;
		}
		System.out.println(x);
		System.out.println(y);
	}
}