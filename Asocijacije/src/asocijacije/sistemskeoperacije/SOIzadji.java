package asocijacije.sistemskeoperacije;

import javax.swing.JOptionPane;

import asocijacije.PocetniEkran;

public class SOIzadji {

	private static PocetniEkran pocetniEkran = new PocetniEkran();
	
	public static void izvrsi() {
		
		int izbor = JOptionPane.showConfirmDialog(pocetniEkran.getContentPane(),
				"Da li zelite da izadjete iz programa?", "Exit", JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE);
		if (izbor == JOptionPane.YES_OPTION) {
			System.exit(0);
		}
	}
}
