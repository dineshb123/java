class Method4
{

	public static void main(String args[])
	{

		minToSec(1);
		secToMin(300);
	}
	static void minToSec(double m)
	{
		double result;
		result=m*60;
		System.out.println("Min To Second=\t"+result);

	}
	static void secToMin(double s)
	{
		double result=0;
		result=s/60;
		System.out.println("Sec To min =\t"+result);
	}
}