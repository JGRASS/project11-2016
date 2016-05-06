package asocijacije;

import java.awt.EventQueue;

import javax.swing.JOptionPane;

public class GUIKontroler {

	private static Igrac igrac;
	private static PocetniEkran pocetniEkran;

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
		int izbor = JOptionPane.showConfirmDialog(pocetniEkran.getContentPane(),
				"Da li zelite da izadjete iz programa?", "Exit", JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE);
		if (izbor == JOptionPane.YES_OPTION) {
			System.exit(0);
		}
	}

	public static void zapocniNovuIgru() {
		int izbor = JOptionPane.showConfirmDialog(pocetniEkran.getContentPane(),
				"Da li ste sigurni da zelite da zapocnete novu igru?", "Nova igra", JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE);
		if (izbor == JOptionPane.YES_OPTION) {
			pocetniEkran = new PocetniEkran();
			pocetniEkran.setVisible(true);
		}
	}
	
	public static void podaciOAutorima() {
		pocetniEkran = new PocetniEkran();
		JOptionPane.showMessageDialog(pocetniEkran.getContentPane(), "Autori:" + System.lineSeparator()+ "Mirjana Stanojevic 99/14" +System.lineSeparator() +
				"Dragana Tanic 15/14" + System.lineSeparator()+ "Stefana Bogdanovic 66/14", "Podaci o autoru",
				JOptionPane.PLAIN_MESSAGE);
	}
	
	public static void trenutniIgrac() {
		pocetniEkran = new PocetniEkran();
		JOptionPane.showMessageDialog(pocetniEkran.getContentPane(), "Igrac: " + System.lineSeparator()+"Ime: " + 
		igrac.getTextFieldIme().getText()+System.lineSeparator()+"Prezime: "+igrac.getTextFieldPrezime().getText() , "Podaci o igracu",
				JOptionPane.PLAIN_MESSAGE);
	}

}
