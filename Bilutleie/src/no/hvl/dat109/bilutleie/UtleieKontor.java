package no.hvl.dat109.bilutleie;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UtleieKontor {

	private int id; // nb pass paa at denne er unik;
	private Adresse adr;
	private long tlf;
	private List<Bil> biler;
	private List<Reservasjon> reservasjon = new ArrayList<>();

	public UtleieKontor(int id, Adresse adr, long tlf, List<Bil> biler, List<Reservasjon> reservasjon) {
		super();
		this.id = id;
		this.adr = adr;
		this.tlf = tlf;
		this.biler = biler;
		this.reservasjon = reservasjon;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public List<Bil> getBiler() {
		return biler;
	}

	public void setBiler(List<Bil> biler) {
		this.biler = biler;
	}

	public List<Reservasjon> getReservasjon() {
		return reservasjon;
	}

	public void setReservasjon(List<Reservasjon> reservasjon) {
		this.reservasjon = reservasjon;
	}

	public List<Bil> finnLedigBilVedStorrelse(int str) {
		List<Bil> bilerLedig = new ArrayList<>();
		if (biler != null) {
			bilerLedig = biler.stream().filter(b -> b.getStorrelse() == (str)).filter(s -> s.isLedig() == true)
					.collect(Collectors.toList());
		}
		return bilerLedig;
	}

	public List<Bil> finnLedigBilVedGruppe(char c) {
		List<Bil> bilerLedig = new ArrayList<>();
		if (biler != null) {
			bilerLedig = biler.stream().filter(b -> b.getGruppe() == (c)).filter(s -> s.isLedig() == true)
					.collect(Collectors.toList());
		}
		return bilerLedig;
	}

	public Bil finnBilVedRegNR() {
		return null;
	}

	public void leggtilBil(Bil bil) {
	}

	public void fjernBil() {
	}

	public void reserverBil() {

	}
}
