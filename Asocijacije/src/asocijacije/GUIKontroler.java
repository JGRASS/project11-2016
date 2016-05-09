package asocijacije;

import java.awt.EventQueue;
import asocijacije.sistemskeoperacije.SOIzadji;
import asocijacije.sistemskeoperacije.SOPodaciOAutorima;
import asocijacije.sistemskeoperacije.SOTrenutniIgrac;
import asocijacije.sistemskeoperacije.SOZapocniNovuIgru;

/**
 * Klasa koja je posrednik izmedju GUI-a i domenskih klasa
 * 
 * @author Stefana Bogdanovic, Mira Stanojevic, Dragana Tanic
 *
 *
 */
public class GUIKontroler {

	/**
	 * Atribut koji predstavlja objekat klase Igrac
	 */
	private static Igrac igrac ;
	/**
	 * Atribut koji predstavlja objekat klase PocetniEkran
	 */
	private static PocetniEkran pocetniEkran;
	/**
	 * Atribut koji predstavlja ime igraca
	 */
	public static String ime;
	/**
	 * Atribut koji predstavlja prezime igraca
	 */
	public static String prezime;

	/**
	 * Metoda koja pokrece program
	 * 
	 * @param args
	 */
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

	/**
	 * Metoda koja poziva metodu izvrsi klase SOIzadji
	 */
	public static void izadji() {
		SOIzadji.izvrsi();
	}

	/**
	 * Metoda koja poziva metodu izvrsi klase SOZapocniNovuIgru
	 */
	public static void zapocniNovuIgru() {
		SOZapocniNovuIgru.izvrsi();
	}
	
	/**
	 * Metoda koja poziva metodu izvrsi klase SOPodaciOAutorima
	 */
	public static void podaciOAutorima() {
		SOPodaciOAutorima.izvrsi();
	}
	
	/**
	 * Metoda koja poziva metodu izvrsi klase SOTrenutniIgrac
	 * 
	 * @param ime
	 * @param prezime
	 */
	public static void trenutniIgrac(String ime, String prezime) {
		SOTrenutniIgrac.izvrsi(igrac.getTextFieldIme().getText(), igrac.getTextFieldPrezime().getText());
	}

}
