<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL Demo 1</title>
</head>
<body>
<%@ taglib prefix="arun" uri="http://java.sun.com/jsp/jstl/core" %>
<arun:catch var="hai">
<%=100/0 %>
</arun:catch>
<arun:out value="${hai }"/>
<arun:set var="zealous" value="Salem" scope="page" ></arun:set>
<arun:remove var="zealous"/>
<arun:out value="${zealous }"/>
<arun:import url="jstl2.jsp">
	<arun:param name="week" value="42"/>
</arun:import>
</body>
</html>