<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SignUP Page</title>
</head>
<body>
	<h3>${failureMsg}</h3>
	<form action = "signUp">
		<pre>
			User Id<input type = "text" name = "name"/>
			Email<input type = "text" name = "email">
			Password<input type = "text" name = "password">
			ConfirmPassword<input type = "text" name = "confirmPassword"/>
			<input type = "submit" value = "Sign Up"/>
		</pre>
	</form>
</body>
</html>