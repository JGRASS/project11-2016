package asocijacije.sistemskeoperacije;

import javax.swing.JOptionPane;
import asocijacije.PocetniEkran;

public class SOTrenutniIgrac {
	
	private static PocetniEkran pocetniEkran = new PocetniEkran();

	public static void izvrsi(String ime, String prezime) {
		JOptionPane.showMessageDialog(pocetniEkran.getContentPane(), "Igrac: " + System.lineSeparator()+"Ime: " + 
		ime+System.lineSeparator()+"Prezime: "+prezime , "Podaci o igracu",
				JOptionPane.PLAIN_MESSAGE);
	}
}
