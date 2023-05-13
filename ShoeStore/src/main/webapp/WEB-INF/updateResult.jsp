<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta charset="UTF-8">
<title>Edit Results</title>
</head>
<body>
	<c:choose>
		<c:when test="${updated == true }">
			<p>Shoe edit successful</p>
		</c:when>
		<c:otherwise>
			<p>Shoe edit unsuccessful</p>
		</c:otherwise>
	</c:choose>
	<br>
	<a href="home.do">Return to Home Menu</a>
</body>
</html>