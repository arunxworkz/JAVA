<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
	<link
		href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
		rel="stylesheet"
		integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
		crossorigin="anonymous">
<style>
	.checkBoxes{
		display: flex;
		flex-direction: row;
		gap:2rem;
	}
	
	.container{
		display:flex;
		justify-content:center;
		align-items:enter;
		flex-direction:column;
		height:100vh;
	
	}
</style>
</head>
<body>
	<div class = "container">	
		<form>
			<h1 class="h3 mb-3 fw-normal">Please sign in</h1>
	
			<div class="form-floating">
				<input type="text" class="form-control" id="floatingInput"
					placeholder="user name" fdprocessedid="i1zzg"> <label
					for="floatingInput">User Name</label>
			</div><br>
			<div class="form-floating">
				<input type="password" class="form-control" id="floatingPassword"
					placeholder="Password" fdprocessedid="sh7rq"> <label
					for="floatingPassword">Password</label>
			</div>
			
			<div class = "checkBoxes">
				<div class="form-check text-start my-3">
					<input class="form-check-input" type="checkbox" value="read"
						name = "read"	id="flexCheckDefault"> <label class="form-check-label"
						for="flexCheckDefault"> Read </label>
				</div>
				
				<div class="form-check text-start my-3">
					<input class="form-check-input" type="checkbox" value="write"
						name = "write"	id="flexCheckDefault"> <label class="form-check-label"
						for="flexCheckDefault"> Write </label>
				</div>
				
				<div class="form-check text-start my-3">
					<input class="form-check-input" type="checkbox" value="admin"
						name = "admin"	id="flexCheckDefault"> <label class="form-check-label"
						for="flexCheckDefault"> Admin </label>
				</div>
			</div>
			
			<button class="btn btn-primary w-100 py-2" type="submit"
				fdprocessedid="ck1o3c">Sign in</button>
		</form>
	</div>
</body>
</html>