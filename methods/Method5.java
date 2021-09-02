/*
Name-Dinesh
Program of calculate of area of Circle,Traingle,Square and Rectangle
*/
class Method5
{
	public static void main(String args[])
	{
		areaOfCircle(3);
		areaOfTraingle(2,3);
		areaOfSquare(4);
		areaOfRectangle(4,6);
	}

	static void areaOfCircle(double rad)//Method of to calculate Area of circle
	{
		float pi=3.14f;
		double area=0;
		area=pi*(rad*rad);
		System.out.println("Area of Circle is"+area);
	}

	static void areaOfTraingle(double height,double base)//Method of to calculate Area of Trainge
	{
		double area=0;
		area=0.5*height*base;
		System.out.println("Area of Traingle is"+area);
	}

	static void areaOfSquare(double side)//Method of to calculate Area of Square
	{
		double area;
		area=side*side;
		System.out.println("Area of Square is"+area);
	}

	static void areaOfRectangle(double length,double breath)//Method of to calculate Area of Rectangle
	{
		double area;
		area=length*breath;
		System.out.println("Area of Traingle is"+area);
	}

}