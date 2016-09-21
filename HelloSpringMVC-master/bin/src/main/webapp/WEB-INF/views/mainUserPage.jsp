<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:set var="ctx" value="${pageContext.request.contextPath}" />

<c:if test="${empty mainPageUrl}">
	<c:set var="mainPageUrl" value="homeDefault.jsp" />
</c:if>

<html>
<head>
<script
	src="//ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
<script type="text/javascript">
	$(function() {

		$("#add").click(function() {
			$("#mainDiv").load("${ctx}/user/addUser.page");

		});
	});

	$(function() {
		$("#search").click(function() {
			$("#mainDiv").load("${ctx}/user/searchUser.page");
		});
	});
</script>
</head>
<body>

	<h1>Welcome: ${welcomeUser.username}</h1>

	<input type="button" id="add" value="Add user" />
	<input type="button" id="search" value="Search users" />

	<div id="mainDiv">
		<c:import url="${mainPageUrl}" />
	</div>

</body>
</html>