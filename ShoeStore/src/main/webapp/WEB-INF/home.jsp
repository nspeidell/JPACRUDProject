<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome to the shoe store</h1>
<a href="idForm.html">Lookup shoe by ID</a><br/>
<a href="updateForm.html">Update shoe</a><br/>
<a href="newShoe.html">Add a Shoe</a><br/>

${shoeInventory}
</body>
</html>