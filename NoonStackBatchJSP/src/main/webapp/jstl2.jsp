<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL Demo 2</title>
</head>
<body>
<%@ taglib prefix="riyaz" uri="http://java.sun.com/jsp/jstl/core" %>
<h1>JSTL Demo 2 page</h1>
<riyaz:set var="myown" value="${param.week }"></riyaz:set>

<riyaz:forEach var="yet" begin="1" end="10">
<h2>Zealous Tech Corp</h2>
</riyaz:forEach>

<riyaz:if test="${ myown >= 50 }">
<riyaz:out value="${'You are in end of the year '}"/>
</riyaz:if>

<form action="jstl3.jsp">
	<input type="number" name="weight" placeholder="Tell us weight to find your fight category">
	<input type="submit" value="Find">
</form>

</body>
</html>