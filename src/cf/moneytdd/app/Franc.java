package cf.moneytdd.app;

public class Franc extends Money {
	
	public Franc(int amount){
		super(amount,"CHF");
	}

	public Franc(int amount, String currency) {
		super(amount,currency);
	}

	public int amount() {
		return amount;
	}
	
	public Money times(int multiplier){
		return new Franc(amount*multiplier, currency);
	}
	
	public boolean equals(Money money){
		return money.amount() == amount && currency().equals(money.currency());
	}

}
