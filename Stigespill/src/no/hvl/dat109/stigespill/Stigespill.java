/**
 * 
 */
package no.hvl.dat109.stigespill;

/**
 * Klasse som starter spillet
 * 
 * @author DJDan30
 *
 */
public class Stigespill {

	private Spiller spillere[] = new Spiller[0];
	private Brett brett = new Brett();
	private Brikker[] brikkene = new Brikker[0];
	private Terning terning = new Terning();

	public static void main(String[] args) {
		Stigespill spillet = new Stigespill();
		spillet.startSpill(4);
		spillet.lagBrett();
		spillet.flyttBrikkene(1000);
	}

	private void startSpill(int antSpillere) {
		if (antSpillere > 0) {
			spillere = new Spiller[antSpillere];
			brikkene = new Brikker[antSpillere];
			for (int i = 0; i < antSpillere; i++) { // oppretter tabell med antall spillere
				spillere[i] = new Spiller(i);
				brikkene[i] = new Brikker(i);
			}
		}
//		Stigespill spillet= new Stigespill();
//		spillet.lagBrett();
	}

	private void lagBrett() {// lager stiger og slanger
		
		// Rute[] brettet= brett.brett;
		if (brett != null) {
			brett.setStige(37, 1);
			brett.setStige(13, 3);
			brett.setStige(30, 7);
			brett.setStige(41, 20);
			brett.setStige(83, 27);
			brett.setStige(43, 35);
			brett.setStige(66, 50);
			brett.setStige(90, 70);
			brett.setStige(99, 79);
			
			// setter langer under her
			brett.setSlange(5, 14);
			brett.setSlange(25, 46);
			brett.setSlange(10, 48);
			brett.setSlange(52, 55);
			brett.setSlange(17, 61);
			brett.setSlange(59, 63);
			brett.setSlange(23, 86);
			brett.setSlange(72, 91);
			brett.setSlange(74, 94);
			brett.setSlange(77, 97);
		}
	}

	private void flyttBrikkene(int antSpill) {
		int antRunderPerGangTot=0;
		for (int j = 0; j < antSpill; j++) {
			Boolean vunnet = false;
			int antRunderSpilt = 0;
			if (spillere.length > 0 && spillere.length == brikkene.length) {
				while (!vunnet) {
					for (int i = 0; i < spillere.length; i++) {
						int trillVerdi = terning.trill();
						brikkene[i].setPos(trillVerdi);
						brikkene[i].setPosAbsolutt(brett.getRuteNyPos(brikkene[i].getPos()));
						if (brikkene[i].getPos() == 99) {
							vunnet = true;
							System.out.println("Grauleler du har vunnet :D");
							System.out.println(
									"Spiller: " + i + " har vunnet etter: " + antRunderSpilt + " runder spilt!");
						}
					}
					antRunderSpilt++;
				}
			}
			vunnet=false;
			antRunderPerGangTot=antRunderSpilt+antRunderPerGangTot;
			for(int k=0; k<spillere.length; k++) {
				brikkene[k].setPosAbsolutt(0);
			}
		}
		System.out.println("Gjennomsnitt runder spilt: " + antRunderPerGangTot/antSpill);
	}
}
