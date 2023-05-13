<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Shoe Result</title>
<jsp:include page="bootstrapHead.jsp" />
</head>
<body>
	<jsp:include page="navbar.jsp" />
	<div class="container-fluid">
	<h2>Shoe Result:</h2>
	<c:choose>
		<c:when test="${! empty shoe}">
			<ul>
				<li>ID Number: ${shoe.id}</li>
				<li>Model: ${shoe.model}</li>
				<li>Name: ${shoe.name}</li>
				<li>Size: ${shoe.size}</li>
				<li>Purchase Date: ${shoe.purchaseDate}</li>
				<li>Current Value: ${shoe.value}</li>
				<li>Condition : ${shoe.used}</li>
			</ul>
			<br>
			<br>
			<a href="editShoe.do?id=${shoe.id}">Edit Shoe Details</a>
			<a href="deleteShoe.do?id=${shoe.id}">Delete Shoe</a>
		</c:when>
		<c:otherwise>
			<p>No shoe found.</p>
		</c:otherwise>
	</c:choose>
		</div>
		<jsp:include page="bootstrapFoot.jsp" />
</body>
</html>