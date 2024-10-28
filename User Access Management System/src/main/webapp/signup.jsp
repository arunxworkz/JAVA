<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style>
		.container{
			displya:flex;
			justify-content:center;
			align-items:center;	
			height:100vh;
		}
		.signUpButton{
			width:100px;
			height:50px;
			display:flex;
			justify-content: center;
		    align-items: center;
		}
		#form{
			display:flex;
			flex-direction:column;
			justify-content:center;
			align-item:center;	
		}
</style>
</head>
<body>
	<div style = "margin-bottom:10px">
		<h1 style = "text-align:center">Register Her</h1>
	</div>	
	<div class = "container">
		<form action = "signup" method = "post">
		<h2>${success}</h2>
		<h2>${failure}</h2>
			<div class="row g-3" id = "form">
		            <div class="col-sm-6">
		              <label for="firstName" class="form-label">User name</label>
		              <input type="text" class="form-control" id="firstName" placeholder="Enter the user name" name = "userName" required="" fdprocessedid="09iui">
		            </div>
		            <div class="col-sm-6">
		              <label for="lastName" class="form-label">Password</label>
		              <input type="password" class="form-control" id="lastName" placeholder="enter the password" name = "password" required="" fdprocessedid="up8um">
		            </div>
		            <div class="col-sm-6">
		              <label for="lastName" class="form-label">Role</label>
		              <input type="text" class="form-control" id="role" placeholder="enter the role" name = "role" required="" fdprocessedid="up8um">
		            </div>
					<div class = "signUpButton">				
		            	<button class="btn btn-primary rounded-pill px-3" type="submit">Signup</button>	
		            </div>	
		     </div>
		</form>   
	</div>	  
	
</body>
</html>