package com.service.movieticket;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Stack;

public class TicketsFactory {
	Stack<Ticket> ticketStack = new Stack<>();

	public TicketsFactory() {
		Ticket ticket1 = new Ticket(new FixedPrice());
		Ticket ticket2 = new Ticket();
		ticket2.setTicketPriceStrategy(new FixedPrice());
		ticket2.setPrice(ticket2.getTicketPriceStrategy().calculate());
		Ticket ticket3 = new Ticket();
		ticket2.setTicketPriceStrategy(new FixedPrice());
		ticket2.setPrice(ticket2.getTicketPriceStrategy().calculate());
		ticketStack.add(ticket1);
		ticketStack.add(ticket2);
		ticketStack.add(ticket3);
	}

	public Stack<Ticket> getAllTickets() {
		return ticketStack;
	}

	public Ticket addTicket(Ticket ticket) {
		boolean isAdded = ticketStack.add(ticket);
		System.out.println("Is Added : " + isAdded);
		System.out.println("Stack size : " + ticketStack.size());
		Ticket newTicket;
		if(isAdded)
			newTicket = ticketStack.peek();
		else
			newTicket = new Ticket();
		System.out.println("New Ticket : " + newTicket);
		System.out.println("Stack size : " + ticketStack.size());
		return newTicket;
	}

	public void printTickets() {
		for (int i = 0; i < ticketStack.size(); i++) {
			System.out.println(ticketStack.elementAt(i));
		}
	}

	public boolean checkLastTicket() {
		Ticket ticket = ticketStack.lastElement();
		System.out.println("Ticket in checkLastTicket : " + ticket);
		if (ticket == null)
			return false;
		LocalDateTime ticketTime = ticket.getCreatedAt();
		ticketTime.plusHours(4);
		LocalDateTime currentTime = LocalDateTime.now();
		if (ticketTime.compareTo(currentTime) > 0) {
			return true;
		} else if (ticketTime.compareTo(currentTime) < 0) {
			return false;
		} else {
			return true;
		}

	}

}
