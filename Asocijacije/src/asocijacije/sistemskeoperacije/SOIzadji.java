package asocijacije.sistemskeoperacije;

import javax.swing.JOptionPane;

import asocijacije.PocetniEkran;

/**
 * Klasa koja predstavlja sistemsku operaciju izlaska iz aplikacije
 * 
 * @author Stefana Bogdanovic, Mirjana Stanojevic, Dragana Tanic
 *
 */
public class SOIzadji {

	/**
	 * Atribut koji predstavlja objekat klase PocetniEkran
	 */
	private static PocetniEkran pocetniEkran = new PocetniEkran();
	
	/**
	 * Metoda koja omogucava izlazak iz aplikacije
	 */
	public static void izvrsi() {
		
		int izbor = JOptionPane.showConfirmDialog(pocetniEkran.getContentPane(),
				"Da li zelite da izadjete iz programa?", "Exit", JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE);
		if (izbor == JOptionPane.YES_OPTION) {
			System.exit(0);
		}
	}
}
