package no.hvl.dat109.bilutleie;

public class Bil {

	private String RegNR;
	private String merke;
	private String modell;
	private String farge;
	private char gruppe;// pris gruppe fra A hoyest til D
	private int storrelse; // fra 1-5,5 storst
	private boolean ledig;
	private UtleieKontor utKontor;

	public Bil(String regNR, String merke, String modell, String farge, char gruppe, int storrelse, boolean ledig,
			UtleieKontor utKontor) {
		super();
		RegNR = regNR;
		this.merke = merke;
		this.modell = modell;
		this.farge = farge;
		this.gruppe = gruppe;
		this.storrelse = storrelse;
		this.ledig = ledig;
		this.utKontor = utKontor;
	}

	public String getRegNR() {
		return RegNR;
	}

	public void setRegNR(String regNR) {
		RegNR = regNR;
	}

	public String getMerke() {
		return merke;
	}

	public void setMerke(String merke) {
		this.merke = merke;
	}

	public String getModell() {
		return modell;
	}

	public void setModell(String modell) {
		this.modell = modell;
	}

	public String getFarge() {
		return farge;
	}

	public void setFarge(String farge) {
		this.farge = farge;
	}

	public char getGruppe() {
		return gruppe;
	}

	public void setGruppe(char gruppe) {
		this.gruppe = gruppe;
	}

	public int getStorrelse() {
		return storrelse;
	}

	public void setStorrelse(int storrelse) {
		this.storrelse = storrelse;
	}

	public boolean isLedig() {
		return ledig;
	}

	public void setLedig(boolean ledig) {
		this.ledig = ledig;
	}

	public UtleieKontor getUtKontor() {
		return utKontor;
	}

	public void setUtKontor(UtleieKontor utKontor) {
		this.utKontor = utKontor;
	}
}
