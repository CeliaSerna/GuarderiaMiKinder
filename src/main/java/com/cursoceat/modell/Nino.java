package com.cursoceat.modell;

public class Nino{
	
	static int id;//todos los niños
	protected int idNino;//id de un objeto niño que se crea
	private String nombreNino;
	private String apellidosNino;
	private String direccionNino;
	private String poblacionNino;
	private String cPostalNino;
	private String fechaNaciNino;
	
	private String alergiasNino;
	private String alergiasAliNino;
	private String intoleranciasNino;
	private String medicacionNino;
	private String observacionesNino;

public Nino(String nombreNino, String apellidosNino, String direccionNino, String poblacionNino,
			String cPostalNino, String fechaNaciNino, String alergiasNino, String alergiasAliNino,
			String intoleranciasNino, String medicacionNino, String observacionesNino) {
		
		this.nombreNino = nombreNino;
		this.apellidosNino = apellidosNino;
		this.direccionNino = direccionNino;
		this.poblacionNino = poblacionNino;
		this.cPostalNino = cPostalNino;
		this.fechaNaciNino = fechaNaciNino;
		this.alergiasNino = alergiasNino;
		this.alergiasAliNino = alergiasAliNino;
		this.intoleranciasNino = intoleranciasNino;
		this.medicacionNino = medicacionNino;
		this.observacionesNino = observacionesNino;
		id++;
		idNino=id ;
}


public Nino() {

}


public int getIdNino() {
	return idNino;
}


public void setIdNino(int idNino) {
	this.idNino = idNino;
}


public String getNombreNino() {
	return nombreNino;
}

public String getApellidosNino() {
	return apellidosNino;
}

public String getDireccionNino() {
	return direccionNino;
}

public String getPoblacionNino() {
	return poblacionNino;
}

public String getcPostalNino() {
	return cPostalNino;
}

public String getFechaNaciNino() {
	return fechaNaciNino;
}

public String getAlergiasNino() {
	return alergiasNino;
}

public String getAlergiasAliNino() {
	return alergiasAliNino;
}

public String getIntoleranciasNino() {
	return intoleranciasNino;
}

public String getMedicacionNino() {
	return medicacionNino;
}

public String getObservacionesNino() {
	return observacionesNino;
}



public void setNombreNino(String nombreNino) {
	this.nombreNino = nombreNino;
}

public void setApellidosNino(String apellidosNino) {
	this.apellidosNino = apellidosNino;
}

public void setDireccionNino(String direccionNino) {
	this.direccionNino = direccionNino;
}

public void setPoblacionNino(String poblacionNino) {
	this.poblacionNino = poblacionNino;
}

public void setcPostalNino(String cPostalNino) {
	this.cPostalNino = cPostalNino;
}

public void setFechaNaciNino(String fechaNaciNino) {
	this.fechaNaciNino = fechaNaciNino;
}

public void setAlergiasNino(String alergiasNino) {
	this.alergiasNino = alergiasNino;
}

public void setAlergiasAliNino(String alergiasAliNino) {
	this.alergiasAliNino = alergiasAliNino;
}

public void setIntoleranciasNino(String intoleranciasNino) {
	this.intoleranciasNino = intoleranciasNino;
}

public void setMedicacionNino(String medicacionNino) {
	this.medicacionNino = medicacionNino;
}

public void setObservacionesNino(String observacionesNino) {
	this.observacionesNino = observacionesNino;
}

@Override
public String toString() {
	return "Niño [idNiño= "+ idNino + ", nombreNiño=" + nombreNino + ", apellidosNiño=" + apellidosNino + ", direccionNiño=" + direccionNino
			+ ", poblacionNiño=" + poblacionNino + ", cPostalNiño=" + cPostalNino + ", fechaNacimientoNiño=" + fechaNaciNino
			+ ", alergiasNiño=" + alergiasNino + ", alergiasAlimentariasNiño=" + alergiasAliNino + ", intoleranciasNiño="
			+ intoleranciasNino + ", medicacionNiño=" + medicacionNino + ", observacionesNiño=" + observacionesNino
			+ "]";
}


	
	

	
	
	
	
}