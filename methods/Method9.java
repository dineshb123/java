class Method9
{
	public static void main(String args[])
	{
		double total;
		total=gstBill();
		System.out.println("Gst Bill "+total);
	}
	static double productBill(int qty,double price)
	{
		double total;
		total=qty*price;
		return total;
	}
	static double gstBill()
	{
		double total;
		total=productBill(10,5);
		double gb;
		gb=(0.06*total)+total;
		return gb;
	}
}