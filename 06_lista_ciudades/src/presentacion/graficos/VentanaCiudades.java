package presentacion.graficos;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import model.Ciudad;
import presentacion.adaptadores.AdaptadorJComboCiudades;
import presentacion.adaptadores.AdaptadorListaCiudades;

public class VentanaCiudades extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaCiudades frame = new VentanaCiudades();
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
	public VentanaCiudades() {
		JList<Ciudad> lstCiudades = new JList<>();
		JComboBox<Ciudad> cbCiudades = new JComboBox<>();
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {
				//asocia a la lista su adaptador
				lstCiudades.setModel(new AdaptadorListaCiudades());
				cbCiudades.setModel(new AdaptadorJComboCiudades());
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Lista de Ciudades");
		lblNewLabel.setBounds(175, 10, 87, 13);
		contentPane.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 29, 116, 89);
		contentPane.add(scrollPane);
		
		
		scrollPane.setColumnHeaderView(lstCiudades);
		
		JButton btnNewButton = new JButton("Ver datos");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ciudad ciudad = lstCiudades.getSelectedValue();
				JOptionPane.showMessageDialog(btnNewButton, "Ciudad: " + ciudad.getNombre() + "\n Temperatura" + ciudad.getTemperatura());
			}
		});
		btnNewButton.setBounds(26, 140, 85, 21);
		contentPane.add(btnNewButton);
		
		
		cbCiudades.setBounds(175, 32, 87, 27);
		contentPane.add(cbCiudades);
		
		JButton btnNewButton_2 = new JButton("Ver datos");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ciudad ciudad = (Ciudad) cbCiudades.getSelectedItem();
				JOptionPane.showMessageDialog(btnNewButton_2, "Ciudad: " + ciudad.getNombre() + "\n Temperatura" + ciudad.getTemperatura());
			}
		});
		btnNewButton_2.setBounds(175, 140, 85, 21);
		contentPane.add(btnNewButton_2);
	}
}
