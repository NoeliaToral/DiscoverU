<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<spring:url value="static/css/style.css" var="estilo" />
<link href="${estilo}" rel="stylesheet" />

<spring:url value="static/css/boostrap/bootstrap.css" var="estilo2" />
<link href="${estilo2}" rel="stylesheet" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Datos contacto</title>
</head>
<body>
<img src="static/css/images/fondo.png" class="fondo">
<ul>
		<li class="cabeceraLi"><a href="#home">Insertar</a></li>
		<li><a class="blancoA" href="#news">Actualizar</a></li>
		<li><a class="blancoA" href="#news">Eliminar</a></li>
		<li class="dropdown"><a href="javascript:void(0)" class="dropbtn">Listar</a>
			<div class="dropdown-content">
				<a class="blancoA" href="#">Listar todos</a> <a href="#">Listar alfabeticamente</a>
				<a class="blancoA" href="#">Listar por fecha de alta</a>
			</div></li>
	</ul>
	<div class="container">
<center>
<div class="cuaderno2">
				<table class="table">
	<tr>
	<th>Nombre</th>
	<th>Primer apellido</th>
	<th>Segundo apellido</th>
	<th>DNI</th>
	<th>Fecha de nacimiento</th>
	<th>Direccion</th>
	<th>Código postal</th>
	<th>Localidad</th>
	<th>Provincia</th>
	<th>Teléfonos</th>
	</tr>
	
	<tr>
	<td><c:out value="${persona.nombre}"></c:out></td>
	<td><c:out value="${persona.apellido1}"></c:out></td>
	<td><c:out value="${persona.apellido2}"></c:out></td>
	<td><c:out value="${persona.dni}"></c:out></td>
	<td><c:out value="${persona.fechaNacimiento}"></c:out></td>
		<c:forEach items="${persona.direccioneses}" var="direccion">
			<td><c:out value="${direccion.direccion}"/></td>
			<td><c:out value="${direccion.codPostal}"/></td>
			<td><c:out value="${direccion.localidad}"/></td>
			<td><c:out value="${direccion.provincia}"/></td>
		</c:forEach>
		<td>
			<select>
		<c:forEach items="${persona.telefonoses}" var="telefono">
			<option><c:out value="${telefono.telefono}"></c:out></option>
		</c:forEach>
			</select>
		</td>
		
	</tr>
	
	</table>
	</div>
	</center>
</div>
	<!--Footer-->
	<footer class="page-footer font-small stylish-color-dark pt-4 mt-4">

	<!--Footer Links-->
	<div class="container text-center text-md-left">

		<!-- Footer links -->
		<div class="row text-center text-md-left mt-3 pb-3">

			<!--First column-->
			<div class="col-md-3 col-lg-3 col-xl-3 mx-auto mt-3">
				<h6 class="text-uppercase mb-4 font-weight-bold">Grupo 3</h6>
				<p>¿Se te ha perdido la cabeza? Esta agenda te sirve para
					encontratela</p>
			</div>
			<!--/.First column-->

			<hr class="w-100 clearfix d-md-none">

			<!--Second column-->
			<div class="col-md-2 col-lg-2 col-xl-2 mx-auto mt-3">
				<h6 class="text-uppercase mb-4 font-weight-bold">Productos</h6>
				<p>
					<a class="blancoA" href="#!">Cuaderno</a>
				</p>
				<p>
					<a class="blancoA" href="#!">Boligrafo</a>
				</p>
				<p>
					<a class="blancoA" href="#!">Fluorescente</a>
				</p>
				<p>
					<a class="blancoA" href="#!">Hoja</a>
				</p>
			</div>
			<!--/.Second column-->

			<hr class="w-100 clearfix d-md-none">

			<!--Third column-->
			<div class="col-md-3 col-lg-2 col-xl-2 mx-auto mt-3">
				<h6 class="text-uppercase mb-4 font-weight-bold">Útiles links</h6>
				<p>
					<a class="blancoA" href="#!">Calendario 2018</a>
				</p>
				<p>
					<a class="blancoA" href="#!">Calendario 2017</a>
				</p>
				<p>
					<a class="blancoA" href="#!">Calendario 2019</a>
				</p>
				<p>
					<a class="blancoA" href="#!">Calendrio 2016</a>
				</p>
			</div>
			<!--/.Third column-->

			<hr class="w-100 clearfix d-md-none">

			<!--Fourth column-->
			<div class="col-md-4 col-lg-3 col-xl-3 mx-auto mt-3">
				<h6 class="text-uppercase mb-4 font-weight-bold">Contáctanos</h6>
				<p>
					<i class="fa fa-home mr-3"></i> Raul Soriano
				</p>
				<p>
					<i class="fa fa-envelope mr-3"></i> Javier Romero
				</p>
				<p>
					<i class="fa fa-phone mr-3"></i>Noelia Toral Jiménez
				</p>

			</div>
			<!--/.Fourth column-->

		</div>
		<!-- Footer links -->

		<hr>

		<div class="row py-3 d-flex align-items-center">

			<!--Grid column-->
			<div class="col-md-8 col-lg-8">

				<!--Copyright-->
				<p class="text-center text-md-left ">2018 Template by Grupo 3</p>
				<!--/.Copyright-->

			</div>
			<!--Grid column-->

			<!--Grid column-->
			<div class="col-md-4 col-lg-4 ml-lg-0">

				<!--Social buttons-->
				<div class="text-center text-md-right">
					<ul class="list-unstyled list-inline">
						<li class="list-inline-item"><a
							class="btn-floating btn-sm rgba-white-slight mx-1"><i
								class="fa fa-facebook"></i></a></li>
						<li class="list-inline-item"><a
							class="btn-floating btn-sm rgba-white-slight mx-1"><i
								class="fa fa-twitter"></i></a></li>
						<li class="list-inline-item"><a
							class="btn-floating btn-sm rgba-white-slight mx-1"><i
								class="fa fa-google-plus"></i></a></li>
						<li class="list-inline-item"><a
							class="btn-floating btn-sm rgba-white-slight mx-1"><i
								class="fa fa-linkedin"></i></a></li>
					</ul>
				</div>
				<!--/.Social buttons-->

			</div>
			<!--Grid column-->

		</div>

	</div>

	</footer>
	<!--/.Footer-->
</body>
</html>