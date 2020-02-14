/**
 * 
 */
package no.hvl.dat109.stigespill;

/**
 * Klasse som definerer Brikke
 * 
 * @author DJDan30
 *
 */
public class Brikker {

	int navn; // navn det samme som navnet på spilleren?
	int pos;

//	public Brikke() {
//	}
	public Brikker (int navn) {
		this.navn = navn;
		pos = 0;
	}

	public int getNavn() {
		return navn;
	}

	public void setNavn (int navn) {
		this.navn = navn;
	}

	public int getPos() {
		return pos;
	}

	public void setPos (int pos) {
		this.pos = this.pos + pos;
		if (this.pos > 99) {
			int tilbake = this.pos - 99;// this.pos=99+99-pos; er det samme
			this.pos = 99 - tilbake;
		}
	}

	public void setPosAbsolutt(int pos) {
		this.pos = pos;
	}
}
