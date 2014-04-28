package cf.moneytdd.app;

public class Sum implements Expression {
	Money augend;
	Money addend;
	
	public Sum(Money augend, Money addend){
		this.augend = augend;
		this.addend= addend;
	}
	
	public Money reduce(String toCurrency){
		int amount = augend.amount + addend.amount;
		return new Money(amount, toCurrency);
	}
}
