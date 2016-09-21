<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:set var="ctx" value="${pageContext.request.contextPath}" />

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Search User Pages</h1>

	<table id="userResultsTbl" border="1px solid black">
		<tr>
			<th>id</th>
			<th>Firstname</th>
			<th>Lastname</th>
			<th>Phone number</th>
			<th>Salary</th>
			<th>Actions</th>
		</tr>
		<c:forEach var="student" items="${students}">
			<tr>
				<td>${student.id}</td>
				<td>${student.firstname}</td>
				<td>${student.lastname}</td>
				<td>${student.phone}</td>
				<td>${student.salary}</td>
				<td><a href="">Edit student</a> <br /> <a
					href="${ctx}/user/deleteUser.page?studentId=${student.id}">Delete
						student</a></td>
			</tr>
		</c:forEach>
</body>
</html>