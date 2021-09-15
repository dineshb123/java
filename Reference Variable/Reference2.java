class Reference2
{
	public static void main(String args[])
	{
		Product p1=new Product();
		p1.acceptDetails(201,"lapi");
		p1.acceptDetails(201,"Ac");
		p1.displayDetail();


		Product p2=new Product();
		p2.acceptDetails(203,"Mobille");
		p2.displayDetail();
		System.out.println(p1);
		System.out.println(p2);


	}
}
class Product
{
	int productId;
	String productName;
	void acceptDetails(int id,String name)
	{
		productId=id;
		productName=name;

	}
	void displayDetail()
	{		System.out.println("Product Id is"+productId);
			System.out.println("Product Id is"+productName);


	}
}