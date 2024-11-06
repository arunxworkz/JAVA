<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
	.container{
		display:flex;
		justify-content:center;
		align-items:center;
		flex-direction:column;
		height:50vh;
	}
	
	.company-name{
		padding:10px;
		font-family: "Georgia", serif;
	}
	
	.product-names{
		padding:10px;
		font-family: "Georgia", serif;
	}
	
	.product-type{
		padding:10px;
		font-family: "Georgia", serif;
	}
	
	.quantity{
		padding:10px;
		font-family: "Georgia", serif;		
	}
	
	.cost{
		padding:10px;
		font-family: "Georgia", serif;
	}
	
	input{
		padding:5px;
		margin-left:10px;
		border-radius:3px;
	}
	
	select{
		margin-left:10px;
	}
</style>
<body>
	<h1 style = "text-align:center">Product Form</h1>
	<div class = "container">
			<form>
				<div class = "company-name">
					<label>Company Name</label>
					<input type = "text" name = "companyName" placeholder = "enter the company name"/>
				</div>
				<div class = "product-names">
					<label>Product Name</label>
					<input type = "text" name = "productName" placeholder = "enter the product name">
				</div>
				<div class = "product-type">
					<label>Product Type</label>
					<select name = "productType">
						<option>Others....</option>
						<option vlaues="furniture">Furniture</option>
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
				<div class = "quantity">
					<label>Quantity</label>
					<input type = "text" name = "quantity" placeholder = "enter the quantity"/>
				</div>
				
				<div class = "cost">
					<label>Cost</label>
					<input type = "text" name = "cost" placeholder = "enter the cost"/>
				</div>
			</form>
	</div>
</body>
</html>

