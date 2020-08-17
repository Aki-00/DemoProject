<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
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
</style>
</head>
<body>
<!-- Table form -->
		<div class="table-wrapper">
			<div class="table-title">
				<div class="row">
					<div class="col-sm-8">
						<h2>
							 <b>Member List</b>
						</h2>
					</div>
				</div>
			</div>
			<table class="table table-bordered">
				<thead>
					<tr>
						<th>STT</th>
						<th>Ten</th>
						<th>Nam sinh</th>
						<th>Gioi tinh</th>	
						<th>SDT</th>					
					</tr>
					<tr>
						<th>1</th>
						<th><%= request.getParameter("name") %></th>
						<th><%= request.getParameter("birdYear") %></th>
						<th><%= request.getParameter("sex") %></th>	
						<th><%= request.getParameter("phone") %></th>					
					</tr>
				</thead>
				<tbody>
				</tbody>
			</table>
		</div>
		
<%-- <%! int id = 0; %>

<%
 id =++id; 
	String name =request.getParameter("name");
	String birdYear =request.getParameter("birdYear");
	String sex =request.getParameter("sex");
	String phone =request.getParameter("phone");
	
%>	 --%>
	
</body>
<!-- <script>
var id = 0;

 id =++id; 
	String name =request.getParameter("name");
	String birdYear =request.getParameter("birdYear");
	String sex =request.getParameter("sex");
	String phone =request.getParameter("phone");
	
$("tbody").append(
        "<tr>" +
        "<td>" + id + "</td>" +
        "<td>" + name  + "</td>" +
        "<td>" + birdYear + "</td>" +
        "<td>" + sex + "</td>" +
        "<td>" + phone + "</td>" +    
        "</tr>");
</script> -->

</html>