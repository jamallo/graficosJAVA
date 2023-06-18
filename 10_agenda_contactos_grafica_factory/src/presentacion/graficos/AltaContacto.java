package presentacion.graficos;

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

public class AltaContacto extends JFrame {


	private JPanel contentPane;
	private JTextField numero;
	private JTextField nombre;
	private JTextField email;
	private JTextField edad;


	/**
	 * Create the frame.
	 */
	public AltaContacto() {
		setTitle("Nuevo Contacto");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel txNuevoContacto = new JLabel("Nuevo Contacto");
		txNuevoContacto.setFont(new Font("Serif", Font.BOLD, 24));
		txNuevoContacto.setBounds(122, 41, 181, 22);
		contentPane.add(txNuevoContacto);
		
		JLabel txTelefono = new JLabel("Telefono:");
		txTelefono.setBounds(122, 87, 45, 13);
		contentPane.add(txTelefono);
		
		JLabel txNombre = new JLabel("Nombre:");
		txNombre.setBounds(122, 110, 45, 13);
		contentPane.add(txNombre);
		
		JLabel txEmail = new JLabel("Email:");
		txEmail.setBounds(122, 133, 45, 13);
		contentPane.add(txEmail);
		
		JLabel txEdad = new JLabel("Edad:");
		txEdad.setBounds(122, 156, 45, 13);
		contentPane.add(txEdad);
		
		numero = new JTextField();
		numero.setBounds(200, 84, 96, 19);
		contentPane.add(numero);
		numero.setColumns(10);
		
		nombre = new JTextField();
		nombre.setColumns(10);
		nombre.setBounds(200, 107, 96, 19);
		contentPane.add(nombre);
		
		email = new JTextField();
		email.setColumns(10);
		email.setBounds(200, 130, 96, 19);
		contentPane.add(email);
		
		edad = new JTextField();
		edad.setColumns(10);
		edad.setBounds(200, 153, 96, 19);
		contentPane.add(edad);
		
		JButton btnNewButton = new JButton("Añadir");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ContactosService contactosService = ContactosServiceFactory.getContactosService();
				if(contactosService.guardarContacto(
						Integer.parseInt(numero.getText()), 
						nombre.getText(), 
						email.getText() , 
						Integer.parseInt(edad.getText()))) {
					JOptionPane.showMessageDialog(btnNewButton, "Contacto añadido!");
				}else {
					JOptionPane.showMessageDialog(btnNewButton,"Teléfono repetido, el contacto no se ha añadido!");
				}
			}
		});
		btnNewButton.setBounds(211, 182, 85, 21);
		contentPane.add(btnNewButton);
		
		this.setVisible(true);
	}

}
