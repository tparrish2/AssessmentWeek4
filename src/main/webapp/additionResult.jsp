<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Addition Results</title>
</head>
<body>
	<p>${userNumAddition.getFirstNumber()} + ${userNumAddition.getSecondNumber()} equals: <br>
	${userNumAddition.getNumberSum()}
	</p>
	<a href="index.jsp">Select new addition</a>
</body>
</html>