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
<style>
	.container{
		display:flex;
		justify-content:center;
		align-items:center;
		fles-direction:column;
	}
</style>
<title>Admin Page</title>
</head>
<body>

	<div class = "container">
		<div class="row g-3">
	            <div class="col-sm-6">
	              <label for="name" class="form-label">Name</label>
	              <input type="text" class="form-control" id="firstName" placeholder="enter the name" name = "userName" value="" required="" fdprocessedid="36fgqds">
	            </div>
	
	            <div class="col-sm-6">
	              <label for="password" class="form-label">Password</label>
	              <input type="password" class="form-control" id="password" placeholder="enter the password" name  = "password" value="" required="" fdprocessedid="z1b0ux">
	            </div>
	     </div>
	</div>
	
</body>
</html>