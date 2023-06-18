package presentacion.graficos;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import service.ContactosService;

public class Menu extends JFrame {

	private JPanel contentPane;

	
	static ContactosService contactosService=new ContactosService();
	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		setTitle("Agenda contacto");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNuevoContacto = new JButton("Nuevo contacto");
		btnNuevoContacto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new AltaContacto();
				
			}
		});
		btnNuevoContacto.setBounds(51, 65, 109, 21);
		contentPane.add(btnNuevoContacto);
		
		JLabel lblNewLabel = new JLabel("Menu: ");
		lblNewLabel.setBounds(139, 16, 73, 32);
		lblNewLabel.setFont(new Font("Serif", Font.BOLD, 24));
		contentPane.add(lblNewLabel);
		
		JButton btnBuscarContacto = new JButton("Buscar contacto");
		btnBuscarContacto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new BuscarContacto();
			}
		});
		btnBuscarContacto.setBounds(199, 65, 109, 21);
		contentPane.add(btnBuscarContacto);
		
		JButton btnEliminarContacto = new JButton("Eliminar contacto");
		btnEliminarContacto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new EliminarContacto();
			}
		});
		btnEliminarContacto.setBounds(51, 96, 109, 21);
		contentPane.add(btnEliminarContacto);
		
		JButton btnMostrarNombres = new JButton("Mostrar nombres");
		btnMostrarNombres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new MostrarContactos();
			}
		});
		btnMostrarNombres.setBounds(199, 96, 109, 21);
		contentPane.add(btnMostrarNombres);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//para cerrar una ventana, métido dispose() sin parámetros de la clase ventana
				Menu.this.dispose();
			}
		});
		btnSalir.setBounds(124, 138, 109, 21);
		contentPane.add(btnSalir);
	}

}
