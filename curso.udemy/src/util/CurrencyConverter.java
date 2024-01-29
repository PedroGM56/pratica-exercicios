package util;

public class CurrencyConverter {
	
	public static double IOF = 0.06;
	
	public static double priceReais(double quantity, double dollarPrice ) {
		return quantity * dollarPrice * (1.0 + IOF);
	}
}
