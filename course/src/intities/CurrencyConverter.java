package intities;

public class CurrencyConverter {
	
	public double priceBr = 3.10;
	public double units;
	public double totalReal;
	public double totalTax;
	public double totalDollar = 200.00;
	
	
	public double totalTax() {
		return (totalDollar * priceBr)+(totalDollar * priceBr * 6 / 100);
	}
}
