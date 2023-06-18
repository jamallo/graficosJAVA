package presentacion.graficos;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import model.Contacto;
import service.ContactosService;
import service.ContactosServiceFactory;

public class MostrarContactos extends JFrame {

	private JPanel contentPane;
	private JTable table;



	/**
	 * Create the frame.
	 */
	public MostrarContactos() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel lblMostrarContacto = new JLabel("Mostrar contacto");
		lblMostrarContacto.setFont(new Font("Serif", Font.BOLD, 24));
		lblMostrarContacto.setBounds(124, 11, 185, 32);
		contentPane.add(lblMostrarContacto);
		
		String[] columnNames = {"Nombre", "Teléfono", "Email", "Edad"};
		DefaultTableModel model = new DefaultTableModel(columnNames, 0);
		
		table = new JTable(model);
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(30, 53, 385, 160);
		contentPane.add(scrollPane);
		
		JButton btnMostrar = new JButton("Mostrar");
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ContactosService contactosService = ContactosServiceFactory.getContactosService();
				List<Contacto> contactos=contactosService.contactos();
				//Limpiar la tabla antes de agregar los datos
				model.setRowCount(0);
				//Agregar los datos de los contactos al modelo de tabla
				for(Contacto c:contactos) {
					Object [] rowData = {c.getNombre(), c.getTelefono(), c.getEmail(), c.getEdad()};
					model.addRow(rowData);
				}
				
			}
		});
		btnMostrar.setBounds(166, 232, 85, 21);
		contentPane.add(btnMostrar);
		this.setVisible(true);
	}
}
