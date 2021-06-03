<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP Action Tag Three</title>
</head>
<body>
<% this.log("Action three invoked");%>
<jsp:forward page="action4.jsp">
	<jsp:param name="technology" value="Deep learning"/>
</jsp:forward>
</body>
</html>