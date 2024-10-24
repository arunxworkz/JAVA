<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Rnter your details</h1>
<h2>${success}</h2>
<h2>${failure}</h2>
<form action = "register" method = "post">
		Name<input type = "text" name = "name"/><br>
		Email<input type = "email" name = "email"/><br>
		Contact.No<input type = "text" name = "phnoNumber"><br>
		<input type = "submit" value = "Register">
</form>
</body>
</html>