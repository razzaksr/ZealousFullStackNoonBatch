<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL Demo 3</title>
</head>
<body>
<%@ taglib prefix="aravind" uri="http://java.sun.com/jsp/jstl/core" %>
<aravind:set var="wt" value="${param.weight }"></aravind:set>
<aravind:choose>
	<aravind:when test="${wt ge 40 and wt lt 60}">
		<aravind:out value="${wt} is fether weight "/>
	</aravind:when>
	<aravind:when test="${wt ge 60 and wt lt 80}">
		<aravind:out value="${wt} is light weight"/>
	</aravind:when>
	<aravind:when test="${wt ge 80 and wt lt 150}">
		<aravind:out value="${wt} is heavy weight"/>
	</aravind:when>
	<aravind:when test="${wt ge 150 and wt lt 250}">
		<aravind:out value="${wt} is super heavy weight"/>
	</aravind:when>
	<aravind:otherwise>
		<aravind:out value="${wt} is not match with any category"/>
	</aravind:otherwise>
</aravind:choose>
</body>
</html>