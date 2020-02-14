/**
 * 
 */
package no.hvl.dat109.stigespill;

/**
 * Klasse som definerer brettet
 * 
 * @author DJDan30
 *
 */
public class Brett {

	public Rute brettMRuter[] = new Rute[100];

	public Brett() {
		for (int i = 0; i < 100; i++) {
			brettMRuter[i] = new Rute(i);

		}
	}

	public Rute[] getBrett() {
		return brettMRuter;
	}

	public void setBrett(Rute[] brett) {
		this.brettMRuter = brett;
	}

	public void setSlange(int pos, int ruteNavn) {
		brettMRuter[ruteNavn].setNyPos(pos);
	}

	public void setStige(int pos, int ruteNavn) {
		brettMRuter[ruteNavn].setNyPos(pos);
	}

	public int getRuteNyPos(int pos) {
		return brettMRuter[pos].getNyPos();
	}

}
