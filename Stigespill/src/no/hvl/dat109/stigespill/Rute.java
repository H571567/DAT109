/**
 * 
 */
package no.hvl.dat109.stigespill;

/**
 * Klasse som definerer rute
 * 
 * @author DJDan30
 *
 */
public class Rute {

	public int navn;//tall verdi på plassen vi er på
	public int nypos;
	
	public Rute(int navn) {
		this.navn=navn;
		nypos=navn;
	}

	public int getNavn() {
		return navn;
	}

	public void setNavn(int navn) {
		this.navn = navn;
	}

	public int getNyPos() {
		return nypos;
	}

	public void setNyPos(int pos) {
		this.nypos = pos;
	}
}
