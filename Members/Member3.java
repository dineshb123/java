import java.util.Scanner;
class Elecricity
{
	static double re=4.40;
	static double com=5.40;
	void residential(int cu,int pu)
	{
		double result=cu-pu;
		double total=result*re;
		System.out.println("Residential Bill"+total);
	}
	void commertial(int cu,int pu)
	{
		double result,total;
		result=cu-pu;
		total=result*com;
		System.out.println("commertial Bill"+total);
	}
}

class Member3
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Current unit");
		int cu=sc.nextInt();
		System.out.println("Enter Privious unit");
		int pu=sc.nextInt();
		System.out.println("1.Recidential");

		System.out.println("2.Commertial");
		System.out.println("Enter ur choice");

		int ch=sc.nextInt();
		if(ch==1)
		{
			new Elecricity().residential(cu,pu);
					

		}
		else if(ch==2)
		{
			new Elecricity().commertial(cu,pu);

		}
		else
		{
			System.out.println("Invalied Choice");
		}



	}
	
}