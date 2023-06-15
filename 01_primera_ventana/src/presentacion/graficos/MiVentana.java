package presentacion.graficos;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MiVentana extends JFrame {

	public MiVentana() {
		//titulo de la ventana
		super("Primera ventana");
		//modificar el comportamiento del botón de cierre
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		//tamaño y posisición
		this.setBounds(120, 50, 400, 300);
		//proceso de creación de controles gráficos
		inicializarComponentes();
		//visualizar ventana
		this.setVisible(true);
		
	}
	
	private void inicializarComponentes () {
		this.setLayout(null);
		JButton jb1 = new JButton("Pulsar aquí");
		jb1.setBounds(150, 80, 150, 30);
		this.add(jb1);
		
	}
}
