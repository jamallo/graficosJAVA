package model;

public class Ciudad {
	private String nombre;
	private double temperatura;
	public Ciudad(String nombre, double temperatura) {
		super();
		this.nombre = nombre;
		this.temperatura = temperatura;
	}
	
	public Ciudad() {
		super();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return nombre;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}

}
