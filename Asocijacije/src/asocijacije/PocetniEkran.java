package asocijacije;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.awt.event.ActionEvent;
import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
/**
 * Prozor koji omogucava korisniku da zapocne igru
 * 
 * @author Stefana Bogdanovic, Mirjana Stanojevic, Dragana Tanic
 *
 */
public class PocetniEkran extends JFrame {

	private String pojmoviAsocijacije;

	String[] nizKolona = new String[10];
	String[] nizPolja1 = new String[10];
	String[] nizPolja2 = new String[10];
	String[] nizPolja3 = new String[10];
	String[] nizPolja4 = new String[10];
	int ukupnoVreme = 120;

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
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setIconImage(Toolkit.getDefaultToolkit().getImage(PocetniEkran.class.getResource("/icons/unnamed.png")));
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				GUIKontroler.izadji();
			}
		});
		setSize(new Dimension(425, 305));
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
		setJMenuBar(getMenuBar_1());

		AsocijacijaResenje I = new AsocijacijaResenje(nizPolja1[4], nizPolja2[4], nizPolja3[4], nizPolja4[4],
				nizPolja4[5], "Isteklo vam je vreme");

		ActionListener taskPerformer = new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				if (ukupnoVreme == 0) {
					btnVreme.setVisible(false);
					dispose();
					I.setVisible(true);

				}
				if (ukupnoVreme > 0) {
					btnVreme.setText(ukupnoVreme + "");
					ukupnoVreme--;
				}
			}
		};

		javax.swing.Timer t = new javax.swing.Timer(1000, taskPerformer);
		t.start();
	}

	int kojiIzBazeAsocijacije = 0;
	String[] celaAsocijacijaNiz = new String[40];

	String S = "";
	private JMenuBar menuBar;
	private JMenu mnMeni;
	private JMenuItem mntmNovaIgra;
	private JMenuItem mntmIzadji;
	private JMenuItem mntmONama;
	private JMenuItem mntmTrenutniIgrac;

	{

		try {
			BufferedReader B = new BufferedReader(new FileReader("Pojmovi"));
			boolean kraj = false;
			while (!kraj) {
				String pom = B.readLine();
				if (pom == null)
					kraj = true;
				else {
					S = S + pom + "%";
				}
			}
			B.close();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		celaAsocijacijaNiz = S.split("%");
		kojiIzBazeAsocijacije = (int) Math.round(Math.random() * 1);
		pojmoviAsocijacije = celaAsocijacijaNiz[kojiIzBazeAsocijacije];
		nizKolona = pojmoviAsocijacije.split("!");
		nizPolja1 = nizKolona[0].split("#");
		nizPolja2 = nizKolona[1].split("#");
		nizPolja3 = nizKolona[2].split("#");
		nizPolja4 = nizKolona[3].split("#");
	}

	private JButton getBtnA1() {
		if (btnA1 == null) {
			btnA1 = new JButton("A1");
			btnA1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					btnA1.setText(nizPolja1[0]);
					textFieldA.setVisible(true);
					textFieldKonacno.setVisible(true);
					btnA.setVisible(false);
					btnKonacno.setVisible(false);
				}
			});
			btnA1.setBounds(10, 11, 89, 23);
		}
		return btnA1;
	}

	private JButton getBtnA2() {
		if (btnA2 == null) {
			btnA2 = new JButton("A2");
			btnA2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					btnA2.setText(nizPolja1[1]);
					textFieldA.setVisible(true);
					textFieldKonacno.setVisible(true);
					btnA.setVisible(false);
					btnKonacno.setVisible(false);
				}
			});
			btnA2.setBounds(10, 45, 89, 23);
		}
		return btnA2;
	}

	private JButton getBtnA3() {
		if (btnA3 == null) {
			btnA3 = new JButton("A3");
			btnA3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					btnA3.setText(nizPolja1[2]);
					textFieldA.setVisible(true);
					textFieldKonacno.setVisible(true);
					btnA.setVisible(false);
					btnKonacno.setVisible(false);
				}
			});
			btnA3.setBounds(10, 79, 89, 23);
		}
		return btnA3;
	}

	private JButton getBtnA4() {
		if (btnA4 == null) {
			btnA4 = new JButton("A4");
			btnA4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					btnA4.setText(nizPolja1[3]);
					textFieldA.setVisible(true);
					textFieldKonacno.setVisible(true);
					btnA.setVisible(false);
					btnKonacno.setVisible(false);
				}
			});
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
			btnB1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					btnB1.setText(nizPolja2[0]);
					textFieldB.setVisible(true);
					textFieldKonacno.setVisible(true);
					btnB.setVisible(false);
					btnKonacno.setVisible(false);
				}
			});
			btnB1.setBounds(115, 11, 89, 23);
		}
		return btnB1;
	}

	private JButton getBtnB2() {
		if (btnB2 == null) {
			btnB2 = new JButton("B2");
			btnB2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					btnB2.setText(nizPolja2[1]);
					textFieldB.setVisible(true);
					textFieldKonacno.setVisible(true);
					btnB.setVisible(false);
					btnKonacno.setVisible(false);
				}
			});
			btnB2.setBounds(115, 45, 89, 23);
		}
		return btnB2;
	}

	private JButton getBtnB3() {
		if (btnB3 == null) {
			btnB3 = new JButton("B3");
			btnB3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					btnB3.setText(nizPolja2[2]);
					textFieldB.setVisible(true);
					textFieldKonacno.setVisible(true);
					btnB.setVisible(false);
					btnKonacno.setVisible(false);
				}
			});
			btnB3.setBounds(115, 79, 89, 23);
		}
		return btnB3;
	}

	private JButton getBtnB4() {
		if (btnB4 == null) {
			btnB4 = new JButton("B4");
			btnB4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					btnB4.setText(nizPolja2[3]);
					textFieldB.setVisible(true);
					textFieldKonacno.setVisible(true);
					btnB.setVisible(false);
					btnKonacno.setVisible(false);
				}
			});
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
			btnC1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					btnC1.setText(nizPolja3[0]);
					textFieldC.setVisible(true);
					textFieldKonacno.setVisible(true);
					btnC.setVisible(false);
					btnKonacno.setVisible(false);
				}
			});
			btnC1.setBounds(214, 11, 89, 23);
		}
		return btnC1;
	}

	private JButton getBtnC2() {
		if (btnC2 == null) {
			btnC2 = new JButton("C2");
			btnC2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					btnC2.setText(nizPolja3[1]);
					textFieldC.setVisible(true);
					textFieldKonacno.setVisible(true);
					btnC.setVisible(false);
					btnKonacno.setVisible(false);
				}
			});
			btnC2.setBounds(214, 45, 89, 23);
		}
		return btnC2;
	}

	private JButton getBtnC3() {
		if (btnC3 == null) {
			btnC3 = new JButton("C3");
			btnC3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					btnC3.setText(nizPolja3[2]);
					textFieldC.setVisible(true);
					textFieldKonacno.setVisible(true);
					btnC.setVisible(false);
					btnKonacno.setVisible(false);
				}
			});
			btnC3.setBounds(214, 79, 89, 23);
		}
		return btnC3;
	}

	private JButton getBtnC4() {
		if (btnC4 == null) {
			btnC4 = new JButton("C4");
			btnC4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					btnC4.setText(nizPolja3[3]);
					textFieldC.setVisible(true);
					textFieldKonacno.setVisible(true);
					btnC.setVisible(false);
					btnKonacno.setVisible(false);
				}
			});
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
			btnD1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					btnD1.setText(nizPolja4[0]);
					textFieldD.setVisible(true);
					textFieldKonacno.setVisible(true);
					btnD.setVisible(false);
					btnKonacno.setVisible(false);
				}
			});
			btnD1.setBounds(313, 11, 89, 23);
		}
		return btnD1;
	}

	private JButton getBtnD2() {
		if (btnD2 == null) {
			btnD2 = new JButton("D2");
			btnD2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					btnD2.setText(nizPolja4[1]);
					textFieldD.setVisible(true);
					textFieldKonacno.setVisible(true);
					btnD.setVisible(false);
					btnKonacno.setVisible(false);
				}
			});
			btnD2.setBounds(313, 45, 89, 23);
		}
		return btnD2;
	}

	private JButton getBtnD3() {
		if (btnD3 == null) {
			btnD3 = new JButton("D3");
			btnD3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					btnD3.setText(nizPolja4[2]);
					textFieldD.setVisible(true);
					textFieldKonacno.setVisible(true);
					btnD.setVisible(false);
					btnKonacno.setVisible(false);
				}
			});
			btnD3.setBounds(313, 79, 89, 23);
		}
		return btnD3;
	}

	private JButton getBtnD4() {
		if (btnD4 == null) {
			btnD4 = new JButton("D4");
			btnD4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					btnD4.setText(nizPolja4[3]);
					textFieldD.setVisible(true);
					textFieldKonacno.setVisible(true);
					btnD.setVisible(false);
					btnKonacno.setVisible(false);
				}
			});
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
			textFieldA.setVisible(false);
			textFieldA.setBounds(13, 148, 86, 20);
			textFieldA.setColumns(10);
		}
		return textFieldA;
	}

	private JTextField getTextFieldB() {
		if (textFieldB == null) {
			textFieldB = new JTextField();
			textFieldB.setVisible(false);
			textFieldB.setBounds(118, 148, 86, 20);
			textFieldB.setColumns(10);
		}
		return textFieldB;
	}

	private JTextField getTextFieldC() {
		if (textFieldC == null) {
			textFieldC = new JTextField();
			textFieldC.setVisible(false);
			textFieldC.setBounds(214, 148, 86, 20);
			textFieldC.setColumns(10);
		}
		return textFieldC;
	}

	private JTextField getTextFieldD() {
		if (textFieldD == null) {
			textFieldD = new JTextField();
			textFieldD.setVisible(false);
			textFieldD.setBounds(313, 148, 86, 20);
			textFieldD.setColumns(10);
		}
		return textFieldD;
	}

	private JButton getBtnPotvrdi() {
		if (btnPotvrdi == null) {
			btnPotvrdi = new JButton("Potvrdi");
			btnPotvrdi.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String A = textFieldA.getText().toUpperCase();
					String B = textFieldB.getText().toUpperCase();
					String C = textFieldC.getText().toUpperCase();
					String D = textFieldD.getText().toUpperCase();
					String konacno = textFieldKonacno.getText().toUpperCase();

					if (konacno.equals(nizPolja4[5].toUpperCase())) {

						btnKonacno.setVisible(true);
						btnKonacno.setText(nizPolja4[5]);
						btnA.setText(nizPolja1[4]);
						btnA1.setText(nizPolja1[0]);
						btnA2.setText(nizPolja1[1]);
						btnA3.setText(nizPolja1[2]);
						btnA.setVisible(true);
						btnA4.setText(nizPolja1[3]);
						btnB.setText(nizPolja2[4]);
						btnB1.setText(nizPolja2[0]);
						btnB2.setText(nizPolja2[1]);
						btnB3.setText(nizPolja2[2]);
						btnB.setVisible(true);
						btnB4.setText(nizPolja2[3]);
						btnC.setText(nizPolja3[4]);
						btnC1.setText(nizPolja3[0]);
						btnC2.setText(nizPolja3[1]);
						btnC3.setText(nizPolja3[2]);
						btnC.setVisible(true);
						btnC4.setText(nizPolja3[4]);
						btnD.setText(nizPolja4[4]);
						btnD1.setText(nizPolja4[0]);
						btnD2.setText(nizPolja4[1]);
						btnD3.setText(nizPolja4[2]);
						btnD.setVisible(true);
						btnD4.setText(nizPolja4[3]);
						AsocijacijaResenje a = new AsocijacijaResenje(nizPolja1[4], nizPolja2[4], nizPolja3[4],
								nizPolja4[4], nizPolja4[5], "Pogodili ste konacno resenje");
						a.setVisible(true);
						dispose();
					} else
						textFieldKonacno.setText("");

					if (A.equals(nizPolja1[4].toUpperCase())) {
						btnA.setText(nizPolja1[4]);
						btnA1.setText(nizPolja1[0]);
						btnA2.setText(nizPolja1[1]);
						btnA3.setText(nizPolja1[2]);
						btnA.setVisible(true);
						btnA4.setText(nizPolja1[3]);
					} else
						textFieldA.setText("");
					if (B.equals(nizPolja2[4].toUpperCase())) {
						btnB.setText(nizPolja2[4]);
						btnB1.setText(nizPolja2[0]);
						btnB2.setText(nizPolja2[1]);
						btnB3.setText(nizPolja2[2]);
						btnB.setVisible(true);
						btnB4.setText(nizPolja2[3]);
					} else
						textFieldB.setText("");
					if (C.equals(nizPolja3[4].toUpperCase())) {
						btnC.setText(nizPolja3[4]);
						btnC1.setText(nizPolja3[0]);
						btnC2.setText(nizPolja3[1]);
						btnC3.setText(nizPolja3[2]);
						btnC.setVisible(true);
						btnC4.setText(nizPolja3[3]);
					} else
						textFieldC.setText("");
					if (D.equals(nizPolja4[4].toUpperCase())) {
						btnD.setText(nizPolja4[4]);
						btnD1.setText(nizPolja4[0]);
						btnD2.setText(nizPolja4[1]);
						btnD3.setText(nizPolja4[2]);
						btnD.setVisible(true);
						btnD4.setText(nizPolja4[3]);
						;

					} else
						textFieldD.setText("");
				}
			});
			btnPotvrdi.setBounds(169, 183, 89, 23);
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
			btnKonacno.setBounds(10, 217, 293, 23);
		}
		return btnKonacno;
	}

	private JButton getBtnVreme() {
		if (btnVreme == null) {
			btnVreme = new JButton("");
			btnVreme.setBounds(326, 217, 73, 23);
		}
		return btnVreme;
	}

	private JTextField getTextFieldKonacno() {
		if (textFieldKonacno == null) {
			textFieldKonacno = new JTextField();
			textFieldKonacno.setVisible(false);
			textFieldKonacno.setBounds(10, 218, 293, 20);
			textFieldKonacno.setColumns(10);
		}
		return textFieldKonacno;
	}
	private JMenuBar getMenuBar_1() {
		if (menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.add(getMnMeni());
		}
		return menuBar;
	}
	private JMenu getMnMeni() {
		if (mnMeni == null) {
			mnMeni = new JMenu("Meni");
			mnMeni.add(getMntmNovaIgra());
			mnMeni.add(getMntmIzadji());
			mnMeni.add(getMntmONama());
			mnMeni.add(getMntmTrenutniIgrac());
		}
		return mnMeni;
	}
	private JMenuItem getMntmNovaIgra() {
		if (mntmNovaIgra == null) {
			mntmNovaIgra = new JMenuItem("Nova igra");
			mntmNovaIgra.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					GUIKontroler.zapocniNovuIgru();
				}
			});
			mntmNovaIgra.setIcon(new ImageIcon(PocetniEkran.class.getResource("/com/sun/java/swing/plaf/windows/icons/Computer.gif")));
			mntmNovaIgra.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_MASK));
		}
		return mntmNovaIgra;
	}
	private JMenuItem getMntmIzadji() {
		if (mntmIzadji == null) {
			mntmIzadji = new JMenuItem("Izadji");
			mntmIzadji.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIKontroler.izadji();
				}
			});
			mntmIzadji.setIcon(new ImageIcon(PocetniEkran.class.getResource("/javax/swing/plaf/metal/icons/ocean/close.gif")));
			mntmIzadji.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.ALT_MASK));
		}
		return mntmIzadji;
	}
	private JMenuItem getMntmONama() {
		if (mntmONama == null) {
			mntmONama = new JMenuItem("O nama");
			mntmONama.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIKontroler.podaciOAutorima();
				}
			});
		}
		return mntmONama;
	}
	private JMenuItem getMntmTrenutniIgrac() {
		if (mntmTrenutniIgrac == null) {
			mntmTrenutniIgrac = new JMenuItem("Trenutni igrac");
			mntmTrenutniIgrac.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIKontroler.trenutniIgrac("N","N");
				}
			});
		}
		return mntmTrenutniIgrac;
	}
}
