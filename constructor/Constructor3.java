/*this keyword-this key word is the special keyword which hold an address of an object.
	
	We can use this keyword to diffrentiate Local Variable and Instance variable if they are having same identifier
	this key word is applicable only for Non-static context
*/
class Demo
{
	int k;
	double d;

	Demo(int k,double d)
	{
	this.k=k;
	this.d=d;
	}
	void display()
	{
		System.out.println("K value is"+k);
		System.out.println("D value is"+d);
		System.out.println(this);
	}
}

class Constructor3
{
	public static void main(String args[])
	{
		Demo d1=new Demo(25,60.67);
		d1.display();

		Demo d2=new Demo(30,70.89);
		d2.display();
		System.out.println(d1);
		System.out.println(d2);


	}
}
/*
C:\Users\Admin\Desktop\java\constructor>java Constructor3
K value is25
D value is60.67
Demo@72ea2f77 //this keyword address nothing but object adress d1
K value is30
D value is70.89
Demo@33c7353a//adress od d2
Demo@72ea2f77
Demo@33c7353a
*/