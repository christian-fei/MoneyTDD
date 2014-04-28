package cf.moneytdd.app;

public abstract class Money {
	protected int amount;
	protected String currency;
	
	public abstract int amount();
	
	public abstract boolean equals(Money money);

	public static Money dollar(int amount) {
		return new Dollar(amount,"USD");
	}
	
	public static Money franc(int amount) {
		return new Franc(amount,"CHF");
	}
	
	public String currency(){
		return currency;
	}
}
