class Method8
{
	public static void main(String args[])
	{
		double area=areaOfCircle();
				System.out.println("Area of circle is"+area);


	}
	static double add(double a,double b)
	{
		double result;
		result=a*b;
		return result;
	}
	static double areaOfCircle()
	{
		double rad=add(5,2);
		double area;
		area=3.14*rad*rad;
		System.out.println("Area of circle is"+area);
		return area;
	}
}