<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add_Product</title>
<!-- Bootstrap core CSS -->
<link href="<c:url value="/resources/css/bootstrap.min.css"/>"
	rel="stylesheet">

<!-- Custom styles for this template -->
<link href="<c:url value="/resources/css/carousel.css" />"
	rel="stylesheet">
</head>
<body>


	<p>Fill all the details to Add the product</p>


	<form:form action="addproductformresponse2" method="POST"
		modelAttribute="productobj" enctype="multipart/form-data">



		<div class="form-group">
			<label for="product-name">Product Name</label>
			<form:input class="form-control" path="productName"
				placeholder="Enter Product name" />
		</div>

		<div class="form-group">
			<label for="product-category">Product Category</label>
			<form:input class="form-control" path="productCategory"
				placeholder="Enter Product Category" />
		</div>


		<div class="form-group">
			<label for="product-Description">Product Description</label>
			<form:input class="form-control" path="productDescription"
				placeholder="Enter Product Description" />
		</div>


		<div class="form-group">
			<label for="product-Price">Product Price</label>
			<form:input class="form-control" path="productPrice"
				placeholder="Enter Product Price" />
		</div>

		<div class="form-group">
			<label for="product-Condition">Product Condition</label>
			<form:input class="form-control" path="productCondition"
				placeholder="Enter Product Condition" />
		</div>

		<div class="form-group">
			<label for="product-Status">Product Status</label>
			<form:input class="form-control" path="productStatus"
				placeholder="Enter Product Status" />
		</div>

		<div class="form-group">
			<label for="instock">Units in Stock</label>
			<form:input class="form-control" path="unitsInStock"
				placeholder="Enter units in stock" />
		</div>

		<div class="form-group">
			<label for="manufacturer">Product Manufacturer</label>
			<form:input class="form-control" path="productManufacturer"
				placeholder="Enter ProductManufacturer" />
		</div>

	<div class="form-group">
			<label for="img">Product Image</label>
			<input type="file" name="file" />
		</div>


		<input type="submit" class="btn btn-primary" />




	</form:form>





</body>
</html>