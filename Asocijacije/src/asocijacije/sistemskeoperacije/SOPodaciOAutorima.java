package asocijacije.sistemskeoperacije;

import javax.swing.JOptionPane;

import asocijacije.PocetniEkran;

public class SOPodaciOAutorima {

	private static PocetniEkran pocetniEkran = new PocetniEkran(); 
	
	public static void izvrsi() {
		pocetniEkran = new PocetniEkran();
		JOptionPane.showMessageDialog(pocetniEkran.getContentPane(), "Autori:" + System.lineSeparator()+ "Mirjana Stanojevic 99/14" +System.lineSeparator() +
				"Dragana Tanic 15/14" + System.lineSeparator()+ "Stefana Bogdanovic 66/14", "Podaci o autoru",
				JOptionPane.PLAIN_MESSAGE);
	}
}
