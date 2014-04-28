package cf.moneytdd.app;

public class Dollar extends Money {
	
	public Dollar(int amount){
		this.amount = amount;
		currency = "USD";
	}

	public Dollar(int amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}

	public int amount() {
		return amount;
	}
	
	public Money times(int multiplier){
		return new Dollar(amount*multiplier);
	}
	
	public boolean equals(Money money){
		return money.amount() == amount && getClass().equals(money.getClass());
	}
}
