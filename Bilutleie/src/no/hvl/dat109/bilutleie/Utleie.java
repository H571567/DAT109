package no.hvl.dat109.bilutleie;

public class Utleie {

	public Kunde kunde;
	public int kredittKortNR;
	public Bil bil;
	private Retur retur;

	public Utleie(Kunde k, int kkNR, Bil bilLeie, Retur r) {
		kunde = k;
		kredittKortNR = kkNR;
		bil = bilLeie;
		retur = r;

	}

	public Kunde getKunde() {
		return kunde;
	}

	public void setKunde(Kunde kunde) {
		this.kunde = kunde;
	}

	public int getKredittKortNR() {
		return kredittKortNR;
	}

	public void setKredittKortNR(int kredittKortNR) {
		this.kredittKortNR = kredittKortNR;
	}

	public Bil getBil() {
		return bil;
	}

	public void setBil(Bil bil) {
		this.bil = bil;
	}

	public Retur getRetur() {
		return retur;
	}

	public void setRetur(Retur retur) {
		this.retur = retur;
	}
}
