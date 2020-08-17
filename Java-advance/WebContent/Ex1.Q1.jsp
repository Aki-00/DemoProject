<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-latest.js"></script>
</head>
<body>
	<p>Cong tru nhan chia</p>
	<form action="Ketqua.jsp">
	<label for="number 1">Number 1</label>
	<input type="number" id="number1" name="number1">
	<br>
	<label for="number 2">Number 2</label>
	<input type="number" id="number2" name="number2">
	<br>
	<br>
	<input type="submit" id="add" name="button" value="+">
	<input type="submit" id="sub" name="button" value="-">
	<input type="submit" id="multi" name="button" value="*">
	<input type="submit" id="division" name="button" value="/">	
	</form>
	<br><br>
	<hr>
	<form action="index.jsp">
	<input type="submit" id="back" name="back" value="Back to index">
	</form>

</body>

</html>