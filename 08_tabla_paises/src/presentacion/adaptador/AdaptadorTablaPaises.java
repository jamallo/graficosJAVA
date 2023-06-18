package presentacion.adaptador;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import model.Pais;
import service.PaisesService;

public class AdaptadorTablaPaises extends AbstractTableModel{
	
	List<Pais> paises;
	public AdaptadorTablaPaises(String continente) {
		PaisesService service = new PaisesService();
		paises = service.paisesContinente(continente);
	}

	@Override
	public int getRowCount() {
		return paises.size();
	}

	@Override
	public int getColumnCount() {
		return 5;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		switch (columnIndex) {
		case 0: 		
			return paises.get(rowIndex).getCodigoPais();
		case 1:	
			return paises.get(rowIndex).getNombre();
		case 2: 		
			return paises.get(rowIndex).getContinente();
		case 3:	
			return paises.get(rowIndex).getPoblacion();
		case 4:	
			return paises.get(rowIndex).getBandera();	
		default:
			throw new IllegalArgumentException("Unexpected value: " + columnIndex);
		}	
	}

	@Override
	public String getColumnName(int column) {
		switch (column) {
		case 0: 		
			return "codigoPais";
		case 1:	
			return "nombre";
		case 2: 		
			return "continente";
		case 3:	
			return "poblacion";
		case 4:	
			return "bandera";	
		default:
			throw new IllegalArgumentException("Unexpected value: " + column);
		}
	}

	@Override
	public Class<?> getColumnClass(int columnIndex) {
		switch (columnIndex) {
		case 0: 		
			return String.class;
		case 1:	
			return String.class;
		case 2: 		
			return String.class;
		case 3:	
			return Long.class;
		case 4:	
			return String.class;	
		default:
			throw new IllegalArgumentException("Unexpected value: " + columnIndex);
		}
	}

}
