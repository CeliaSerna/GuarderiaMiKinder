package com.cursoceat.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

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
	
	
	if (nombreNino.isEmpty() || apellidosNino.isEmpty() || fechaNaciNino.isEmpty()
		|| poblacionNino.isEmpty() ) {
	String error="Los campos requeridos son obligatorios";
	request.setAttribute("error", error);//no se envia hasta que no Dispatcher
	request.getRequestDispatcher("index.jsp").forward(request, response);//no se muestra si no tengo quien lo muestre
	
	}else {
	request.getRequestDispatcher("confirmacion.jsp").forward(request, response);
	
    Nino miNino = new Nino(nombreNino, apellidosNino,fechaNaciNino,direccionNino, poblacionNino, cPostalNino, alergiasNino, alergiasAliNino, intoleranciasNino, medicacionNino, observacionesNino);
	System.out.println(miNino.toString());
    int idNino= miNino.getIdNino();
    
    Padres miPadres = new Padres(idNino, nombreApeProgenitor1, dniProgenitor1, telProgenitor1, profesionProgenitor1, emailProgenitor1);
	System.out.println(miPadres.toString());	}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
