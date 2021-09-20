class Ope6
{
	public static void main(String args[])
	{
		int x=2;
		int y=4;
		y=++x + x + ++y + x++ + x--;
		System.out.println(x);//3	
		System.out.println(y);//18

	} 
}