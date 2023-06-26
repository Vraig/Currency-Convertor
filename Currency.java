package currencyConverter;

import java.util.ArrayList;
import java.util.HashMap;

public class Currency {
	private String name;
	private String shortName;
	private HashMap<String, Double> exchangeValues = new HashMap<String, Double>();
	
	// "Currency" Constructor
	public Currency(String nameValue, String shortNameValue) {
		this.name = nameValue;
		this.shortName = shortNameValue;
	}
	
	// Getter for name
	public String getName() {
		return this.name;
	}
	
	// Setter for name
	public void setName(String name) {
		this.name = name;
	}
	
	// Getter for shortName
	public String getShortName() {
		return this.shortName;
	}
	
	// Setter for shortName
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	
	// Getter for exchangeValues
	public HashMap<String, Double> getExchangeValues() {
		return this.exchangeValues;
	}
	
	// Setter for exchangeValues
	public void setExchangeValues(String key, Double value) {
		this.exchangeValues.put(key, value);
	}
	
	// Set default values for a currency
	public void defaultValues() {
		String currency = this.name;
		
		switch (currency) {	
			case "US Dollar":
				this.exchangeValues.put("USD", 1.00);
				this.exchangeValues.put("EUR", 0.91622);
				this.exchangeValues.put("GBP", 0.7868);
				this.exchangeValues.put("CHF", 0.89155);
				this.exchangeValues.put("CNY", 7.2347);
				this.exchangeValues.put("JPY", 143.19);
				break;
			case "Euro":
				this.exchangeValues.put("USD", 1.0914);
				this.exchangeValues.put("EUR", 1.00);
				this.exchangeValues.put("GBP", 0.85875);
				this.exchangeValues.put("CHF", 0.97307);
				this.exchangeValues.put("CNY", 7.8963);
				this.exchangeValues.put("JPY", 156.29);
				break;
			case "British Pound":
				this.exchangeValues.put("USD", 1.271);
				this.exchangeValues.put("EUR", 1.1645);
				this.exchangeValues.put("GBP", 1.00);
				this.exchangeValues.put("CHF", 1.1331);
				this.exchangeValues.put("CNY", 9.1951);
				this.exchangeValues.put("JPY", 182.0);
				break;
			case "Swiss Franc":
				this.exchangeValues.put("USD", 1.1216);
				this.exchangeValues.put("EUR", 1.0277);
				this.exchangeValues.put("GBP", 0.88251);
				this.exchangeValues.put("CHF", 1.00);
				this.exchangeValues.put("CNY", 8.1148);
				this.exchangeValues.put("JPY", 160.61);
				break;
			case "Chinese Yuan Renminbi":
				this.exchangeValues.put("USD", 0.13822);
				this.exchangeValues.put("EUR", 0.12664);
				this.exchangeValues.put("GBP", 0.10875);
				this.exchangeValues.put("CHF", 0.12323);
				this.exchangeValues.put("CNY", 1.00);
				this.exchangeValues.put("JPY", 19.793);
				break;
			case "Japanese Yen":
				this.exchangeValues.put("USD", 0.006984);
				this.exchangeValues.put("EUR", 0.006398);
				this.exchangeValues.put("GBP", 0.005495);
				this.exchangeValues.put("CHF", 0.006226);
				this.exchangeValues.put("CNY", 0.050524);
				this.exchangeValues.put("JPY", 1.000);
				break;
		}
	}
	
	// Initialize currencies
	public static ArrayList<Currency> init() {
		ArrayList<Currency> currencies = new ArrayList<Currency>();
				
		currencies.add( new Currency("US Dollar", "USD") );
		currencies.add( new Currency("Euro", "EUR") );
		currencies.add( new Currency("British Pound", "GBP") );
		currencies.add( new Currency("Swiss Franc", "CHF") );
		currencies.add( new Currency("Chinese Yuan Renminbi", "CNY") );
		currencies.add( new Currency("Japanese Yen", "JPY") );
		
		for (Integer i =0; i < currencies.size(); i++) {
			currencies.get(i).defaultValues();
		}		
		
		return currencies;
	}
	
	// Convert a currency to another
	public static Double convert(Double amount, Double exchangeValue) {
		Double price;
		price = amount * exchangeValue;
		price = Math.round(price * 100d) / 100d;
		
		return price;
	}
}