<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ex1.Q5</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<style>
.inputForm{
width: 300px;
    margin: 30px auto;
    background: #fff;
    padding: 20px;
    box-shadow: 0 1px 1px rgba(0, 0, 0, .05);
    position: right;
}
</style>
</head>
<body>
		<form class="inputForm" action="Info.jsp">
				<label for="name"><b>Ho ten</b></label> 
				<br>
				 <input type="text" name="name" id="name" required> 
				 <br>
				<label for="birdYear"><b>Nam sinh</b></label> <br>
				 <input type="text"
					name="birdYear" id="birdYear" required> <br> 
				<label for="sex"><b>Gioi tinh</b></label> <br>	
					<input
					type="radio" name="sex" id="sex" value="Male" required>
					<label
					for="sex"><b>Male</b></label> 
					<input
					type="radio" name="sex" id="sex" value="Female" required>
					<label
					for="sex"><b>Female</b></label> <br> 
				<label for="phone"><b>SDT</b></label> <br>
				<input type="phone" name="phone" id="phone" required> <br>
				<br>

				<button type="button" onclick="cancel()">Cancel</button>
				<input type="submit" value ="Save">
		
		</form>
		<hr>
	<form action="index.jsp">
	<input type="submit" id="back" name="back" value="Back to index">
	</form>
</body>
<script>
function cancel(){
	$("#name").val("");
	$("#birdYear").val("");
	$("#sex").val("");
	$("#phone").val("");
	
}

</script>
</html>