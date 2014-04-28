package cf.moneytdd.app;


public class Bank {

	public Money reduce(Expression source, String toCurrency) {
		Sum sum = (Sum) source;
		return sum.reduce(toCurrency);
	}

}
