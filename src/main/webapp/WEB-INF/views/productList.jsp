<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ include file="/WEB-INF/views/template/header.jsp"%>

<div class="container-wrapper">

	<div class="container">
		<div class="page-header">

			<h1>All products</h1>

			<p>Check out all the products available</p>




			<table class="table table-striped table-hover">
				<thead>

					<tr class="bg-info">

						<th scope="col">Product Thumb</th>
						<th scope="col">Product Name</th>
						<th scope="col">Product Category</th>
						<th scope="col">Product Condition</th>
						<th scope="col">Product Price</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${pl}" var="pl">
						<tr>
							<th scope="row"><img src="#" alt="img" /></th>
							<td>${pl.productName }</td>
							<td>${pl.productCategory }</td>
							<td>${pl.productCondition}</td>
							<td>${pl.productPrice}USD</td>

							<td><a href="<spring:url value="/viewProduct/${pl.productId}" />"
                    ><span class="glyphicon glyphicon-info-sign"></span></a></td>
							
						</tr>
					</c:forEach>
				</tbody>
			</table>



			<%@include file="/WEB-INF/views/template/footer.jsp"%>