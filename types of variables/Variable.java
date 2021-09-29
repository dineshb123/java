class VariableDemo //Types of variable
{
	static double d;//Class Variable
	boolean b;      //Instance variable

	void display()
	{
		int k=20;	//Local Variable
		System.out.println("K value is"+k);
	}
}

class Variable
{
	
	public static void main(String[] args)
    {
    	VariableDemo v1=new VariableDemo();
    	System.out.println("D value is"+VariableDemo.d);
    	System.out.println("B value is"+v1.b);
    	v1.display();
		
	}
}