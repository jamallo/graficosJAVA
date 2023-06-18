package presentacion.graficos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculadoraBien extends JFrame {

	private JPanel contentPane;
	private JTextField Numero1;
	private JTextField Numero2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraBien frame = new CalculadoraBien();
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
	public CalculadoraBien() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Numero1");
		lblNewLabel.setBounds(56, 56, 45, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNumero = new JLabel("Numero2");
		lblNumero.setBounds(56, 93, 45, 13);
		contentPane.add(lblNumero);
		
		Numero1 = new JTextField();
		Numero1.setBounds(146, 53, 96, 19);
		contentPane.add(Numero1);
		Numero1.setColumns(10);
		
		Numero2 = new JTextField();
		Numero2.setColumns(10);
		Numero2.setBounds(146, 90, 96, 19);
		contentPane.add(Numero2);
		
		JButton btnSumar = new JButton("Sumar");
		btnSumar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btnSumar, "Suma: " + (Integer.parseInt(Numero1.getText()) + Integer.parseInt(Numero2.getText()))) ;
				
			}
		});
		btnSumar.setBounds(56, 142, 85, 21);
		contentPane.add(btnSumar);
		
		JButton btnMultiplicar = new JButton("Multiplicar");
		btnMultiplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btnMultiplicar, "Producto:" + (Integer.parseInt(Numero1.getText()) * Integer.parseInt(Numero2.getText())));
			}
		});
		btnMultiplicar.setBounds(157, 142, 85, 21);
		contentPane.add(btnMultiplicar);
	}

}
