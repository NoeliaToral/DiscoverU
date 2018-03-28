<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<spring:url value="static/css/style.css" var="estilo" />
<link href="${estilo}" rel="stylesheet" />

<spring:url value="static/css/boostrap/bootstrap.css" var="estilo2" />
<link href="${estilo2}" rel="stylesheet" />

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Listado</title>
</head>
<body>
		<form action="comprarProducto" method ="post">
					<c:forEach items="${listado}" var="persona">
						<tr>
							
							<td><c:out value="${persona.idProductos}"></c:out></td>
							<td><c:out value="${persona.nombreProducto}"></c:out></td>
							<td><c:out value="${persona.descripcion}"></c:out></td>
							<td><c:out value="${persona.precio}"></c:out></td>
							<td><img src="${persona.url}"></img></td>
							<td><c:out value="${persona.material}"></c:out></td>
							<td><c:out value="${persona.talla}"></c:out></td>
							<td></td>
							
						</tr>
						<input type="hidden" name=idProducto value="${persona.idProductos}">
						<input type="submit" name="comprar" value="comprar">
					</c:forEach>
				</form>
</body>
</html>