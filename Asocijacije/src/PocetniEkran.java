import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;

public class PocetniEkran extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldA;
	private JTextField textFieldB;
	private JTextField textFieldC;
	private JTextField textFieldD;
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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 357);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnA1 = new JButton("A1");
		btnA1.setBounds(10, 22, 89, 23);
		contentPane.add(btnA1);
		
		JButton btnA2 = new JButton("A2");
		btnA2.setBounds(10, 66, 89, 23);
		contentPane.add(btnA2);
		
		JButton btnA3 = new JButton("A3");
		btnA3.setBounds(10, 107, 89, 23);
		contentPane.add(btnA3);
		
		JButton btnA4 = new JButton("A4");
		btnA4.setBounds(10, 152, 89, 23);
		contentPane.add(btnA4);
		
		JButton btnA = new JButton("A");
		btnA.setBounds(10, 196, 89, 23);
		contentPane.add(btnA);
		
		textFieldA = new JTextField();
		textFieldA.setBounds(10, 197, 86, 20);
		contentPane.add(textFieldA);
		textFieldA.setColumns(10);
		
		JButton btnB1 = new JButton("B1");
		btnB1.setBounds(117, 22, 89, 23);
		contentPane.add(btnB1);
		
		JButton btnB2 = new JButton("B2");
		btnB2.setBounds(117, 66, 89, 23);
		contentPane.add(btnB2);
		
		JButton btnB3 = new JButton("B3");
		btnB3.setBounds(117, 107, 89, 23);
		contentPane.add(btnB3);
		
		JButton btnB4 = new JButton("B4");
		btnB4.setBounds(117, 152, 89, 23);
		contentPane.add(btnB4);
		
		JButton btnB = new JButton("B");
		btnB.setBounds(117, 196, 89, 23);
		contentPane.add(btnB);
		
		textFieldB = new JTextField();
		textFieldB.setBounds(117, 197, 86, 20);
		contentPane.add(textFieldB);
		textFieldB.setColumns(10);
		
		JButton btnC1 = new JButton("C1");
		btnC1.setBounds(229, 22, 89, 23);
		contentPane.add(btnC1);
		
		JButton btnC2 = new JButton("C2");
		btnC2.setBounds(229, 66, 89, 23);
		contentPane.add(btnC2);
		
		JButton btnC3 = new JButton("C3");
		btnC3.setBounds(229, 107, 89, 23);
		contentPane.add(btnC3);
		
		JButton btnC4 = new JButton("C4");
		btnC4.setBounds(229, 152, 89, 23);
		contentPane.add(btnC4);
		
		JButton btnC = new JButton("C");
		btnC.setBounds(229, 196, 89, 23);
		contentPane.add(btnC);
		
		textFieldC = new JTextField();
		textFieldC.setBounds(232, 197, 86, 20);
		contentPane.add(textFieldC);
		textFieldC.setColumns(10);
		
		JButton btnD1 = new JButton("D1");
		btnD1.setBounds(328, 22, 89, 23);
		contentPane.add(btnD1);
		
		JButton btnD2 = new JButton("D2");
		btnD2.setBounds(328, 66, 89, 23);
		contentPane.add(btnD2);
		
		JButton btnD3 = new JButton("D3");
		btnD3.setBounds(328, 107, 89, 23);
		contentPane.add(btnD3);
		
		JButton btnD4 = new JButton("D4");
		btnD4.setBounds(328, 152, 89, 23);
		contentPane.add(btnD4);
		
		JButton btnD = new JButton("D");
		btnD.setBounds(328, 196, 89, 23);
		contentPane.add(btnD);
		
		textFieldD = new JTextField();
		textFieldD.setBounds(331, 197, 86, 20);
		contentPane.add(textFieldD);
		textFieldD.setColumns(10);
		
		JButton btnPotvrdi = new JButton("Potvrdi");
		btnPotvrdi.setBounds(175, 230, 95, 32);
		contentPane.add(btnPotvrdi);
		
		JButton btnKonacno = new JButton("???");
		btnKonacno.setBounds(24, 274, 294, 32);
		contentPane.add(btnKonacno);
		
		JButton btnVreme = new JButton("");
		btnVreme.setBounds(347, 274, 70, 32);
		contentPane.add(btnVreme);
		
		textFieldKonacno = new JTextField();
		textFieldKonacno.setBounds(24, 286, 290, 20);
		contentPane.add(textFieldKonacno);
		textFieldKonacno.setColumns(10);
	}
}
