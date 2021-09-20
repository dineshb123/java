import java.util.Scanner;
class Ticket
{
	static int availableTickets=60;

	void bookTicket(int bookingCount)
	{
		if(bookingCount<=availableTickets)

		{
			availableTickets=availableTickets-bokkingCount;
			System.out.println(bookingCount+"Ticket Have avaible");
			else{
			System.out.println("Sorry Ticket is not avaible");
		}

	}
	void cancelTicket(int cancelCount)
	{
		availableTickets=availableTickets+cancleCount;
		System.out.println(cancleCount+"Ticket have Been cancled");
	}
	void showTickets()
	{
		System.out.println(availableTickets+"Availble tickets is");
	}


	}
}