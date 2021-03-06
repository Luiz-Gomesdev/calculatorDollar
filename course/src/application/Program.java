package application;

import java.util.Locale;
import java.util.Scanner;

import intities.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		CurrencyConverter converter = new CurrencyConverter();
		
		System.out.printf("What is the dollar price? %.2f%n" , converter.priceBr);
		System.out.printf("How many dollars will be bought %.2f%n? " , converter.totalDollar);
		System.out.println();
		System.out.printf("Amount to be paid in reais = %.2f%n" , converter.totalTax());
		sc.close();
	}
}
