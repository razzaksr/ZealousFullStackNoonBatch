<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Implicit Demo 2</title>
</head>
<body>
<%this.log("User came @ Implicit 2 page");
out.print(config.getInitParameter("transaction"));
out.print("<p>"+ application.getInitParameter("ORG") +"</p>");
out.print("<p>"+pageContext.getAttribute("alpha",PageContext.PAGE_SCOPE)+"</p>");
out.print("<p>"+pageContext.getAttribute("beta",PageContext.APPLICATION_SCOPE)+"</p>");%>
</body>
</html>