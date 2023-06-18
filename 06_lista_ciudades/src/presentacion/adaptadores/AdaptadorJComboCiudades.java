package presentacion.adaptadores;

import java.util.List;

import javax.swing.DefaultComboBoxModel;

import model.Ciudad;
import service.CiudadesService;

public class AdaptadorJComboCiudades extends DefaultComboBoxModel<Ciudad>{
	List<Ciudad> ciudades;
	public AdaptadorJComboCiudades() {
		CiudadesService service = new CiudadesService();
		ciudades = service.ciudades();
		
		
	}
	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return ciudades.size();
	}
	@Override
	public Ciudad getElementAt(int index) {
		// TODO Auto-generated method stub
		return ciudades.get(index);
	}

}
