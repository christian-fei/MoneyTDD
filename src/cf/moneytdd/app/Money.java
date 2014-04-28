package cf.moneytdd.app;

public class Money implements Expression {
	protected int amount;
	protected String currency;
	
	public int amount(){
		return amount;
	}
	
	public boolean equals(Money money){
		return money.amount() == amount && currency().equals(money.currency());
	}
	
	public Money(int amount, String currency){
		this.amount = amount;
		this.currency = currency;
	}

	public static Money dollar(int amount) {
		return new Dollar(amount,"USD");
	}
	
	public static Money franc(int amount) {
		return new Franc(amount,"CHF");
	}
	
	public String currency(){
		return currency;
	}
	
	public String toString(){
		return amount + " " + currency;
	}

	public Expression plus(Money addend) {
		return new Sum(this, addend);
	}
	
	public Money reduce(String to){
		return this;
	}
}
