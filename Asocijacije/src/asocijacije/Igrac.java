package asocijacije;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.awt.event.ActionEvent;

public class Igrac extends JFrame {

	private JPanel contentPane;
	private JLabel lblIme;
	private JLabel lblPrezime;
	private JTextField textFieldIme;
	private JTextField textFieldPrezime;
	private JButton btnZapocniIgru;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Igrac frame = new Igrac();
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
	public Igrac() {
		setTitle("Igrac");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 241, 219);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblIme());
		contentPane.add(getLblPrezime());
		contentPane.add(getTextFieldIme());
		contentPane.add(getTextFieldPrezime());
		contentPane.add(getBtnZapocniIgru());
	}
	private JLabel getLblIme() {
		if (lblIme == null) {
			lblIme = new JLabel("Ime:");
			lblIme.setBounds(10, 26, 101, 36);
		}
		return lblIme;
	}
	private JLabel getLblPrezime() {
		if (lblPrezime == null) {
			lblPrezime = new JLabel("Prezime:");
			lblPrezime.setBounds(10, 75, 59, 30);
		}
		return lblPrezime;
	}
	public JTextField getTextFieldIme() {
		if (textFieldIme == null) {
			textFieldIme = new JTextField();
			textFieldIme.setBounds(99, 34, 101, 20);
			textFieldIme.setColumns(10);
		}
		return textFieldIme;
	}
	public JTextField getTextFieldPrezime() {
		if (textFieldPrezime == null) {
			textFieldPrezime = new JTextField();
			textFieldPrezime.setBounds(99, 80, 101, 20);
			textFieldPrezime.setColumns(10);
		}
		return textFieldPrezime;
	}
	private JButton getBtnZapocniIgru() {
		if (btnZapocniIgru == null) {
			btnZapocniIgru = new JButton("Zapocni igru");
			btnZapocniIgru.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String ime = textFieldIme.getText();
					String prezime = textFieldPrezime.getText();
					Osoba o = new Osoba();
					o.setIme(ime);
					o.setPrezime(prezime);
					
		
					
					try {
						ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("fajl.out")));
						out.writeObject(o);
						out.close();
					} catch (IOException e1) {
						e1.printStackTrace();
					}				
					PocetniEkran p = new PocetniEkran();
					p.setVisible(true);
					dispose();
				}
			});
			btnZapocniIgru.setBounds(42, 128, 109, 23);
		}
		return btnZapocniIgru;
	}
}
