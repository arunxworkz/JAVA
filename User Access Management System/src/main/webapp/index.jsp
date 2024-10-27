<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
<link rel="icon" href="">
<title>Home Page</title>
<style>
	.container{
		display:flex;
		justify-content:center;
		align-items:center;	
		height:100vh;
	}
	
	.heading{
		margin-bottom:10px;
		font-family: cursive;
	}
	
	.signUp{
		margin-bottom:1ic;
		margin-left:1ic;
	}
	
	.login{
		margin-left:1.5ic;
	}
	
</style>
</head>
<body>
<div class = "container">
	<form>
		<div class = "heading">
			<h1>Register</h1>
		</div>
		<div class = "signUp"><!-- If we are using the button to go for next page and we are using script 
								then type attribute value should be 'button' in button tag and onclik attribute should be used.-->
			<button class="btn btn-primary rounded-pill px-3" type = "button" onclick = "signUp()" id = "signup">Sign UP</button>
		</div>
		<div class = "login">
			<button class="btn btn-success rounded-pill px-3" type = "button" onclick = "login1()" id = "login">Login</button>
		</div>
	</form>
</div>	

<script>
	function signUp(){
		window.location.href = "signup.jsp";
	}
	
	function login1(){
		window.location.href = "login1.jsp";
	}
</script>
</body>
</html>