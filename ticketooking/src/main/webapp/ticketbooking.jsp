<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ticket Booking</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-Mox3YfnYd7+3x/5uDzxqPf9+V4hJq5pXG5eONQhJZPLb5+1z0nS5zF13TtA5C7Lw"
	crossorigin="anonymous">
<style>
.booking-form-container {
	max-width: 500px;
	margin: 50px auto;
	padding: 20px;
	border: 1px solid #ccc;
	border-radius: 8px;
	background-color: #f9f9f9;
}

.form-heading {
	text-align: center;
	margin-bottom: 20px;
	color: #333;
}
</style>
</head>
<body>
	<div class="container booking-form-container">
		<!-- Display failure message if present -->
		<div class="text-danger">${failure}</div>

		<h3 class="form-heading">Ticket Booking</h3>

		<form action="book" method="post">
			<!-- Stadium Name Field -->
			<div class="form-group">
				<label for="stadiumName">Stadium Name</label> <select
					class="form-control" name="statiumName" id="stadiumName">
					<option value="">Select a stadium...</option>
					<option>Others.....</option>
					<option>Wembley Stadium</option>
					<option>Camp Nou</option>
					<option>Chinnaswamy</option>
					<option>Stade de France</option>
					<option>Lusail Iconic Stadium</option>
					<option>Mercedes-Benz Stadium</option>
				</select>
			</div>

			<!-- Ticket Field -->
			<div class="form-group">
				<label for="noOfTicket">Ticket</label> <input type="text"
					class="form-control" id="noOfTicket" name="noOfTicket"
					value="${dto.noOfTicket}" placeholder="Enter number of tickets">
			</div>

			<!-- Primary Contact Field -->
			<div class="form-group">
				<label for="contact">Primary Contact</label> <input type="text"
					class="form-control" id="contact" name="contact"
					value="${dto.contact}" placeholder="Enter primary contact name">
			</div>

			<!-- Email Field -->
			<div class="form-group">
				<label for="email">Email</label> <input type="email"
					class="form-control" id="email" name="email" value="${dto.email}"
					placeholder="Enter email">
			</div>

			<!-- Submit Button -->
			<button type="submit" class="btn btn-primary btn-block">Book</button>
		</form>
	</div>

	<!-- Bootstrap JS and dependencies (optional) -->
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
		integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-pzjw8f+ua7Kw1TIqkD2YRhj8woN3bmAT1jyPC+8lFIulcrD0MI6EGiNfqI5Ttck+"
		crossorigin="anonymous"></script>
</body>
</html>
