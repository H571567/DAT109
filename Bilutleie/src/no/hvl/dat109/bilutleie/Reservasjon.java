package no.hvl.dat109.bilutleie;

import java.util.Date;

public class Reservasjon {

	private UtleieKontor uKontor;
	private UtleieKontor returSted;
	private Date dato;
	private int antDager;
	private Kunde kunde;

	public Reservasjon(UtleieKontor uKontor, UtleieKontor returSted, Date dato, int antDager, Kunde k) {
		super();
		this.uKontor = uKontor;
		this.returSted = returSted;
		this.dato = dato;
		this.antDager = antDager;
		kunde = k;
	}

	public UtleieKontor getuKontor() {
		return uKontor;
	}

	public void setuKontor(UtleieKontor uKontor) {
		this.uKontor = uKontor;
	}

	public UtleieKontor getReturSted() {
		return returSted;
	}

	public void setReturSted(UtleieKontor returSted) {
		this.returSted = returSted;
	}

	public Date getDato() {
		return dato;
	}

	public void setDato(Date dato) {
		this.dato = dato;
	}

	public int getAntDager() {
		return antDager;
	}

	public void setAntDager(int antDager) {
		this.antDager = antDager;
	}

	public Kunde getKunde() {
		return kunde;
	}

	public void setKunde(Kunde kunde) {
		this.kunde = kunde;
	}
}
