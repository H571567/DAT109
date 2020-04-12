package no.hvl.dat109.bilutleie;

import java.util.Date;

public class Retur {

	public int kmStand;
	public Date dato;
	public String tidspunkt;// lage denne i annet objekt?

	public Retur(int km, Date DDMMYYYY, String time) {
		kmStand = km;
		dato = DDMMYYYY;
		tidspunkt = time;
	}

	public int getKmStand() {
		return kmStand;
	}

	public void setKmStand(int kmStand) {
		this.kmStand = kmStand;
	}

	public Date getDato() {
		return dato;
	}

	public void setDato(Date dato) {
		this.dato = dato;
	}

	public String getTidspunkt() {
		return tidspunkt;
	}

	public void setTidspunkt(String tidspunkt) {
		this.tidspunkt = tidspunkt;
	}
}
