package cf.moneytdd.app;

public class Dollar extends Money {
	
	public Dollar(int amount){
		super(amount, "USD");
	}

	public Dollar(int amount, String currency) {
		super(amount, currency);
	}

	public int amount() {
		return amount;
	}
	
	public Money times(int multiplier){
		return new Dollar(amount*multiplier,currency);
	}
	
	public boolean equals(Money money){
		return money.amount() == amount && currency().equals(money.currency());
	}
}
