package com.cursoceat.modell;

public class Padres extends DatosGenerales{

	private String profesion;
	private String email;
	
	public Padres(int idNino, String nombreApellidos, String dni, String telefono, String profesion, String email) {
		super(idNino, nombreApellidos, dni, telefono);
		this.profesion = profesion;
		this.email = email;
	}

	public Padres() {
		super();
	}

	public String getProfesion() {
		return profesion;
	}

	public String getEmail() {
		return email;
	}

	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return super.toString()+ "Padres [profesion=" + profesion + ", email=" + email + "]";
	}
	
	


	
	
	
}
