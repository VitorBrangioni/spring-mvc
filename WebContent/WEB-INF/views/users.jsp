<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Users List</title>
<link href="<c:url value="resources/css/bootstrap.min.css"/>" rel="stylesheet" type="text/css">
</head>
<body class="container">

	<h2>Users List</h2>

	<table class="table">
		<tr>
			<th>Name</th>
			<th>Family Name</th>
			<th>CPF</th>
		</tr>
		<c:forEach items="${users}" var="user">
			<tr>
				<td>${user.name}</td>
				<td>${user.familyName}</td>
				<td>${user.cpf}</td>
			</tr>
		</c:forEach>
	</table>




</body>
</html>