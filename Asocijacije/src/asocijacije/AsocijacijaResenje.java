package asocijacije;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AsocijacijaResenje extends JFrame {
	private String A = "";
	private String B = "";
	private String C = "";
	private String D = "";
	private String konacno = "";

	private JPanel contentPane;
	private JButton btnKraj;
	private JButton btnKolonaA;
	private JButton btnKolonaB;
	private JButton btnKolonaC;
	private JButton btnKolonaD;
	private JButton btnKonacno;
	private JButton btnA;
	private JButton btnB;
	private JButton btnC;
	private JButton btnD;
	private JButton btnK;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AsocijacijaResenje frame = new AsocijacijaResenje();
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
	public AsocijacijaResenje() {
		setResizable(false);
		setTitle("Asocijacija Resenje");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 355, 309);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getBtnKraj());
		contentPane.add(getBtnKolonaA());
		contentPane.add(getBtnKolonaB());
		contentPane.add(getBtnKolonaC());
		contentPane.add(getBtnKolonaD());
		contentPane.add(getBtnKonacno());
		contentPane.add(getBtnA());
		contentPane.add(getBtnB());
		contentPane.add(getBtnC());
		contentPane.add(getBtnD());
		contentPane.add(getBtnK());
	}
	

	public AsocijacijaResenje(String string, String string2, String string3, String string4, String string5,String string6) {
		setTitle("Asocijacija Resenje");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 416, 326);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getBtnKraj());
		contentPane.add(getBtnKolonaA());
		contentPane.add(getBtnKolonaB());
		contentPane.add(getBtnKolonaC());
		contentPane.add(getBtnKolonaD());
		contentPane.add(getBtnKonacno());
		contentPane.add(getBtnA());
		contentPane.add(getBtnB());
		contentPane.add(getBtnC());
		contentPane.add(getBtnD());
		contentPane.add(getBtnK());
		A = string;
		B = string2;
		C = string3;
		D = string4;
		konacno = string5;
		btnA.setText(A);
		btnB.setText(B);
		btnC.setText(C);
		btnD.setText(D);
		btnK.setText(konacno);
		btnKraj.setText(string6);
		
	}
	
	private JButton getBtnKraj() {
		if (btnKraj == null) {
			btnKraj = new JButton("");
			btnKraj.setBounds(10, 11, 315, 31);
		}
		return btnKraj;
	}
	private JButton getBtnKolonaA() {
		if (btnKolonaA == null) {
			btnKolonaA = new JButton("Kolona A:");
			btnKolonaA.setBounds(10, 53, 107, 31);
		}
		return btnKolonaA;
	}
	private JButton getBtnKolonaB() {
		if (btnKolonaB == null) {
			btnKolonaB = new JButton("Kolona B:");
			btnKolonaB.setBounds(10, 95, 107, 31);
		}
		return btnKolonaB;
	}
	private JButton getBtnKolonaC() {
		if (btnKolonaC == null) {
			btnKolonaC = new JButton("Kolona C:");
			btnKolonaC.setBounds(10, 137, 107, 31);
		}
		return btnKolonaC;
	}
	private JButton getBtnKolonaD() {
		if (btnKolonaD == null) {
			btnKolonaD = new JButton("Kolona D:");
			btnKolonaD.setBounds(10, 179, 107, 31);
		}
		return btnKolonaD;
	}
	private JButton getBtnKonacno() {
		if (btnKonacno == null) {
			btnKonacno = new JButton("Konacno:");
			btnKonacno.setBounds(10, 221, 107, 31);
		}
		return btnKonacno;
	}
	private JButton getBtnA() {
		if (btnA == null) {
			btnA = new JButton("");
			btnA.setBounds(218, 53, 107, 31);
		}
		return btnA;
	}
	private JButton getBtnB() {
		if (btnB == null) {
			btnB = new JButton("");
			btnB.setBounds(218, 99, 107, 31);
		}
		return btnB;
	}
	private JButton getBtnC() {
		if (btnC == null) {
			btnC = new JButton("");
			btnC.setBounds(218, 141, 107, 31);
		}
		return btnC;
	}
	private JButton getBtnD() {
		if (btnD == null) {
			btnD = new JButton("");
			btnD.setBounds(218, 183, 107, 31);
		}
		return btnD;
	}
	private JButton getBtnK() {
		if (btnK == null) {
			btnK = new JButton("");
			btnK.setBounds(218, 225, 107, 31);
		}
		return btnK;
	}
}
