<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Implicit objects</title>
</head>
<body>
<%
pageContext.setAttribute("alpha", "Salem",PageContext.PAGE_SCOPE);

this.log("User came @ Implicit 1 page");
String name="Aravind";
out.print("<h1>Welcome "+ name + " to Implicit Objects Demo</h1>"); 
out.print("<p>"+ application.getInitParameter("ORG") +"</p>");
out.print("<p>"+pageContext.getAttribute("alpha",PageContext.PAGE_SCOPE)+"</p>");
%>

<form action="implicit2.jsp">
	<%pageContext.setAttribute("beta", "Chennai",PageContext.APPLICATION_SCOPE); %>
	<%out.print("<p>"+pageContext.getAttribute("beta",PageContext.APPLICATION_SCOPE)+"</p>"); %>
	<input type="submit">
</form>

<a href="Mediator">Go to Servlet</a>

</body>
</html>