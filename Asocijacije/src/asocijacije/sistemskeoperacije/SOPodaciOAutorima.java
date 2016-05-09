package asocijacije.sistemskeoperacije;

import javax.swing.JOptionPane;

import asocijacije.PocetniEkran;

/**
 * Klasa koja predstavlja sistemsku operaciju ispisa podataka o autorima
 * 
 * @author Stefana Bogdanovic, Mirjana Stanojevic, Dragana Tanic
 *
 */
public class SOPodaciOAutorima {

	/**
	 * Atribut koji predstavlja objekat klase PocetniEkran
	 */
	private static PocetniEkran pocetniEkran = new PocetniEkran(); 
	
	/**
	 * Metoda koja ispisuje podatke o autorima
	 */
	public static void izvrsi() {
		
	pocetniEkran = new PocetniEkran(); 
		
		JOptionPane.showMessageDialog(pocetniEkran.getContentPane(), "Autori:" + System.lineSeparator()+ "Mirjana Stanojevic 99/14" +System.lineSeparator() +
				"Dragana Tanic 15/14" + System.lineSeparator()+ "Stefana Bogdanovic 66/14", "Podaci o autorima",
				JOptionPane.PLAIN_MESSAGE);
	}
}
