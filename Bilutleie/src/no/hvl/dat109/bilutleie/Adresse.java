package no.hvl.dat109.bilutleie;

public class Adresse {

	public String postSted;
	public int postNR;
	public String gateAdresse;

	public Adresse(String postS, int NRPost, String gateAdr) {
		postSted = postS;
		postNR = NRPost;
		gateAdresse = gateAdr;
	}

	public String getPostSted() {
		return postSted;
	}

	public void setPostSted(String postSted) {
		this.postSted = postSted;
	}

	public int getPostNR() {
		return postNR;
	}

	public void setPostNR(int postNR) {
		this.postNR = postNR;
	}

	public String getGateAdresse() {
		return gateAdresse;
	}

	public void setGateAdresse(String gateAdresse) {
		this.gateAdresse = gateAdresse;
	}
}
