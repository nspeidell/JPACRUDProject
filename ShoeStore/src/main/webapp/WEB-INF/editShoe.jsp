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
		<p>Shoe ID: ${shoe.id}</p>
  <form action="SubmitEditShoe.do?${shoe.id}" method="POST">
    <label for="model">Model:</label>
    <input type="text" name="model" required>
    <input type="hidden" name="id" value="${shoe.id}" >
    <br>
    <label for="name">Name:</label>
    <input type="text" value="${shoe.name}" name="name" required>
    <br>
    <label for="size">Size:</label>
    <input type="number" name="size" required>
    <br>
    <label for="purchaseDate">Purchase Date:</label>
    <input type="text" name="purchaseDate" >
    <br>
    <label for="value">Value:</label>
    <input type="number" name="value" required>
    <br>
    <label for="used">Status: </label>
    <input type="text"  name="used" required>
    <br>
    <input type="submit" value="Edit Shoe">
  </form>
  		<jsp:include page="bootstrapFoot.jsp" />
</body>
</html>