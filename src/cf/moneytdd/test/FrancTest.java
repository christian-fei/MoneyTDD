package cf.moneytdd.test;

import static org.junit.Assert.*;

import org.junit.Test;

import cf.moneytdd.app.*;

public class FrancTest {

	@Test
	public void testAmount() {
		int amount = 5;
		Franc franc = new Franc(amount);
		assertEquals(franc.amount(), amount);
	}

	@Test
	public void testTimes() {
		int multiplier = 2;
		int amount = 5;
		Franc dranc = new Franc(amount);
		assertEquals(dranc.times(multiplier).amount(), 10);
	}

	@Test
	public void testEquals() {
		Franc dranc1 = new Franc(5);
		Franc dranc2 = new Franc(5);

		assertTrue(dranc1.equals(dranc2));
	}
	
	@Test
	public void testEquality(){
		assertFalse(new Franc(5).equals(new Dollar(5)));
		assertTrue(new Dollar(5).equals(new Dollar(5)));
	}
	
	@Test
	public void testMultiplication() {
		Franc five = (Franc) Money.franc(5);
		assertEquals(new Franc(10).amount(), five.times(2).amount());
		assertEquals(new Franc(15).amount(), five.times(3).amount());
	}
	
	@Test
	public void testCurrency(){
		assertEquals(new Franc(5).currency(), "CHF");
		assertEquals(Money.franc(5).currency(), "CHF");
	}

}
