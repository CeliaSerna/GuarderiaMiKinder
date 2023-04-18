package com.cursoceat.modell;

public class Autorizados extends DatosGenerales {
	
	private String relacion;

	public Autorizados(int idNino, String nombreApellidos, String dni, String telefono, String relacion) {
		super(idNino, nombreApellidos, dni, telefono);
		this.relacion = relacion;
	}

	public Autorizados() {
		super();
	}

	public String getRelacion() {
		return relacion;
	}

	public void setRelacion(String relacion) {
		this.relacion = relacion;
	}

	@Override
	public String toString() {
		return "Autorizados [relacion=" + relacion + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	

}
