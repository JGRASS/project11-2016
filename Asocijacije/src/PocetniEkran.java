import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PocetniEkran extends JFrame {
	private JButton btnA1;
	private JButton btnA2;
	private JButton btnA3;
	private JButton btnA4;
	private JButton btnA;
	private JButton btnB1;
	private JButton btnB2;
	private JButton btnB3;
	private JButton btnB4;
	private JButton btnB;
	private JButton btnC1;
	private JButton btnC2;
	private JButton btnC3;
	private JButton btnC4;
	private JButton btnC;
	private JButton btnD1;
	private JButton btnD2;
	private JButton btnD3;
	private JButton btnD4;
	private JButton btnD;
	private JTextField textFieldA;
	private JTextField textFieldB;
	private JTextField textFieldC;
	private JTextField textFieldD;
	private JButton btnPotvrdi;
	private JButton btnKonacno;
	private JButton btnVreme;
	private JTextField textFieldKonacno;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PocetniEkran frame = new PocetniEkran();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PocetniEkran() {
		setResizable(false);
		setTitle("Asocijacije");
		getContentPane().setLayout(null);
		getContentPane().setLayout(null);
		getContentPane().setLayout(null);
		getContentPane().setLayout(null);
		getContentPane().setLayout(null);
		getContentPane().setLayout(null);
		getContentPane().add(getBtnA1());
		getContentPane().add(getBtnA2());
		getContentPane().add(getBtnA3());
		getContentPane().add(getBtnA4());
		getContentPane().add(getBtnA());
		getContentPane().add(getBtnB1());
		getContentPane().add(getBtnB2());
		getContentPane().add(getBtnB3());
		getContentPane().add(getBtnB4());
		getContentPane().add(getBtnB());
		getContentPane().add(getBtnC1());
		getContentPane().add(getBtnC2());
		getContentPane().add(getBtnC3());
		getContentPane().add(getBtnC4());
		getContentPane().add(getBtnC());
		getContentPane().add(getBtnD1());
		getContentPane().add(getBtnD2());
		getContentPane().add(getBtnD3());
		getContentPane().add(getBtnD4());
		getContentPane().add(getBtnD());
		getContentPane().add(getTextFieldA());
		getContentPane().add(getTextFieldB());
		getContentPane().add(getTextFieldC());
		getContentPane().add(getTextFieldD());
		getContentPane().add(getBtnPotvrdi());
		getContentPane().add(getBtnKonacno());
		getContentPane().add(getBtnVreme());
		getContentPane().add(getTextFieldKonacno());
	}
	private JButton getBtnA1() {
		if (btnA1 == null) {
			btnA1 = new JButton("A1");
			btnA1.setBounds(10, 11, 89, 23);
		}
		return btnA1;
	}
	private JButton getBtnA2() {
		if (btnA2 == null) {
			btnA2 = new JButton("A2");
			btnA2.setBounds(10, 45, 89, 23);
		}
		return btnA2;
	}
	private JButton getBtnA3() {
		if (btnA3 == null) {
			btnA3 = new JButton("A3");
			btnA3.setBounds(10, 79, 89, 23);
		}
		return btnA3;
	}
	private JButton getBtnA4() {
		if (btnA4 == null) {
			btnA4 = new JButton("A4");
			btnA4.setBounds(10, 113, 89, 23);
		}
		return btnA4;
	}
	private JButton getBtnA() {
		if (btnA == null) {
			btnA = new JButton("A");
			btnA.setBounds(10, 147, 89, 23);
		}
		return btnA;
	}
	private JButton getBtnB1() {
		if (btnB1 == null) {
			btnB1 = new JButton("B1");
			btnB1.setBounds(115, 11, 89, 23);
		}
		return btnB1;
	}
	private JButton getBtnB2() {
		if (btnB2 == null) {
			btnB2 = new JButton("B2");
			btnB2.setBounds(115, 45, 89, 23);
		}
		return btnB2;
	}
	private JButton getBtnB3() {
		if (btnB3 == null) {
			btnB3 = new JButton("B3");
			btnB3.setBounds(115, 79, 89, 23);
		}
		return btnB3;
	}
	private JButton getBtnB4() {
		if (btnB4 == null) {
			btnB4 = new JButton("B4");
			btnB4.setBounds(115, 113, 89, 23);
		}
		return btnB4;
	}
	private JButton getBtnB() {
		if (btnB == null) {
			btnB = new JButton("B");
			btnB.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				}
			});
			btnB.setBounds(115, 147, 89, 23);
		}
		return btnB;
	}
	private JButton getBtnC1() {
		if (btnC1 == null) {
			btnC1 = new JButton("C1");
			btnC1.setBounds(214, 11, 89, 23);
		}
		return btnC1;
	}
	private JButton getBtnC2() {
		if (btnC2 == null) {
			btnC2 = new JButton("C2");
			btnC2.setBounds(214, 45, 89, 23);
		}
		return btnC2;
	}
	private JButton getBtnC3() {
		if (btnC3 == null) {
			btnC3 = new JButton("C3");
			btnC3.setBounds(214, 79, 89, 23);
		}
		return btnC3;
	}
	private JButton getBtnC4() {
		if (btnC4 == null) {
			btnC4 = new JButton("C4");
			btnC4.setBounds(214, 113, 89, 23);
		}
		return btnC4;
	}
	private JButton getBtnC() {
		if (btnC == null) {
			btnC = new JButton("C");
			btnC.setBounds(214, 147, 89, 23);
		}
		return btnC;
	}
	private JButton getBtnD1() {
		if (btnD1 == null) {
			btnD1 = new JButton("D1");
			btnD1.setBounds(313, 11, 89, 23);
		}
		return btnD1;
	}
	private JButton getBtnD2() {
		if (btnD2 == null) {
			btnD2 = new JButton("D2");
			btnD2.setBounds(313, 45, 89, 23);
		}
		return btnD2;
	}
	private JButton getBtnD3() {
		if (btnD3 == null) {
			btnD3 = new JButton("D3");
			btnD3.setBounds(313, 79, 89, 23);
		}
		return btnD3;
	}
	private JButton getBtnD4() {
		if (btnD4 == null) {
			btnD4 = new JButton("D4");
			btnD4.setBounds(313, 113, 89, 23);
		}
		return btnD4;
	}
	private JButton getBtnD() {
		if (btnD == null) {
			btnD = new JButton("D");
			btnD.setBounds(313, 147, 89, 23);
		}
		return btnD;
	}
	private JTextField getTextFieldA() {
		if (textFieldA == null) {
			textFieldA = new JTextField();
			textFieldA.setBounds(10, 148, 86, 20);
			textFieldA.setColumns(10);
		}
		return textFieldA;
	}
	private JTextField getTextFieldB() {
		if (textFieldB == null) {
			textFieldB = new JTextField();
			textFieldB.setBounds(118, 148, 86, 20);
			textFieldB.setColumns(10);
		}
		return textFieldB;
	}
	private JTextField getTextFieldC() {
		if (textFieldC == null) {
			textFieldC = new JTextField();
			textFieldC.setBounds(214, 148, 86, 20);
			textFieldC.setColumns(10);
		}
		return textFieldC;
	}
	private JTextField getTextFieldD() {
		if (textFieldD == null) {
			textFieldD = new JTextField();
			textFieldD.setBounds(316, 148, 86, 20);
			textFieldD.setColumns(10);
		}
		return textFieldD;
	}
	private JButton getBtnPotvrdi() {
		if (btnPotvrdi == null) {
			btnPotvrdi = new JButton("Potvrdi");
			btnPotvrdi.setBounds(169, 191, 89, 23);
		}
		return btnPotvrdi;
	}
	private JButton getBtnKonacno() {
		if (btnKonacno == null) {
			btnKonacno = new JButton("???");
			btnKonacno.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnKonacno.setBounds(10, 228, 293, 23);
		}
		return btnKonacno;
	}
	private JButton getBtnVreme() {
		if (btnVreme == null) {
			btnVreme = new JButton("");
			btnVreme.setBounds(329, 228, 73, 23);
		}
		return btnVreme;
	}
	private JTextField getTextFieldKonacno() {
		if (textFieldKonacno == null) {
			textFieldKonacno = new JTextField();
			textFieldKonacno.setBounds(10, 229, 293, 20);
			textFieldKonacno.setColumns(10);
		}
		return textFieldKonacno;
	}
}
