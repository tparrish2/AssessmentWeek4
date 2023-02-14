<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Truth or Dare</title>
</head>
<body>
	<h1>Truth or Dare</h1>
	<form action="getTruthDareServlet" method="post">
	Pick Truth or Dare:
	<input type="submit" name="theButton" value="Truth" >
	<input type="submit" name="theButton" value="Dare" >
	</form>
</body>
</html>