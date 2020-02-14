/**
 * 
 */
package no.hvl.dat109.stigespill;

import java.util.Random;

/**
 * Klasse som definerer en terning
 * 
 * @author DJDan30
 *
 */
public class Terning {

	private int sum;

	public Terning() {
		sum = 0;
	}

	public int trill() {

		sum = (int) (Math.random() * 6 + 1);
		return sum;

	}

}
