package presentacion.graficos;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class CalculadoraVentana extends JFrame {

	private JPanel contentPane;
	private JTextField jtNum1;
	private JTextField jtNum2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraVentana frame = new CalculadoraVentana();
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
	public CalculadoraVentana() {
		setTitle("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNumero1 = new JLabel("Numero 1: ");
		lblNumero1.setFont(new Font("Serif", Font.PLAIN, 32));
		lblNumero1.setBounds(70, 50, 149, 35);
		contentPane.add(lblNumero1);
		
		JLabel lblNumero2 = new JLabel("Numero 2: ");
		lblNumero2.setFont(new Font("Serif", Font.PLAIN, 32));
		lblNumero2.setBounds(70, 109, 149, 35);
		contentPane.add(lblNumero2);
		
		jtNum1 = new JTextField();
		jtNum1.setFont(new Font("Serif", Font.PLAIN, 28));
		jtNum1.setBounds(234, 50, 96, 35);
		contentPane.add(jtNum1);
		jtNum1.setColumns(10);
		
		jtNum2 = new JTextField();
		jtNum2.setFont(new Font("Serif", Font.PLAIN, 28));
		jtNum2.setColumns(10);
		jtNum2.setBounds(229, 109, 96, 35);
		contentPane.add(jtNum2);
		
		JButton btnSumar = new JButton("Sumar");
		btnSumar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btnSumar, "Suma: " + (Integer.parseInt(jtNum1.getText()) + Integer.parseInt(jtNum2.getText())));
			}
		});
		btnSumar.setBounds(83, 178, 85, 21);
		contentPane.add(btnSumar);
		
		JButton btnMultiplicar = new JButton("Multiplicar");
		btnMultiplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btnMultiplicar, "Suma: " + (Integer.parseInt(jtNum1.getText()) * Integer.parseInt(jtNum2.getText())));
			}
		});
		btnMultiplicar.setBounds(205, 178, 85, 21);
		contentPane.add(btnMultiplicar);
	}
}
