package com.cursoceat.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.cursoceat.modell.Nino;

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
	
	}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
