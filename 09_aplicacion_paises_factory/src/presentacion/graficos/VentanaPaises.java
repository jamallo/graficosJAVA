package presentacion.graficos;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

import model.Pais;
import presentacion.adaptador.AdaptadorComboPaises;
import presentacion.adaptador.AdaptadorTablaPaises;
import service.PaisesService;
import javax.swing.JScrollPane;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class VentanaPaises extends JFrame {

	private JPanel contentPane;
	private JTable tablePaises;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPaises frame = new VentanaPaises();
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
	public VentanaPaises() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 724, 447);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(31, 158, 638, 222);
		contentPane.add(scrollPane);
		
		tablePaises = new JTable();
		scrollPane.setViewportView(tablePaises);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(181, 26, 348, 39);
		contentPane.add(scrollPane_1);
		JComboBox<String> cbListaContinentes = new JComboBox<>();
		scrollPane_1.setViewportView(cbListaContinentes);
		cbListaContinentes.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				AdaptadorTablaPaises tablaP = new AdaptadorTablaPaises((String) cbListaContinentes.getSelectedItem());
				tablePaises.setModel(tablaP);
			}
		});
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {
				cbListaContinentes.setModel(new AdaptadorComboPaises());
				
				
			}
		});
		
		
//		JButton btnMostrarPaises = new JButton("Mostrar países");
//		btnMostrarPaises.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
////				PaisesService service = new PaisesService();
//				AdaptadorTablaPaises tablaP = new AdaptadorTablaPaises((String) cbListaContinentes.getSelectedItem());
//				tablePaises.setModel(tablaP);
//				
//			}
//		});
//		btnMostrarPaises.setBounds(267, 110, 138, 21);
//		contentPane.add(btnMostrarPaises);
		
		
	}
}
