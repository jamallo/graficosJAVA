package service;

import java.util.List;

import model.Contacto;

public interface ContactosService {
	
	public boolean guardarContacto(Integer numero, String nombre, String email, int edad);
	public Contacto buscarContacto(Integer numero);
	public void eliminarContacto(Integer numero);
	public List<Contacto> contactos();

}
