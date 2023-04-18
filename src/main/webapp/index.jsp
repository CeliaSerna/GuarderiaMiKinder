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

<link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200" />
<link rel="shortcut icon" href="img/child.png" type="image/png">

<style>
	input:hover, textarea:hover {
  	background-color:#f4fcf8 !important;
	}
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
	color: #85a093 !important;
	
	}
	#enviar:hover{
	background-color: white !important;
	color: #85a093 !important;
 
	}
</style>
</head>


<body>
<jsp:include page="header.jsp"></jsp:include>

<div class="container">

<!-- imprime error si los campos no estan rellenos -->
<p class="text-danger">
<c:out value="${error }"></c:out>
</p>
<!--      *********************************      -->

<form action="Controller" method="get">
<p>(*) Obligatorios</p>
<h2>Datos del niño/a:</h2>
<div class="row">
  <div class="col-4">
    <input type="text" class="form-control text-capitalize" name="nombre_nino" 
    placeholder="Nombre*" aria-label="Nombre del niño" required
    value="${param.nombre_nino}">
    </div>
    
  <div class="col-4">
    <input type="text" class="form-control text-capitalize" name="apellidos_nino"
      placeholder="Apellidos*" aria-label="Apellidos del niño" required
      value="${param.apellidos_nino}">
  </div>
  
  <div class="col-2 text-end pt-lg-2">
  <label for="fecha_naci">Fecha de nacimiento*:</label>
  </div>
  
  <div class="col-2">
    <input type="date" class="form-control" name="fecha_naci_nino"
     aria-label="Fecha de nacimiento del niño" required
     value="${param.fecha_naci_nino}">
    </div>   
</div>

<!-- 2º FILA FORMULARIO -->

<div class="row pt-4">
  <div class="col-6">
    <input type="text" class="form-control text-capitalize" name="direccion_nino" 
    placeholder="Dirección*" aria-label="Dirección del niño" required
    value="${param.direccion_nino}">
    
    </div>
    
  <div class="col-4">
    <input type="text" class="form-control text-capitalize" name="poblacion_nino"
      placeholder="Población*" aria-label="Población del niño" required
      value="${param.poblacion_nino}">
  </div>
  
  <div class="col-2">
   <input type="text" class="form-control" name="cpostal_nino" 
    placeholder="Código Postal" aria-label="Codigo postal del niño"
    value="${param.cpostal_nino}">
  </div>
    
</div>

<!--3º fila formulario -->

<div class="row pt-4">
 
  <div class="col-4">
  
    <input type="text" class="form-control" name="alergias_nino" 
    placeholder="Alergias" aria-label="Alergias del niño"
    value="${param.alergias_nino}"> 
   
    </div> 
    
  <div class="col-4">
 
    <input type="text" class="form-control" name="alergias_ali_nino" 
     placeholder="Alergias alimentarias" aria-label="Alergias alimentarias del niño"
     value="${param.alergias_ali_nino}">
    
  </div>
  
  <div class="col-4">
 
  <input type="text" class="form-control" name="intolerancias_nino" 
    placeholder="Intolerancias" aria-label="Intolerancias del niño"
    value="${param.intolerancias_nino}">
   
  </div>
    
</div>

<!-- 4º fila formulario -->

<div class="row pt-4">
  <div class="col">
  <!-- NO PUEDE HABER ESPACIO ENTRE <textarea></textarea> -->
    <textarea class="form-control" name="medicacion_nino" rows="3" placeholder="Medicación" 
    aria-label="Medicación del niño"  value="${param.medicacion_nino}"></textarea>
    </div> 
    
  <div class="col">
  
    <textarea class="form-control" name="observaciones_nino" rows="3"  placeholder="Observaciones"
    aria-label="Observaciones sobre el niño"  value="${param.observaciones_nino}"></textarea>
  </div>
   
</div>
<!-- datos de los padres  -->
<h2 class="pt-4">Datos de los padres:</h2>
<h3>Progenitor 1</h3>
<div class="row">
  <div class="col-6">
    <input type="text" class="form-control text-capitalize" name="nombreApe_progenitor1" required
    placeholder="Nombre y Apellidos*" aria-label="Nombre y apellidos del progenitor 1"
     value="${param.nombreApe_progenitor1}">
    </div>
    
  <div class="col-3">
    <input type="text" class="form-control text-uppercase" name="dni_progenitor1" required
      placeholder="DNI*" aria-label="Dni del progenitor 1"
       value="${param.dni_progenitor1}">
  </div>
  
  <div class="col-3">
    <input type="tel" class="form-control" name="tel_progenitor1" required
     placeholder="Teléfono*" aria-label="Teléfono del progenitor 1"
      value="${param.tel_progenitor1}">
    </div>  
    
     
</div>
<div class="row pt-4">
<div class="col-5">
    <input type="text" class="form-control text-capitalize" name="profesion_progenitor1" required
      placeholder="Profesión" aria-label="Profesión del progenitor 1"
       value="${param.profesion_progenitor1}">
  </div>
  
  <div class="col-4">
    <input type="email" class="form-control" name="email_progenitor1" required
     placeholder="Email*" aria-label="Email del progenitor 1"
      value="${param.email_progenitor1}">
    </div>  
 
 </div>

<!-- PROGENITOR 2 -->

<h3 class="pt-2">Progenitor 2</h3>
<div class="row">
  <div class="col-6">
    <input type="text" class="form-control" name="nombreApe_progenitor2" 
    placeholder="Nombre y Apellidos" aria-label="Nombre y apellidos del progenitor 2">
    </div>
    
  <div class="col-3">
    <input type="text" class="form-control" name="dni_progenitor2"
      placeholder="DNI" aria-label="Dni del progenitor 2">
  </div>
  
  <div class="col-3">
    <input type="tel" class="form-control" name="tel_progenitor2"
     placeholder="Teléfono" aria-label="Teléfono del progenitor 2">
    </div>  
    
     
</div>
<div class="row pt-4">
<div class="col-5">
    <input type="text" class="form-control" name="profesion_progenitor2"
      placeholder="Profesión" aria-label="Profesión del progenitor 2">
  </div>
  
  <div class="col-4">
    <input type="email" class="form-control" name="email_progenitor2"
     placeholder="Email" aria-label="Email del progenitor 2">
    </div>  
 
 </div>
<!-- PERSONAS AUTORIZADAS -->
<h2 class="pt-4">Personas autorizadas:</h2>
<div class="row">
  <div class="col-4">
    <input type="text" class="form-control text-capitalize" name="nombreApe_autorizado1" 
    placeholder="Nombre y Apellidos*" aria-label="Nombre y apellidos de la persona autorizada"
     value="${param.nombreApe_autorizado1}">
    </div>
    
  <div class="col-2">
    <input type="text" class="form-control text-uppercase" name="dni_autorizado1"
      placeholder="DNI*" aria-label="Dni de la persona autorizada"
       value="${param.dni_autorizado1}">
  </div>
  
  <div class="col-2">
    <input type="tel" class="form-control" name="tel_autorizado1"
     placeholder="Teléfono*" aria-label="Teléfono de la persona autorizada"
      value="${param.tel_autorizado1}">
    </div>  

  <div class="col-4">
    <input type="text" class="form-control text-capitalize" name="parentesco_autorizado1" 
    placeholder="Parentesco con el niño/a*" aria-label="parentesco de la persona autorizada con el niño"
     value="${param.parentesco_autorizado1}">
    </div>
    
   </div>
   <!-- persona autorizada 2 -->

<div class="row">
  <div class="col-4">
    <input type="text" class="form-control" name="nombreApe_autorizado2" 
    placeholder="Nombre y Apellidos" aria-label="Nombre y apellidos de la persona autorizada">
    </div>
    
  <div class="col-2">
    <input type="text" class="form-control" name="dni_autorizado2"
      placeholder="DNI" aria-label="Dni de la persona autorizada">
  </div>
  
  <div class="col-2">
    <input type="tel" class="form-control" name="tel_autorizado2"
     placeholder="Teléfono" aria-label="Teléfono de la persona autorizada">
    </div>  

  <div class="col-4">
    <input type="text" class="form-control" name="parentesco_autorizado2" 
    placeholder="Parentesco con el niño/a" aria-label="parentesco de la persona autorizada con el niño">
    </div>
    
   </div>
<!-- PERSONA AUTORIZADA 3 -->

<div class="row">
  <div class="col-4">
    <input type="text" class="form-control" name="nombreApe_autorizado3" 
    placeholder="Nombre y Apellidos" aria-label="Nombre y apellidos de la persona autorizada">
    </div>
    
  <div class="col-2">
    <input type="text" class="form-control" name="dni_autorizado3"
      placeholder="DNI" aria-label="Dni de la persona autorizada">
  </div>
  
  <div class="col-2">
    <input type="tel" class="form-control" name="tel_autorizado3"
     placeholder="Teléfono" aria-label="Teléfono de la persona autorizada">
    </div>  

  <div class="col-4">
    <input type="text" class="form-control" name="parentesco_autorizado3" 
    placeholder="Parentesco con el niño/a" aria-label="parentesco de la persona autorizada con el niño">
    </div>
    
   </div>
   
   <!-- PERSONA AUTORIZADA 4 -->

<div class="row">
  <div class="col-4">
    <input type="text" class="form-control" name="nombreApe_autorizado4" 
    placeholder="Nombre y Apellidos" aria-label="Nombre y apellidos de la persona autorizada">
    </div>
    
  <div class="col-2">
    <input type="text" class="form-control" name="dni_autorizado4"
      placeholder="DNI" aria-label="Dni de la persona autorizada">
  </div>
  
  <div class="col-2">
    <input type="tel" class="form-control" name="tel_autorizado4"
     placeholder="Teléfono" aria-label="Teléfono de la persona autorizada">
    </div>  

  <div class="col-4">
    <input type="text" class="form-control" name="parentesco_autorizado4" 
    placeholder="Parentesco con el niño/a" aria-label="parentesco de la persona autorizada con el niño">
    </div>
    
   </div>

<!-- BOTONES -->

<div class="row pt-4">
  <div class="col text-center">
	<input type="submit" name="enviar" value="Registrar" 
	class="btn btn-outline-success"  id="enviar" >
	<input type="reset" name="limpiar" value="Limpiar" 
	class="btn btn-outline-success"  id="limpiar">

</div>
</div>

</form>
<!-- TERMINA EL FORMULARIO -->

</div>


</body>
</html>