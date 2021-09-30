class Master
{
	
	/*
		//Default Constructor

		Master()
		{
	
		}

	*/
		void test()
		{
			System.out.println("Test Method");
		}

}


class Constructor
{
	public static void main(String[] args) {
		Master m1=new Master();
		m1.test();
	}
}

/*
Output

C:\Users\Admin\Desktop\java\constructor>javap Constructor //Here javap classname command used to describe java structure
Compiled from "Constructor.java"
class Constructor {
  Constructor();
  public static void main(java.lang.String[]);
}
*/