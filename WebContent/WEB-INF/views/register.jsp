<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Register</title>
<link href="<c:url value="resources/css/bootstrap.min.css"/>" rel="stylesheet" type="text/css">
</head>
<body>
	
	<div class="container">
	<h2>Register</h2>
		<form action="register-post" method="POST">
			<div class="form-group">
				<div class="col-md-6">
					Name:
					<input type="text" name="name" class="form-control">
				</div>
				<div class="col-md-6">
					Family name:
					<input type="text" name="familyName" class="form-control">
				</div>
				<div class="col-md-6">
					cpf:
					<input type="text" name="cpf" class="form-control">
				</div>
				<div class="col-md-12">
					<input type="submit" name="sumit" value="Register" class="btn btn-primary">
				</div>
			</div>
		</form>
	</div>
	

</body>
</html>