package asocijacije;

import java.awt.EventQueue;
import asocijacije.sistemskeoperacije.SOIzadji;
import asocijacije.sistemskeoperacije.SOPodaciOAutorima;
import asocijacije.sistemskeoperacije.SOTrenutniIgrac;
import asocijacije.sistemskeoperacije.SOZapocniNovuIgru;

public class GUIKontroler {

	private static Igrac igrac ;
	private static PocetniEkran pocetniEkran;
	public static String ime;
	public static String prezime;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				try {
					igrac = new Igrac();
					pocetniEkran = new PocetniEkran();
					igrac.setVisible(true);
					pocetniEkran.setVisible(false);
					pocetniEkran.setLocationRelativeTo(null);
					igrac.setLocationRelativeTo(null);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public static void izadji() {
		SOIzadji.izvrsi();
	}

	public static void zapocniNovuIgru() {
		SOZapocniNovuIgru.izvrsi();
	}
	
	public static void podaciOAutorima() {
		SOPodaciOAutorima.izvrsi();
	}
	
	public static void trenutniIgrac(String ime, String prezime) {
		SOTrenutniIgrac.izvrsi(igrac.getTextFieldIme().getText(), igrac.getTextFieldPrezime().getText());
	}

}
