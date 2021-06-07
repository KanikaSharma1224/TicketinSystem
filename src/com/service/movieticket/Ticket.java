package com.service.movieticket;

import java.time.LocalDateTime;

public class Ticket {
	private int ticketNumber;
	private LocalDateTime createdAt;
	private CalculateTicketPriceStrategy ticketPriceStrategy;
	private double price;

	public Ticket(CalculateTicketPriceStrategy priceStrategy) {
		ticketNumber = getRandom();
		createdAt = LocalDateTime.now();
		ticketPriceStrategy = priceStrategy;
		price = ticketPriceStrategy.calculate();
	}

	public Ticket() {
		ticketNumber = getRandom();
		createdAt = LocalDateTime.now();
	}

	public int getTicketNumber() {
		return ticketNumber;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public CalculateTicketPriceStrategy getTicketPriceStrategy() {
		return ticketPriceStrategy;
	}

	public void setTicketPriceStrategy(CalculateTicketPriceStrategy priceStrategy) {
		this.ticketPriceStrategy = priceStrategy;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = this.price;
	}

	public int getRandom() {
		return (int) Math.random() * 50 + 1;
	}

	@Override
	public String toString() {
		return "Ticket [ticketNumber=" + ticketNumber + ", createdAt=" + createdAt + ", ticketPriceStrategy="
				+ ticketPriceStrategy + ", price=" + price + "]";
	}
	

}
