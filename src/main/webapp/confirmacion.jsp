<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.7/dist/umd/popper.min.js" integrity="sha384-zYPOMqeu1DAVkHiLqWBUTcbYfZ8osu1Nd6Z89ify25QV9guujx43ITvfi12/QExE" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.min.js" integrity="sha384-Y4oOpwW3duJdCWv5ly8SCFYWqFDsfob/3GkgExXKV4idmbt98QcxXYs9UoXAB7BZ" crossorigin="anonymous"></script>
<title>Formulario de registro Mi Kinder</title>
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Delicious+Handrawn&display=swap" rel="stylesheet">
<link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@48,400,0,0" />
<link rel="shortcut icon" href="img/child.png" type="image/png">

<style>
	*{
	font-family: 'Delicious Handrawn', cursive;
	font-size:20px;
	}
    #limpiar{
	background-color: #d1e7dd !important;
	color: black !important; 
	border: none;
	}
	#enviar{
	background-color: #d1e7dd !important;
	color: black !important; 
	border: none;
	}
	
	#limpiar:hover{
	background-color: white !important;
	color: #89af9d !important;
	
	
	}
	#enviar:hover{
	background-color: white !important;
	color: #89af9d !important;
 
	}
</style>
</head>


<body>
<jsp:include page="header.jsp"></jsp:include>

<div class="container">


<h2>Datos del niño/a:</h2>

  <div class="col-4">
    Nombre:
    <c:out value="${param.nombre_nino}"></c:out>
    
    </div>
    
  <div class="col-4">
    Apellidos:
    <c:out value="${param.apellidos_nino}"></c:out>
  </div>
  
    
  <div class="col-2">
  Fecha de nacimiento:
   <c:out value="${param.fecha_naci_nino}"></c:out>
    
    </div>   


<!-- 2º FILA FORMULARIO -->


  <div class="col-6">
  Dirección:
   <c:out value="${param.direccion_nino}"></c:out>
    
    </div>
    
  <div class="col-4">
  Población:
   <c:out value="${param.poblacion_nino}"></c:out>
   
  </div>
  
  <div class="col-2">
   Código postal:
   <c:out value="${param.cpostal_nino}"></c:out>
   
  </div>
    


<!--3º fila formulario -->


 
  <div class="col-4">
  Alergias:
   <c:out value="${param.alergias_nino}"></c:out>
  
   
   
    </div> 
    
  <div class="col-4">
  Alergias alimentarias:
  <c:out value="${param.alergias_ali_nino}"></c:out>
   
    
  </div>
  
  <div class="col-4">
  Intolerancias:
  <c:out value="${param.intolerancias_nino}"></c:out>
  
   
  </div>

<!-- 4º fila formulario -->


  <div class="col">
  Medicación:
   <c:out value="${param.medicacion_nino}"></c:out>
   
    </div> 
    
  <div class="col">
  Observaciones:
  <c:out value="${param.observaciones_nino}"></c:out>
   
  </div>
   

<!-- datos de los padres  -->
<h2 class="pt-4">Datos de los padres:</h2>
<h3>Progenitor 1</h3>

  <div class="col-6">
  Nombre progenitor 1:
  <c:out value="${param.nombreApe_progenitor1}"></c:out>
    
    </div>
    
  <div class="col-3">
 DNI progenitor 1:
  <c:out value="${param.dni_progenitor1}"></c:out>
    
  </div>
  
  <div class="col-3">
  Teléfono progenitor 1:
  <c:out value="${param.tel_progenitor1}"></c:out>
    
    </div>  
    
     

<div class="col-5">
Profesión progenitor 1:
<c:out value="${param.profesion_progenitor1}"></c:out>
    
    
  </div>
  
  <div class="col-4">
  Email progenitor 1:
  <c:out value="${param.email_progenitor1}"></c:out>
    
    </div>  
 


<!-- PROGENITOR 2 -->

<h3 class="pt-2">Progenitor 2</h3>

  <div class="col-6">
  Nombre progenitor 2:
  <c:out value="${param.nombreApe_progenitor2}"></c:out>
    
    </div>
    
  <div class="col-3">
  DNI progenitor 2:
  <c:out value="${param.dni_progenitor2}"></c:out>
    
  </div>
  
  <div class="col-3">
  Teléfono progenitor 2:
  <c:out value="${param.tel_progenitor2}"></c:out>
    
    </div>  
    
     

<div class="col-5">
Profesión progenitor 2:
<c:out value="${param.profesion_progenitor2}"></c:out>
    
  </div>
  
  <div class="col-4">
  Email progenitor 2:
  <c:out value="${param.email_progenitor2}"></c:out>
    
    </div>  
 

<!-- PERSONAS AUTORIZADAS -->
<h2 class="pt-4">Personas autorizadas:</h2>

  <div class="col-4">
  Nombre y Apellidos persona autorizada:
  <c:out value="${param.nombreApe_autorizado1}"></c:out>
    
    </div>
    
  <div class="col-4">
  DNI persona autorizada:
  <c:out value="${param.dni_autorizado1}"></c:out>
    
  </div>
  
  <div class="col-4">
  Teléfono persona autorizada:
  <c:out value="${param.tel_autorizado1}"></c:out>
    
    </div>  

  <div class="col-4">
  Parentesco persona autorizada:
  <c:out value="${param.parentesco_autorizado1}"></c:out>
    
    </div>
    

   <!-- persona autorizada 2 -->


  <div class="col-4">
  <c:out value="${param.nombreApe_autorizado2}"></c:out>
   
    </div>
    
  <div class="col-2">
  <c:out value="${param.dni_autorizado2}"></c:out>
    
  </div>
  
  <div class="col-2">
  <c:out value="${param.tel_autorizado2}"></c:out>
    
    </div>  

  <div class="col-4">
  <c:out value="${param.parentesco_autorizado2}"></c:out>
    
    </div>
    
<!-- PERSONA AUTORIZADA 3 -->


  <div class="col-4">
  <c:out value="${param.nombreApe_autorizado3}"></c:out>
   
    </div>
    
  <div class="col-2">
  <c:out value="${param.dni_autorizado3}"></c:out>
    
  </div>
  
  <div class="col-2">
  <c:out value="${param.tel_autorizado3}"></c:out>
    
    </div>  

  <div class="col-4">
  <c:out value="${param.parentesco_autorizado3}"></c:out>
    
    </div>
    
   
   <!-- PERSONA AUTORIZADA 4 -->


  <div class="col-4">
   <c:out value="${param.nombreApe_autorizado4}"></c:out>
    
    </div>
    
  <div class="col-2">
   <c:out value="${param.dni_autorizado4}"></c:out>
     
  </div>
  
  <div class="col-2">
   <c:out value="${param.tel_autorizado4}"></c:out>
    
    </div>  

  <div class="col-4">
   <c:out value="${param.parentesco_autorizado4}"></c:out>
    
    </div>
    

<!-- BOTONES -->

<div class="row pt-4">
<h4>¿Son correctos sus datos?</h4>
  <div class="col text-center">
  
	<a href="saludo.jsp">
	<input type="submit" name="enviar" value="Sí, registrar" 
	class="btn btn-outline-success"  id="enviar" >
	</a>
	<a href="javascript: history.go(-1)">
	<input type="button" name="volver_atras" value="No, volver atrás" 
	class="btn btn-outline-success"  id="limpiar" >
	</a>
	<a href="javascript: window:print()" class="btn btn-outline-success"
	id ="imprimir" role="button">&#128424;</a>
</div>
</div>

</div>

</body>
</html>