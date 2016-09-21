<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Add User Pagesssssss</h1>
	
	<form method="post" id="studentForm" action="/spring/user/addUser.do">
	<label>First Name</label>
	<input type="text" name="firstname" /> <br /> <br />
	<label>Last Name</label>
	<input type="text" name="lastname" /> <br /> <br />
	<label>Phone </label>
	<input type="text" name="phone" /> <br /> <br />
	<label>Salary</label>
	<input type="text" name="salary" /> <br /> <br />
	<input type="submit" id="userSaveBtn" value="save" />
	</form>	
	
</body>
</html>