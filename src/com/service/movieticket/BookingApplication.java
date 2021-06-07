package com.service.movieticket;

public class BookingApplication {
	public static void main(String[] args) {
		TicketsFactory factory = new TicketsFactory();
		System.out.println("Ticket Factory : " +factory.getAllTickets());
		System.out.println("Ticket Factory size : " +factory.ticketStack.size());
		BookTicket bookTicket = new BookTicket();
		Ticket ticket = bookTicket.book();
		System.out.println("Added Ticket : "+ ticket);
		System.out.println("Ticket Factory size : " +factory.ticketStack.size());
		System.out.println("Ticket Factory after adding ticket : " +factory.getAllTickets());
	}

}
