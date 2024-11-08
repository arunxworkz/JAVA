<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Product Form</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
<link
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	rel="stylesheet">
<style>
body {
	background: linear-gradient(300deg, #00bfff, #ff4c68, #ef8172);
	background-size: 180% 180%;
	animation: gradient-animation 18s ease infinite;
}

.container {
	max-width: 500px;
	margin-top: 50px;
}

h1 {
	font-family: "Georgia", serif;
}

.form-group label {
	font-weight: bold;
}

.btn-custom {
	background-color: #007bff;
	color: white;
}

.btn-custom:hover {
	background-color: #0056b3;
}
</style>
</head>
<body>
	${success}
	${failure}
	<div class="container">
		<h1 class="text-center mb-4">Product Form</h1>
		<form action = "booking">
			<div class="form-group">
				<label for="companyName">Company Name</label> <input type="text"
					class="form-control" id="companyName" name="companyName" value = "${failureMsg.companyName}"
					placeholder="Enter the company name" >
			</div>
			<div class="form-group">
				<label for="productName">Product Name</label> <input type="text"
					class="form-control" id="productName" name="productName" value = "${failureMsg.productName}"
					placeholder="Enter the product name" >
			</div>
			<div class="form-group">
				<label for="productType">Product Type</label> <select
					class="form-control" id="productType" name="productType"  value = "${failureMsg.productType}">
					<option value="" disabled selected>Select a product
						type...</option>
					<option value="furniture">Furniture</option>
					<option value="kitchenware">Kitchenware</option>
					<option value="bedding">Bedding</option>
					<option value="books">Books</option>
					<option value="clothing">Clothing</option>
					<option value="shoes">Shoes</option>
					<option value="toys">Toys</option>
					<option value="sportingGoods">Sporting Goods</option>
					<option value="groceries">Groceries</option>
					<option value="stationery">Stationery</option>
					<option value="petSupplies">Pet Supplies</option>
					<option value="beautyProducts">Beauty Products</option>
				</select>
			</div>
			<div class="form-group">
				<label for="quantity">Quantity</label> <input type="number"
					class="form-control" id="quantity" name="quantity" value = "${failureMsg.quantity}"
					placeholder="Enter the quantity" >
			</div>
			<div class="form-group">
				<label for="cost">Cost</label> <input type="number"
					class="form-control" id="cost" name="cost" value = "${failureMsg.cost}"
					placeholder="Enter the cost" step="0.01" >
			</div>
			<button type="submit" class="btn btn-custom btn-block">Submit</button>
		</form>
	</div>
</body>
</html>
