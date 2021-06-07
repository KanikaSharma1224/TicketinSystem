package com.service.movieticket;

public class FixedPrice implements CalculateTicketPriceStrategy{

	@Override
	public double calculate() {
		return price;
	}

}
