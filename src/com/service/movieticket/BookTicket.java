package com.service.movieticket;

public class BookTicket {
	TicketsFactory factory = new TicketsFactory();
	TicketUtil ticketUtil = new TicketUtil();

	public Ticket book() {
		Ticket ticket;
		boolean isBooked = ticketUtil.isBookedBeforeFourHour();
		if (isBooked) {
			ticket = new Ticket();
			ticket.setTicketPriceStrategy(new DiscountedPrice());
			ticket.setPrice(ticket.getTicketPriceStrategy().calculate());
		} else {
			ticket = new Ticket(new FixedPrice());
		}
		factory.addTicket(ticket);
		return ticket;
	}

}
