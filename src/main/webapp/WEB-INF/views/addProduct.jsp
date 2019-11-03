<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add_Product</title>
</head>
<body>

	<form:form modelAttribute="productobj" action="addproductformresponse"
		method="post">
		<form:input path="productCategory" /><br>
		<form:input path="productCondition"  /><br>
		<form:input path="productManufacturer"  /><br>
		<form:input path="productName"  /><br>
		<form:input path="productPrice"  /><br>
		<form:input path="productStatus"  /><br>
		<form:input path="unitsInStock"  /><br>
		<form:input path="productDescription"/><br>

		<input type="submit" value="addproduct" />

	</form:form>






</body>
</html>