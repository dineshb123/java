import java.util.Scanner;
class Ticket
{
	static int availableTickets=60;

	void bookTicket(int bookingCount)
	{
		if(bookingCount<=availableTickets)

		{
			availableTickets=availableTickets-bookingCount;
			System.out.println(bookingCount+"Ticket Have avaible");
		}
			else
			{
				System.out.println("Sorry Ticket is not avaible");
			}

	}
	void cancleTicket(int cancleCount)
	{
		availableTickets=availableTickets+cancleCount;
		System.out.println(cancleCount+"Ticket have Been cancled");
	}
	void showTickets()
	{
		System.out.println("Availble tickets is"+availableTickets);
	}


	}


class Object1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Ticket t1=new Ticket();
		System.out.println("Select mode of operation");
		System.out.println("1:Book Ticket");
		System.out.println("2:cancelTicket");
		System.out.println("3:View Tickets");
		int choice=sc.nextInt();

		if(choice==1)
		{
			System.out.println("Enter no of tickets to Booked");
			int count1=sc.nextInt();
			t1.bookTicket(count1);
		}
			else if(choice==2)
		{
			System.out.println("Enter no of tickets to cancle");
			int count2=sc.nextInt();
			t1.cancleTicket(count2);
		}
		else if(choice==3)
		{
			t1.showTickets();
		}




	}
}