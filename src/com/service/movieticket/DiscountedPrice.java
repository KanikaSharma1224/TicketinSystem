package com.service.movieticket;

public class DiscountedPrice implements CalculateTicketPriceStrategy {
	private final double discount = 10;

	@Override
	public double calculate() {
		return price * discount;
	}

}
