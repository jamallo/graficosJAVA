package presentacion.adaptador;

import java.util.List;

import javax.swing.DefaultComboBoxModel;

import model.Pais;
import service.PaisesService;

public class AdaptadorComboPaises extends DefaultComboBoxModel<String>{
	
	
	List<String> continentes;
	
	public AdaptadorComboPaises() {
	PaisesService service = new PaisesService();
	continentes = service.continentes();
	}
	
	@Override
	public int getSize() {
		return continentes.size();
	}
	@Override
	public String getElementAt(int index) {
		return continentes.get(index);
	}
	
	
	

}
