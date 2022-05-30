<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%String password = (String) request.getAttribute("passGen"); %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Password Generated</title>
</head>
<body>
Your Generated Password is: <%= password%>
</body>
</html>