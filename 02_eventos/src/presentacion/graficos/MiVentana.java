package presentacion.graficos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MiVentana extends JFrame {

	public MiVentana() {
		//titulo de la ventana
		super("Ventana eventos");
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
		JButton jb1 = new JButton("Pulsar aquí");
		JLabel jl1 = new JLabel();
		jb1.setBounds(150, 80, 150, 30);
		jl1.setBounds(400, 80, 200, 30);
		this.add(jb1);
		this.add(jl1);
		//eventos
		/*ActionListener action = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jl1.setText("Primer evento");
				
			}
		};*/
		//con lambda
		ActionListener action = e -> jl1.setText("Primer evento");
		jb1.addActionListener(action);
		
	}
}
