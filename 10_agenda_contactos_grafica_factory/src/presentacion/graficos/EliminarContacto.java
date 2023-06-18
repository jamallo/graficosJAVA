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

import service.ContactosService;
import service.ContactosServiceFactory;

public class EliminarContacto extends JFrame {

	private JPanel contentPane;
	private JTextField numero;



	/**
	 * Create the frame.
	 */
	public EliminarContacto() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEliminarContacto = new JLabel("Eliminar Contacto");
		lblEliminarContacto.setBounds(116, 45, 197, 32);
		lblEliminarContacto.setFont(new Font("Serif", Font.BOLD, 24));
		contentPane.add(lblEliminarContacto);
		
		JLabel txTelefono = new JLabel("Telefono:");
		txTelefono.setBounds(126, 90, 45, 13);
		contentPane.add(txTelefono);
		
		numero = new JTextField();
		numero.setColumns(10);
		numero.setBounds(204, 87, 96, 19);
		contentPane.add(numero);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ContactosService contactosService = ContactosServiceFactory.getContactosService();
				contactosService.eliminarContacto(Integer.parseInt(numero.getText()));
				JOptionPane.showMessageDialog(btnEliminar, "Contacto eliminado!");
			}
		});
		btnEliminar.setBounds(161, 126, 85, 21);
		contentPane.add(btnEliminar);
		this.setVisible(true);
	}

}
