<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SQL Tags</title>
<style>
td
{
text-align:center;
}
td:hover
{
font-size:20px;
color:blue;
background-color:black;
}
</style>
</head>
<body>
<%@ taglib prefix="arun" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="aravind" uri="http://java.sun.com/jsp/jstl/sql" %>
<aravind:setDataSource var="db" driver="com.mysql.cj.jdbc.Driver" url="jdbc:mysql://localhost:3306/placement_buddy" user="root" password=""/>
<aravind:query var="qry" dataSource="${db}" sql="select * from companies"/>
<table border="4px">
<thead>
<tr>
<th>Company visited ID</th><th>Company Name</th><th>Company visited Date</th><th>Company required role</th>
<th>Company required count</th><th>Company offered package</th><th>Company Hired</th><th>Company short listed</th>
</tr>
</thead>
<tbody>
<arun:forEach var="one" items="${qry.rows }">
<tr>
<td>${one.id }</td><td>${one.org }</td><td>${one.date }</td><td>${one.role }</td><td>${one.required }</td>
<td>${one.packages }</td><td>${one.taken }</td><td>${one.whom }</td>
</tr>
</arun:forEach>
</tbody>
</table>
</body>
</html>