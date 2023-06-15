package presentacion.graficos;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MiVentana extends JFrame {

	public MiVentana() {
		//titulo de la ventana
		super("Calculadora");
		//modificar el comportamiento del botón de cierre
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		//tamaño y posisición
		this.setBounds(120, 50, 800, 500);
		//proceso de creación de controles gráficos
		inicializarComponentes();
		//visualizar ventana
		this.setVisible(true);
		
	}
	
	private void inicializarComponentes () {
		this.setLayout(null);
		
		JLabel n1 = new JLabel ("Numero 1");
		JLabel n2 = new JLabel ("Numero 2");

		JTextField tx1 = new JTextField();
		JTextField tx2 = new JTextField();
		
		JButton jb1 = new JButton("Sumar");
		JButton jb2 = new JButton("Multiplicar");
		
		JLabel jl1 = new JLabel();
		
		n1.setBounds(90, 80, 212, 52);
		n1.setFont(new Font ("Serif", Font.PLAIN, 32));
		n2.setBounds(90, 153, 212, 52);
		n2.setFont(new Font ("Serif", Font.PLAIN, 32));
		tx1.setBounds(348, 80, 292, 47);
		tx1.setFont(new Font ("Serif", Font.PLAIN, 32));
		tx2.setBounds(348, 153, 292, 47);
		tx2.setFont(new Font ("Serif", Font.PLAIN, 32));
		jb1.setBounds(120, 250, 228, 47);
		jb1.setFont(new Font ("Serif", Font.PLAIN, 32));
		jb2.setBounds(412, 250, 228, 47);
		jb2.setFont(new Font ("Serif", Font.PLAIN, 32));
		jl1.setBounds(228, 369, 328, 40);
		this.add(n1);
		this.add(n2);
		this.add(tx1);
		this.add(tx2);
		this.add(jb1);
		this.add(jb2);
		this.add(jl1);
		//eventos
		ActionListener actionSumar = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//jl1.setText("Suma: " + (Integer.parseInt (tx1.getText()) + Integer.parseInt(tx2.getText())));
				JOptionPane.showMessageDialog(jl1, "Suma: " + (Integer.parseInt (tx1.getText()) + Integer.parseInt(tx2.getText())));
			}
		};
		ActionListener actionMultiplicar = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jl1.setText("Producto: " + (Integer.parseInt(tx1.getText()) * Integer.parseInt(tx2.getText())));

			}
		};
		jb1.addActionListener(actionSumar);
		jb2.addActionListener(actionMultiplicar);
		//con lambda
//		ActionListener numero1 = e -> Integer.parseInt(tx1.getText());
//		ActionListener numero2 = e -> Integer.parseInt(tx2.getText());
//		ActionListener sumar = e -> jb1.setAction( numero1 + numero2);
//		jb1.addActionListener(sumar);
//		ActionListener multiplicacion = e -> jl1.setText("Primer evento");
//		jb1.addActionListener(multiplicacion);
		
	}
}
