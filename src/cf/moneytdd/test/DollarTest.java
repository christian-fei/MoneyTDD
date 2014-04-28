package cf.moneytdd.test;

import static org.junit.Assert.*;

import org.junit.Test;

import cf.moneytdd.app.*;

public class DollarTest {

	@Test
	public void testAmount() {
		int amount = 5;
		Dollar dollar = new Dollar(amount);
		assertEquals(dollar.amount(), amount);
	}
	
	@Test
	public void testTimes(){
		int multiplier = 2;
		int amount = 5;
		Dollar dollar = new Dollar(amount);
		assertEquals(dollar.times(multiplier).amount(), 10);
	}
	
	@Test
	public void testEquals(){
		Dollar dollar1 = new Dollar(5);
		Dollar dollar2 = new Dollar(5);
		
		assertTrue(dollar1.equals(dollar2));
	}
	
	public void testMultiplication() {
		Dollar five = (Dollar) Money.dollar(5);
		assertEquals(new Dollar(10), five.times(2));
		assertEquals(new Dollar(15), five.times(3));
	}	
	
	@Test
	public void testCurrency(){
		assertEquals(new Dollar(5).currency(), "USD");		
	}

	
	@Test
	public void testDifferentClassEquality() {
		assertTrue(new Money(10, "CHF").equals(new Franc(10, "CHF")));
		assertTrue(Money.dollar(5).equals(Money.dollar(5)));
		assertFalse(Money.dollar(5).equals(Money.dollar(6)));
		assertTrue(Money.franc(5).equals(Money.franc(5)));
		assertFalse(Money.franc(5).equals(Money.franc(6)));
		assertFalse(Money.franc(5).equals(Money.dollar(5)));
	}


}
