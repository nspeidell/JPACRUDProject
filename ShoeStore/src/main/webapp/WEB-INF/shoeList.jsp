<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Shoe List</title>
<jsp:include page="bootstrapHead.jsp" />
</head>
<body>
	<jsp:include page="navbar.jsp" />
	<div class="container-fluid">
		<h1>Shoe List</h1>


		<table class="table table-striped table-hover">
			<thead>
				<tr>
<!-- 					<th>Shoe Id</th> -->
					<th>Model</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="shoe" items="${shoeList}">
					<tr>
<%-- 						<td>${shoe.id }</td> --%>
						<td><a href="GetShoeData.do?idLookup=${shoe.id}">${shoe.model}</a></td>
						</td>
						<td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	<jsp:include page="bootstrapFoot.jsp" />
</body>
</html>