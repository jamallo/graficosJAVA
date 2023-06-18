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

import model.Contacto;
import service.ContactosService;

public class BuscarContacto extends JFrame {

	private JPanel contentPane;
	private JTextField numero;



	/**
	 * Create the frame.
	 */
	public BuscarContacto() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBuscarContacto = new JLabel("Buscar contacto");
		lblBuscarContacto.setFont(new Font("Serif", Font.BOLD, 24));
		lblBuscarContacto.setBounds(117, 42, 173, 32);
		contentPane.add(lblBuscarContacto);
		
		JLabel txTelefono = new JLabel("Telefono:");
		txTelefono.setBounds(117, 93, 45, 13);
		contentPane.add(txTelefono);
		
		numero = new JTextField();
		numero.setColumns(10);
		numero.setBounds(195, 90, 96, 19);
		contentPane.add(numero);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ContactosService contactosService = new ContactosService();
				Contacto contacto;
				contacto=contactosService.buscarContacto(Integer.parseInt(numero.getText()));
				if(contacto!=null) {
					JOptionPane.showMessageDialog(btnBuscar, contacto.getNombre());
				}else {
					JOptionPane.showMessageDialog(btnBuscar, "El contacto no existe");
				}
				
			}
		});
		btnBuscar.setBounds(152, 129, 85, 21);
		contentPane.add(btnBuscar);
		this.setVisible(true);
	}

}
