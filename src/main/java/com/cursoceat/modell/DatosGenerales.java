package com.cursoceat.modell;

public class DatosGenerales {

	protected int idNino;
	protected String nombreApellidos;
	protected String dni;
	protected String telefono;
	
public DatosGenerales(int idNino, String nombreApellidos, String dni, String telefono) {
	
		this.idNino = idNino;
		this.nombreApellidos = nombreApellidos;
		this.dni = dni;
		this.telefono = telefono;
	}

public DatosGenerales() {
	
}

public int getIdNino() {
	return idNino;
}

public String getNombreApellidos() {
	return nombreApellidos;
}

public String getDni() {
	return dni;
}

public String getTelefono() {
	return telefono;
}

public void setIdNino(int idNino) {
	this.idNino = idNino;
}

public void setNombreApellidos(String nombreApellidos) {
	this.nombreApellidos = nombreApellidos;
}

public void setDni(String dni) {
	this.dni = dni;
}

public void setTelefono(String telefono) {
	this.telefono = telefono;
}

@Override
public String toString() {
	return "Datos generales [idNiño=" + idNino + ", Nombre y Apellidos=" + nombreApellidos + ", DNI=" + dni + ", Telefono="
			+ telefono + "]";
}




	
	
	
}
