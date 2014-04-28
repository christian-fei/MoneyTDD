package cf.moneytdd.test;

import static org.junit.Assert.*;

import org.junit.Test;

import cf.moneytdd.app.Bank;
import cf.moneytdd.app.Expression;
import cf.moneytdd.app.Money;

public class MoneyTest {
	
	@Test
	public void testEquality() {
		assertTrue(Money.dollar(5).equals(Money.dollar(5)));
		assertFalse(Money.dollar(5).equals(Money.dollar(6)));
		assertFalse(Money.franc(5).equals(Money.dollar(5)));
	}
	
	@Test
	public void testSimpleAddition(){
		/*
		Money sum = Money.dollar(5).plus(Money.dollar(1));
		assertEquals(sum.amount(), 6);
		*/
		Money five = Money.dollar(5);
		Expression sum = five.plus(five);
		Bank bank = new Bank();
		Money reduced = bank.reduce(sum, "USD");
		assertTrue(Money.dollar(10).equals(reduced));
	}
}