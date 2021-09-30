/*WAP to calculate area of traingle ny using parametrized constructor
*/
class Traingle
{
	
	double base;
	double height;
	Traingle(double b,double h)//Parametrized constructor
	{
		base=b;
		height=h;
	}

	double area()
	{
		double result=0.5*base*height;
		System.out.println("Area of traingle"+result);
		return result;
	}


	public static void main(String[] args) 
	{
		Traingle t1=new Traingle(2,3);
		t1.area();
		
	}
}