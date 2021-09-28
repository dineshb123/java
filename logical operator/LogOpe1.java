class LogOpe1
{
	public static void main(String args[])
	{
		int a=10;
		int b=25;
		int c=55;
		System.out.println(a>b && c<b);//false
		System.out.println(c>a || b<c);//true 
		System.out.println((a>b || b<c)&& c>b);//true
		System.out.println(!(a<b));//false
		System.out.println(!(a<b && b<c));//false
	}
}