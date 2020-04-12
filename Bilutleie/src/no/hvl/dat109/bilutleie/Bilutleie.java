package no.hvl.dat109.bilutleie;

import java.util.HashMap;
import java.util.Map;

public class Bilutleie {

	private Map<Integer, UtleieKontor> utleiekontor;
	private String navn;
	private long tlf;
	private Adresse adr;
	private Kunde kunder[];

	public Bilutleie(String navn, long tlf, Adresse adr, Kunde kunder[]) {
		super();
		utleiekontor = new HashMap<>();
		this.navn = navn;
		this.tlf = tlf;
		this.adr = adr;
		this.kunder = kunder;
	}

	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

	public long getTlf() {
		return tlf;
	}

	public void setTlf(long tlf) {
		this.tlf = tlf;
	}

	public Adresse getAdr() {
		return adr;
	}

	public void setAdr(Adresse adr) {
		this.adr = adr;
	}

	public Map<Integer, UtleieKontor> getUtleiekontor() {
		return utleiekontor;
	}

	public void setUtleiekontor(Map<Integer, UtleieKontor> utleiekontor) {
		this.utleiekontor = utleiekontor;
	}

	public Kunde[] getKunder() {
		return kunder;
	}

	public void setKunder(Kunde[] kunder) {
		this.kunder = kunder;
	}

	public void leggTilKunde() {
	}

	public void leggTilUTleiekontor() {
	}

	public void leiBil(UtleieKontor utKontor, char gruppe) {

	}

	// lag legg til metode for utleiekontor.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
