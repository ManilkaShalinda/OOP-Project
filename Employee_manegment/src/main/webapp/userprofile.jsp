<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<table>

	<c:forEach var="emp" items="${empDetails}">
	
	<tr>
		<td>Employee ID</td>
		<td>${emp.id}</td>
	</tr>
	<tr>
		<td>Employee Name</td>
		<td>${emp.name}</td>
	</tr>
	<tr>
		<td>Employee Address</td>
		<td>${emp.address}</td>
	</tr>
	<tr>
		<td>Employee Phone Number</td>
		<td>${emp.phone_no}</td>
	</tr>
	<tr>
		<td>Gender</td>
		<td>${emp.gender}</td>
	</tr>
	<tr>
		<td>Employee Age</td>
		<td>${emp.age}</td>
	</tr>
	<tr>
		<td>Employee Department</td>
		<td>${emp.department}</td>
	</tr>
	<tr>
		<td>User Name</td>
		<td>${emp.username}</td>
	</tr>
	<tr>
		<td>Password</td>
		<td>${emp.password}</td>
	</tr>
	
	
	</c:forEach>
	
	</table>
	
</body>
</html>