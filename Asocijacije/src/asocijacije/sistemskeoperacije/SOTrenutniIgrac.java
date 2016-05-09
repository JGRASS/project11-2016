package asocijacije.sistemskeoperacije;

import javax.swing.JOptionPane;
import asocijacije.PocetniEkran;

/**
 * Klasa koja predstavlja sistemsku operaciju prikaza podataka o trenutnom igracu
 * 
 * @author Stefana Bogdanovic, Mirjana Stanojevic, Dragana Tanic
 *
 */
public class SOTrenutniIgrac {
	
	/**
	 * Atribut koji predstavlja objekat klase PocetniEkran
	 */
	private static PocetniEkran pocetniEkran = new PocetniEkran();

	 /**
	  * Metoda koja ispisuje podatke o trenutnom igracu
	  * 
	  * @param ime
	  * @param prezime
	  */
	public static void izvrsi(String ime, String prezime) {
		JOptionPane.showMessageDialog(pocetniEkran.getContentPane(), "Igrac: " + System.lineSeparator()+"Ime: " + 
		ime+System.lineSeparator()+"Prezime: "+prezime , "Podaci o igracu",
				JOptionPane.PLAIN_MESSAGE);
	}
}
