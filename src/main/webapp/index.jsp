<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Addition Calculator</title>
</head>
<body>
	<h1>Addition Calculator</h1>
	<form action="getAdditionServlet" method="post">
	Enter the first number to add:
	<input type="text" name="firstNumber" size="10">
	<br>Enter the second number to add:
	<input type="text" name="secondNumber" size="10">
	<br>
	<input type="submit" value="Add Numbers">
	</form>
</body>
</html>