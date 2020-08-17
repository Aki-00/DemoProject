<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ex1.Q4</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round|Open+Sans">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/icon?family=Material+Icons">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<style>
	.table-wrapper {
    width: 700px;
    margin: 30px auto;
    background: #fff;
    padding: 20px;
    box-shadow: 0 1px 1px rgba(0, 0, 0, .05);
}

.table-title {
    padding-bottom: 10px;
    margin: 0 0 10px;
}

table.table tr th,
table.table tr td {
    border-color: #e9e9e9;
}
.inputForm{
width: 200px;
    margin: 30px auto;
    background: #fff;
    padding: 20px;
    box-shadow: 0 1px 1px rgba(0, 0, 0, .05);
    position: right;
}

	</style>
</head>
<body>

	<!-- Table form -->
		<div class="table-wrapper">
			<div class="table-title">
				<div class="row">
					<div class="col-sm-8">
						<h2>
							 <b>Product List</b>
						</h2>
					</div>
				</div>
			</div>
			<table class="table table-bordered">
				<thead>
					<tr>
						<th>STT</th>
						<th>Ten VXL</th>
						<th>Hãng</th>
						<th>Ngày ra mắt</th>
						<th>Giá</th>
					</tr>
				</thead>
				<tbody>
				</tbody>
			</table>
		</div>
		<!-- Input form -->


			<form class="inputForm">
				<!-- <label for="STT"><b>STT</b></label> 
			<input type="hidden" name="STT"
				id="stt" required> -->
				<label for="name"><b>Ten VXL</b></label> 
				<br>
				 <input type="text" name="name" id="name" required> 
				 <br>
				<label for="maker"><b>Hang</b></label> <br> <input type="text"
					name="maker" id="maker" required> <br> <label
					for="sellDate"><b>Ngay ra mat</b></label> <br> <input
					type="date" name="sellDate" id="sellDate" required> <br>
				<label for="price"><b>Gia</b></label> <br>
				<input type="text" name="price" id="price" required> <br>
				<br>

				<button type="button" onclick="cancel()">Cancel</button>
				<button type="button" onclick="save()">Save</button>
		
		</form>
		<hr>
	<form action="index.jsp">
	<input type="submit" id="back" name="back" value="Back to index">
	</form>
</body>
<script>
function cancel(){
	$("#name").val("");
	$("#maker").val("");
	$("#sellDate").val("");
	$("#price").val("");
	
}
var id = 0;
function save(){
	
	id =++id; 
	var name = $("#name").val(); 
	var maker = $("#maker").val();
	var sellDate = $("#sellDate").val();
	var price = $("#price").val();
	$("tbody").append(
            "<tr>" +
            "<td>" + id + "</td>" +
            "<td>" + name  + "</td>" +
            "<td>" + maker + "</td>" +
            "<td>" + sellDate + "</td>" +
            "<td>" + price + "</td>" +    
            "</tr>");
}
</script>
</html>