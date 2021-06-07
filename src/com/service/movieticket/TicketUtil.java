package com.service.movieticket;

public class TicketUtil {
	TicketsFactory factory = new TicketsFactory();

	public boolean isBookedBeforeFourHour() {
		return factory.checkLastTicket();

	}
}
