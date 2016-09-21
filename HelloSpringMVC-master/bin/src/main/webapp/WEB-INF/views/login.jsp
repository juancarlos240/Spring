<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Login User</h1>

	<div id="my div">
		<h1>${userLogin.message}</h1>

		<form action="loginUser.do" method="post">
			<label>User Name</label> 
			<input type="text" name="username" /> <br /><br /> 
			<label>User Password</label> 
			<input type="password"name="password"> <br /> <br /> 
			<input type="submit" value="login" class="button">
		</form>
	</div>

</body>
</html>