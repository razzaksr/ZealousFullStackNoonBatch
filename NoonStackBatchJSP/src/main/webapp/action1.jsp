<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP Action tags</title>
</head>
<body>
<jsp:include page="implicit1.jsp"></jsp:include>
<form action="action2.jsp">
<input type="text" name="name" placeholder="Enter product name">
<input type="number" name="price" placeholder="Enter product Price">
<input type="number" name="qty" placeholder="Enter product stock">
<input type="number" name="netwt" placeholder="Enter product net weight">
<input type="submit" value="Add Stock">
</form>
</body>
</html>