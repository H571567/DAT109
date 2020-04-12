package no.hvl.dat109.bilutleie;

public class Kunde {

	private String fnavn;
	private String enavn;
	private Adresse adr;
	private long tlf;

	public Kunde(String fornavn, String etternavn, Adresse adresse, long telefon) {
		fnavn = fornavn;
		enavn = etternavn;
		adr = adresse;
		tlf = telefon;
	}

	public String getFnavn() {
		return fnavn;
	}

	public void setFnavn(String fnavn) {
		this.fnavn = fnavn;
	}

	public String getEnavn() {
		return enavn;
	}

	public void setEnavn(String enavn) {
		this.enavn = enavn;
	}

	public Adresse getAdr() {
		return adr;
	}

	public void setAdr(Adresse adr) {
		this.adr = adr;
	}

	public long getTlf() {
		return tlf;
	}

	public void setTlf(long tlf) {
		this.tlf = tlf;
	}
}
