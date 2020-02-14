/**
 * 
 */
package no.hvl.dat109.stigespillTest;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import no.hvl.dat109.stigespill.Brikker;
import no.hvl.dat109.stigespill.Stigespill;

/**
 * Tester Spillet
 * 
 * @author DJDan30
 *
 */
public class StigespillTest {

	@Before
	public void init() {
		Stigespill test = new Stigespill();
	}

	@Test
	public void testMerEnnHundre() {
		Brikker b = new Brikker(0);
		b.setPos(98);
		int terningVerdi = 5;
		b.setPos(5);
		assertEquals(95, b.getPos());
	}

	@Test
	public void testNyPos() {
		Brikker b = new Brikker(0);
		b.setPos(0);
		int terningVerdi = 5;
		b.setPos(5);
		assertEquals(5, b.getPos());
	}
}
