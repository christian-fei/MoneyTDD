package cf.moneytdd.app;

public class Franc extends Money {
	
	public Franc(int amount){
		this.amount = amount;
		currency = "CHF";
	}

	public Franc(int amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}

	public int amount() {
		return amount;
	}
	
	public Money times(int multiplier){
		return new Franc(amount*multiplier);
	}
	
	public boolean equals(Money money){
		return money.amount() == amount && getClass().equals(money.getClass());
	}

}
