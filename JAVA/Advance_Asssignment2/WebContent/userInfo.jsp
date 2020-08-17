<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Info</title>
<style>
header{
background-color: gray;
height: 20%;
}
.searchBox{
display:flex;
position:right;
}
nav{
position: center;
}
</style>
</head>
<body>
<header>
<h1>My Site</h1>
<div class="searchBox">
Search
<input type="text" name="searchBox" placehoder="Enter keyword">
</div>
</header>

<nav>
Home | Product List | My Account Info | Login
</nav>
<div>

	<h2> Hello</h2>
	<%= request.getParameter("username")%>

	
</div>
</body>
</html>