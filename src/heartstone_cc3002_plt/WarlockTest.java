package heartstone_cc3002_plt;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class WarlockTest {

	private ICard w;
	private ICard a;

	@Before
	public void setUp() throws Exception {
		w=new Warlock(100,10);
		a=new Assassin("ass",100,0,10);
	}

	@Test
	public void test() {
		w.attack(a);
		assertEquals(w.getLP(),100,0);
		assertEquals(a.getLP(),100,0);
		assertTrue(a.isAlive());
		assertTrue(w.isAlive());
		assertEquals(a.getDR(),20,0);
		a.attack(a);
		assertEquals(a.getDR(),30,0);
		a.attack(a);
		a.attack(a);
		a.attack(a);
		a.attack(a);
		a.attack(a);
		a.attack(a);
		a.attack(a);
		assertEquals(a.getDR(),100,0);
		assertFalse(a.isAlive());//se murio y-y
		
	}

}
