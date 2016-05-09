package asocijacije.sistemskeoperacije;

import javax.swing.JOptionPane;

import asocijacije.PocetniEkran;

/**
 * Klasa koja predstavlja sistemsku operaciju zapocinjanja nove igre
 * 
 * @author Stefana Bogdanovic, Mirjana Stanojevic, Dragana Tanic
 *
 */
public class SOZapocniNovuIgru {

	/**
	 * Atribut koji predstavlja objekat klase PocetniEkran
	 */
	private static PocetniEkran pocetniEkran = new PocetniEkran();
	
	/**
	 * Metoda koja omogucava pocetak nove igra 
	 */
	public static void izvrsi() {
		int izbor = JOptionPane.showConfirmDialog(pocetniEkran.getContentPane(),
				"Da li ste sigurni da zelite da zapocnete novu igru?", "Nova igra", JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE);
		if (izbor == JOptionPane.YES_OPTION) {
			pocetniEkran = new PocetniEkran();
			pocetniEkran.setVisible(true);
		}
	}
}
