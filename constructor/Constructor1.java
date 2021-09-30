class Product 
{
	int productId;
	String ProductName;
		
	Product(int id,String name)//User Defined Constructor
	{
		productId=id;
		ProductName=name;
	}

	void display()
	{
		System.out.println("Product Id is"+productId);
		System.out.println("Product Name is"+ProductName);
	}

}

class Constructor1
{
	public static void main(String[] args) 
	{
		Product p1=new Product(101,"Tv");
		p1.display();

		Product p2=new Product(102,"Phone");
		p2.display();
		
	}
	
}


/*C:\Users\Admin\Desktop\java\constructor>java Constructor1
Product Id is101
Product Name isTv
Product Id is102
Product Name isPhone

C:\Users\Admin\Desktop\java\constructor>javap Constructor1
Compiled from "Constructor1.java"
class Constructor1 {
  Constructor1();
  public static void main(java.lang.String[]);
  */