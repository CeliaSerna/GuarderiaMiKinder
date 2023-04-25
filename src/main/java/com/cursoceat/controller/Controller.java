package com.cursoceat.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

import org.apache.catalina.valves.rewrite.InternalRewriteMap.UpperCase;
import org.apache.jasper.tagplugins.jstl.core.Catch;

import com.cursoceat.modell.Nino;
import com.cursoceat.modell.Padres;

/**
 * Servlet implementation class Controller
 */
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
	//NIÑO//
	String nombreNino= request.getParameter("nombre_nino");
	String apellidosNino= request.getParameter("apellidos_nino");
	String fechaNaciNino= request.getParameter("fecha_naci_nino");
	String direccionNino= request.getParameter("direccion_nino");
	String poblacionNino= request.getParameter("poblacion_nino");
	String cPostalNino= request.getParameter("cpostal_nino");
	String alergiasNino= request.getParameter("alergias_nino");
	String alergiasAliNino= request.getParameter("alergias_ali_nino");
	String observacionesNino= request.getParameter("observaciones_nino");
	String medicacionNino= request.getParameter("medicacion_nino");
	String intoleranciasNino= request.getParameter("intolerancias_nino");
	////////////////////////////////////////////////////
	//PADRES//////
	String nombreApeProgenitor1= request.getParameter("nombreApe_progenitor1");
	String dniProgenitor1= request.getParameter("dni_progenitor1");
	String telProgenitor1= request.getParameter("tel_progenitor1");
	String profesionProgenitor1= request.getParameter("profesion_progenitor1");
	String emailProgenitor1= request.getParameter("email_progenitor1");
	/////////////////////////////////////////////////////////
	String nombreApeProgenitor2= request.getParameter("nombreApe_progenitor2");
	String dniProgenitor2= request.getParameter("dni_progenitor2");
	String telProgenitor2= request.getParameter("tel_progenitor2");
	String profesionProgenitor2= request.getParameter("profesion_progenitor2");
	String emailProgenitor2= request.getParameter("email_progenitor2");
	
	//////////////////////////////////////////////////////////////
	//AUTORIZADOS//
	String nombreApeAutorizado1= request.getParameter("nombreApe_autorizado1");
	String dniAutorizado1= request.getParameter("dni_autorizado1");
	String telAutorizado1= request.getParameter("tel_autorizado1");
	String parentescoAutorizado1= request.getParameter("parentesco_autorizado1");
	///////////////////////////////////////////////////////////////
	String nombreApeAutorizado2= request.getParameter("nombreApe_autorizado2");
	String dniAutorizado2= request.getParameter("dni_autorizado2");
	String telAutorizado2= request.getParameter("tel_autorizado2");
	String parentescoAutorizado2= request.getParameter("parentesco_autorizado2");
	/////////////////////////////////////////////////////////////
	String nombreApeAutorizado3= request.getParameter("nombreApe_autorizado3");
	String dniAutorizado3= request.getParameter("dni_autorizado3");
	String telAutorizado3= request.getParameter("tel_autorizado3");
	String parentescoAutorizado3= request.getParameter("parentesco_autorizado3");
	/////////////////////////////////////////////////////////////////
	String nombreApeAutorizado4= request.getParameter("nombreApe_autorizado4");
	String dniAutorizado4= request.getParameter("dni_autorizado4");
	String telAutorizado4= request.getParameter("tel_autorizado4");
	String parentescoAutorizado4= request.getParameter("parentesco_autorizado4");
	////////////////////////////////////////////////////////////////
	
	
	
	//leer todos los datos del formulario
	//crear mis objetos --> clase
	//
	/////array list con todos los errores//////
	ArrayList<String> listaErrores = new ArrayList<>();
	
	if (!validarDNI(dniProgenitor1)) {//se añade a la condicion 
	/////// todos los dni con el operador ||   /////////
		listaErrores.add("Verifique DNI");
	}
	
	if (!validarFechaNaci(fechaNaciNino)) {
		listaErrores.add("El niño debe tener menos de 6 años");	
	}
	
	if (!validarTel(telProgenitor1)){ // || !validarTel(telProgenitor2)
		listaErrores.add("El teléfono debe comenzar por 6 o 7 o 9");	
	}
	
if (nombreNino.isEmpty() || apellidosNino.isEmpty() || fechaNaciNino.isEmpty()
	|| poblacionNino.isEmpty() ||direccionNino.isEmpty()  
	||nombreApeProgenitor1.isEmpty() || dniProgenitor1.isEmpty()
	||telProgenitor1.isEmpty() || emailProgenitor1.isEmpty() ) {
	
	listaErrores.add("Hay campos obligatorios que están vacios");
	}
	
	if(!listaErrores.isEmpty() ) {
	request.setAttribute("listaErrores", listaErrores);//no se envia hasta que no Dispatcher
	request.getRequestDispatcher("index.jsp").forward(request, response);//no se muestra si no tengo quien lo muestre
	
	}else {
	request.getRequestDispatcher("confirmacion.jsp").forward(request, response);
	
    Nino miNino = new Nino(nombreNino, apellidosNino,fechaNaciNino,direccionNino, poblacionNino, cPostalNino, alergiasNino, alergiasAliNino, intoleranciasNino, medicacionNino, observacionesNino);
	System.out.println(miNino.toString());
    int idNino= miNino.getIdNino();
    
    Padres miPadres = new Padres(idNino, nombreApeProgenitor1, dniProgenitor1, telProgenitor1, profesionProgenitor1, emailProgenitor1);
	System.out.println(miPadres.toString());	
	
	}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
//////metodos de validación/////////	
/**
 * 
 * @param tel
 * @return boolean
 * @description validamos si el telefono tiene el formato correcto
 */
public boolean validarTel(String tel) {
	if ( (!tel.startsWith("9")&&!tel.startsWith("6") &&!tel.startsWith("7") )
		||tel.length()!=9) {
		return false;
		
	}else {
		return true;
	}
}
/**
 * 
 * @param fechaNaci
 * @return boolean
 * @description validamos si el niño tienes 6 años o menos
 *
 */
public boolean validarFechaNaci(String fechaNaci) {
	
	LocalDate fechaNaciT= LocalDate.parse(fechaNaci);
	LocalDate hoy=LocalDate.now();
	
	//Period aniosNino = Period.between(hoy,fechaNaciT);
	int anioNaciNino = fechaNaciT.getYear();
	int anioActual= hoy.getYear();
	int edad = anioActual-anioNaciNino;
	if (edad <=6) {
		return true;
	}else {
		return false;
}
	
}	
public boolean validarDNI(String dni) {
	
	String letra= "TRWAGMYFPDXBNJZSQVHLCKE";
	String intDni=dni.substring(0,8);
	
	try {	
	int dniEntero=Integer.parseInt(intDni)%23;
	
	char letraDni=  dni.toUpperCase().charAt(8);
	char letraCorrecta=letra.charAt(dniEntero);
	
	//creo la condicion para que dni tenga 9 posiciones
	//que la letraDni sea igual a la letra del algoritmo
	
	if (dni.length()==9 && letraDni == letraCorrecta) {
		return true;
	}else {
		return false;
	}
	
	}catch (Exception e) {
	return false;

}	finally {
	
}
}
public String pasarPriMayus(String texto) {
	texto=texto.toLowerCase();//paso todo el texto a minisculas
	String[] arrayTexto=texto.split(" ");//si es mas de una palabra
	String temp="";//creo la variable que se formara por cada interacion
	for (int i=0; i <arrayTexto.length; i++) {
	arrayTexto[i]=arrayTexto[i].substring(0,1).toUpperCase() 
		+ arrayTexto[i].substring(1);
		
	temp+=arrayTexto[i] + " ";//lo acumulamos en temp
	}
	return temp.trim();//enviamos temp ya formateado 
	//y quitando espacios del principio y el final


}



}