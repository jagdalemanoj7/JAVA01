package jv19;

public class Airasia {
double ticketprice=15000.0;
double totalamount;

	void bookticket(int seat) 
	{
		System.out.println("-- Welcome To AirAsia --");
		System.out.println("Ticket Price is : "+ticketprice);
		System.out.println("Seat Request: "+seat);
		totalamount=ticketprice*seat;
		System.out.println("Total Amount : "+totalamount);
	
	}
}

class Makemytrip extends Airasia
{
	double discount=2000.0;
	//@override
	void bookticket(int seat)
	{
		System.out.println("-- WelCome to MekeMyTrip --");
		super.bookticket(seat);
		System.out.println("Discount Amount: "+discount);
		totalamount=totalamount-discount;
		System.out.println("After Discount: "+totalamount);
	
	}
}
