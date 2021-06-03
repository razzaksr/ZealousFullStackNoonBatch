<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP Action Two</title>
</head>
<body>
<jsp:useBean id="pro" class="hai.Product"></jsp:useBean>
<jsp:setProperty name="pro" property="*"></jsp:setProperty>

<h1><jsp:getProperty name="pro" property="name"></jsp:getProperty></h1>
<h1><jsp:getProperty name="pro" property="price"></jsp:getProperty></h1>
<h1><jsp:getProperty name="pro" property="qty"></jsp:getProperty></h1>
<h1><jsp:getProperty name="pro" property="netwt"></jsp:getProperty></h1>
<a href="action3.jsp">Three</a>
</body>
</html>