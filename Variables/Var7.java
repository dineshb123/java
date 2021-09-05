class Var7
{
	public static void main(String args[])
	{
		int m1=10,m2=20,m3=30;
		m1=m2;//m1=20
		m2=m1;//m2=20
		m3=m2;//m3=20
		
		System.out.println(m1+"\t"+m2+"\t"+m3);
		
		//System.out.println((m1+m4)+"\t"+(m2+m5)+"\t"+(m3+m6));
		int x=10,y=20,temp=0;
		temp=x;
		x=y;
		y=temp;
		System.out.println(x+"\t"+y);

		x=40;
		y=50;//Swapping Two number
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("X new value"+x+"\t"+"Y new valu"+y);

		x=60;
		y=70;//Swapping Two number
		x=x*y;
		y=x/y;
		x=x/y;
		System.out.println("x new  value"+x+"\t"+"Y new value"+y);
	}
}